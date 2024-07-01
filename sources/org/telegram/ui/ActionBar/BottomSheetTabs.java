package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.BotWebViewContainer;
import org.telegram.ui.bots.BotWebViewSheet;

public class BottomSheetTabs extends FrameLayout {
    private final ActionBarLayout actionBarLayout;
    private int backgroundColor;
    private AnimatedColor backgroundColorAnimated;
    private final Paint backgroundPaint;
    private boolean closeRippleHit;
    public int currentAccount;
    public boolean drawTabs;
    private final RectF rect;
    private int tabColor;
    private AnimatedColor tabColorAnimated;
    private AnimatedFloat tabDarkAnimated;
    public final HashMap<Integer, ArrayList<TabDrawable>> tabDrawables;
    private boolean tabIsDark;
    public final HashMap<Integer, ArrayList<WebTabData>> tabs;

    public static void lambda$onTouchEvent$7(Boolean bool) {
    }

    public BottomSheetTabs(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.drawTabs = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabDarkAnimated = new AnimatedFloat(this, 0L, 200L, cubicBezierInterpolator);
        this.currentAccount = UserConfig.selectedAccount;
        this.tabs = new HashMap<>();
        this.tabDrawables = new HashMap<>();
        this.rect = new RectF();
        this.actionBarLayout = actionBarLayout;
        setNavigationBarColor(Theme.getColor(Theme.key_windowBackgroundGray));
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheetTabs.this.lambda$new$0(view);
            }
        });
        updateMultipleTitle();
    }

    public void lambda$new$0(View view) {
        ArrayList<WebTabData> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        WebTabData webTabData = tabs.get(tabs.size() - 1);
        BottomSheetTabsOverlay bottomSheetTabsOverlay = LaunchActivity.instance.getBottomSheetTabsOverlay();
        if (size == 1 || bottomSheetTabsOverlay == null) {
            openTab(webTabData);
        } else {
            bottomSheetTabsOverlay.openTabsView();
        }
    }

    public void openTab(final WebTabData webTabData) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || lastFragment.getParentActivity() == null) {
            return;
        }
        boolean z = lastFragment instanceof ChatActivity;
        if (z) {
            ChatActivity chatActivity = (ChatActivity) lastFragment;
            if (chatActivity.getChatActivityEnterView() != null) {
                chatActivity.getChatActivityEnterView().closeKeyboard();
                chatActivity.getChatActivityEnterView().hidePopup(true, false);
            }
        }
        final boolean closeAttachedSheets = closeAttachedSheets();
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BottomSheetTabs.this.lambda$openTab$1(webTabData, closeAttachedSheets, (BaseFragment) obj);
            }
        };
        if (webTabData.needsContext && (!z || ((ChatActivity) lastFragment).getDialogId() != webTabData.props.botId)) {
            final ChatActivity of = ChatActivity.of(webTabData.props.botId);
            of.whenFullyVisible(new Runnable() {
                @Override
                public final void run() {
                    Utilities.Callback.this.run(of);
                }
            });
            lastFragment.presentFragment(of);
            return;
        }
        callback.run(lastFragment);
    }

    public void lambda$openTab$1(WebTabData webTabData, boolean z, BaseFragment baseFragment) {
        if (baseFragment == null) {
            return;
        }
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            if (chatActivity.getChatActivityEnterView() != null) {
                chatActivity.getChatActivityEnterView().closeKeyboard();
                chatActivity.getChatActivityEnterView().hidePopup(true, false);
            }
        }
        if (baseFragment.getContext() == null) {
            return;
        }
        if (AndroidUtilities.isTablet()) {
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(baseFragment.getContext(), baseFragment.getResourceProvider());
            botWebViewSheet.setParentActivity(baseFragment.getParentActivity());
            if (botWebViewSheet.restoreState(baseFragment, webTabData)) {
                removeTab(webTabData, false);
                botWebViewSheet.show();
                return;
            }
            return;
        }
        LaunchActivity.instance.getBottomSheetTabsOverlay();
        BotWebViewAttachedSheet createBotViewer = baseFragment.createBotViewer();
        createBotViewer.setParentActivity(baseFragment.getParentActivity());
        if (createBotViewer.restoreState(baseFragment, webTabData)) {
            removeTab(webTabData, false);
            createBotViewer.show(z);
        }
    }

    public WebTabData tryReopenTab(BotWebViewAttachedSheet.WebViewRequestProps webViewRequestProps) {
        ArrayList<WebTabData> arrayList = this.tabs.get(Integer.valueOf(this.currentAccount));
        if (arrayList == null) {
            HashMap<Integer, ArrayList<WebTabData>> hashMap = this.tabs;
            Integer valueOf = Integer.valueOf(this.currentAccount);
            ArrayList<WebTabData> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf, arrayList2);
            arrayList = arrayList2;
        }
        if (webViewRequestProps == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            WebTabData webTabData = arrayList.get(i);
            if (webViewRequestProps.equals(webTabData.props)) {
                openTab(webTabData);
                return webTabData;
            }
        }
        return null;
    }

    public boolean closeAttachedSheets() {
        BottomSheetTabsOverlay bottomSheetTabsOverlay = LaunchActivity.instance.getBottomSheetTabsOverlay();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        int i = 0;
        if (safeLastFragment == null) {
            return false;
        }
        boolean z = false;
        while (true) {
            ArrayList<BaseFragment.AttachedSheet> arrayList = safeLastFragment.sheetsStack;
            if (arrayList == null || i >= arrayList.size()) {
                break;
            }
            BaseFragment.AttachedSheet attachedSheet = safeLastFragment.sheetsStack.get(i);
            if (attachedSheet instanceof BotWebViewAttachedSheet) {
                if (bottomSheetTabsOverlay != null) {
                    bottomSheetTabsOverlay.setSlowerDismiss(true);
                }
                ((BotWebViewAttachedSheet) attachedSheet).dismiss(true, null);
                z = true;
            }
            i++;
        }
        return z;
    }

    public void setNavigationBarColor(int i) {
        setNavigationBarColor(i, true);
    }

    public void setNavigationBarColor(int i, boolean z) {
        if (i != this.backgroundColor) {
            ActionBarLayout actionBarLayout = this.actionBarLayout;
            if (!actionBarLayout.startedTracking || actionBarLayout.animationInProgress) {
                z = false;
            }
            this.backgroundColor = i;
            int blendOver = Theme.blendOver(i, Theme.multAlpha(-1, (AndroidUtilities.computePerceivedBrightness(i) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f));
            this.tabColor = blendOver;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(blendOver) < 0.721f;
            if (!z) {
                this.backgroundColorAnimated.set(this.backgroundColor, true);
                this.tabColorAnimated.set(this.tabColor, true);
                this.tabDarkAnimated.set(this.tabIsDark, true);
            }
            invalidate();
        }
    }

    public void updateCurrentAccount() {
        setCurrentAccount(UserConfig.selectedAccount);
    }

    public void setCurrentAccount(int i) {
        if (this.currentAccount != i) {
            this.currentAccount = i;
            this.actionBarLayout.updateBottomTabsVisibility(false);
            invalidate();
        }
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return AndroidUtilities.dp(60.0f);
        }
        return AndroidUtilities.dp(68.0f);
    }

    public ArrayList<WebTabData> getTabs() {
        ArrayList<WebTabData> arrayList = this.tabs.get(Integer.valueOf(this.currentAccount));
        if (arrayList != null) {
            return arrayList;
        }
        HashMap<Integer, ArrayList<WebTabData>> hashMap = this.tabs;
        Integer valueOf = Integer.valueOf(this.currentAccount);
        ArrayList<WebTabData> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf, arrayList2);
        return arrayList2;
    }

    public ArrayList<TabDrawable> getTabDrawables() {
        ArrayList<TabDrawable> arrayList = this.tabDrawables.get(Integer.valueOf(this.currentAccount));
        if (arrayList != null) {
            return arrayList;
        }
        HashMap<Integer, ArrayList<TabDrawable>> hashMap = this.tabDrawables;
        Integer valueOf = Integer.valueOf(this.currentAccount);
        ArrayList<TabDrawable> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf, arrayList2);
        return arrayList2;
    }

    public TabDrawable findTabDrawable(WebTabData webTabData) {
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabDrawables.size(); i++) {
            if (tabDrawables.get(i).tab == webTabData) {
                return tabDrawables.get(i);
            }
        }
        return null;
    }

    public TabDrawable pushTab(WebTabData webTabData) {
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        TabDrawable tabDrawable = new TabDrawable(this, webTabData);
        tabDrawable.animatedPosition.set(-1.0f, true);
        tabDrawable.animatedAlpha.set(0.0f, true);
        tabDrawables.add(tabDrawable);
        tabs.add(0, webTabData);
        for (int i = 0; i < tabDrawables.size(); i++) {
            TabDrawable tabDrawable2 = tabDrawables.get(i);
            int indexOf = tabs.indexOf(tabDrawable2.tab);
            tabDrawable2.index = indexOf;
            if (indexOf >= 0) {
                tabDrawable2.position = indexOf;
            }
        }
        updateMultipleTitle();
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return tabDrawable;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }

    private void updateMultipleTitle() {
        String userName;
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        String str = null;
        for (int i = 0; i < tabDrawables.size(); i++) {
            TabDrawable tabDrawable = tabDrawables.get(i);
            if (tabs.size() > 1 && tabDrawable.position == 0) {
                userName = LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, UserObject.getUserName(MessagesController.getInstance(tabDrawable.tab.props.currentAccount).getUser(Long.valueOf(tabDrawable.tab.props.botId))));
                tabDrawable.setOverrideTitle(userName);
            } else {
                userName = UserObject.getUserName(MessagesController.getInstance(tabDrawable.tab.props.currentAccount).getUser(Long.valueOf(tabDrawable.tab.props.botId)));
                tabDrawable.setOverrideTitle(null);
            }
            str = userName;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i2 = R.string.AccDescrTabs;
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        setContentDescription(LocaleController.formatString(i2, objArr));
    }

    public boolean removeAll() {
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabs.size(); i++) {
            tabs.get(i).destroy();
        }
        tabs.clear();
        for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
            tabDrawables.get(i2).index = -1;
        }
        updateMultipleTitle();
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return tabs.isEmpty();
    }

    public void removeTab(final WebTabData webTabData, final Utilities.Callback<Boolean> callback) {
        if (webTabData == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!webTabData.confirmDismiss) {
            removeTab(webTabData, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC$User user = MessagesController.getInstance(webTabData.props.currentAccount).getUser(Long.valueOf(webTabData.props.botId));
        final boolean[] zArr = {false};
        final AlertDialog[] alertDialogArr = {new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                BottomSheetTabs.this.lambda$removeTab$3(zArr, webTabData, callback, alertDialogArr, dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                BottomSheetTabs.lambda$removeTab$4(zArr, callback, alertDialogArr, dialogInterface, i);
            }
        }).create()};
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BottomSheetTabs.lambda$removeTab$5(zArr, callback, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        ((TextView) alertDialogArr[0].getButton(-1)).setTextColor(Theme.getColor(Theme.key_text_RedBold));
    }

    public void lambda$removeTab$3(boolean[] zArr, WebTabData webTabData, Utilities.Callback callback, AlertDialog[] alertDialogArr, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        removeTab(webTabData, true);
        callback.run(Boolean.TRUE);
        alertDialogArr[0].dismiss();
    }

    public static void lambda$removeTab$4(boolean[] zArr, Utilities.Callback callback, AlertDialog[] alertDialogArr, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        callback.run(Boolean.FALSE);
        alertDialogArr[0].dismiss();
    }

    public static void lambda$removeTab$5(boolean[] zArr, Utilities.Callback callback, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        zArr[0] = true;
    }

    public boolean removeTab(final WebTabData webTabData, boolean z) {
        ArrayList<WebTabData> tabs = getTabs();
        final ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        tabs.remove(webTabData);
        if (z) {
            webTabData.destroy();
        }
        for (int i = 0; i < tabDrawables.size(); i++) {
            TabDrawable tabDrawable = tabDrawables.get(i);
            int indexOf = tabs.indexOf(tabDrawable.tab);
            tabDrawable.index = indexOf;
            if (indexOf >= 0) {
                tabDrawable.position = indexOf;
            }
        }
        updateMultipleTitle();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BottomSheetTabs.this.lambda$removeTab$6(tabDrawables, webTabData);
            }
        }, 320L);
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return tabs.isEmpty();
    }

    public void lambda$removeTab$6(ArrayList arrayList, WebTabData webTabData) {
        int i = 0;
        while (i < arrayList.size()) {
            if (((TabDrawable) arrayList.get(i)).tab == webTabData) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        if (this.drawTabs) {
            WebTabData webTabData = tabs.isEmpty() ? null : tabs.get(0);
            TabDrawable findTabDrawable = findTabDrawable(webTabData);
            if (findTabDrawable != null) {
                getTabBounds(this.rect, findTabDrawable.getPosition());
                boolean contains = findTabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.rect.left), (int) (motionEvent.getY() - this.rect.centerY()));
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.closeRippleHit = contains;
                    findTabDrawable.closeRipple.setState(contains ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.closeRippleHit && motionEvent.getAction() == 1) {
                        removeTab(webTabData, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                BottomSheetTabs.lambda$onTouchEvent$7((Boolean) obj);
                            }
                        });
                    }
                    this.closeRippleHit = false;
                    findTabDrawable.closeRipple.setState(new int[0]);
                }
                for (int i = 0; i < tabDrawables.size(); i++) {
                    if (tabDrawables.get(i) != findTabDrawable) {
                        tabDrawables.get(i).closeRipple.setState(new int[0]);
                    }
                }
            } else {
                this.closeRippleHit = false;
            }
        }
        if (this.closeRippleHit) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.backgroundPaint);
        super.dispatchDraw(canvas);
        int i = this.tabColorAnimated.set(this.tabColor);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        if (this.drawTabs) {
            for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
                TabDrawable tabDrawable = tabDrawables.get(i2);
                float position = tabDrawable.getPosition();
                float alpha = tabDrawable.getAlpha();
                if (alpha > 0.0f && position <= 1.99f) {
                    getTabBounds(this.rect, position);
                    tabDrawable.setExpandProgress(0.0f);
                    tabDrawable.setBackgroundColor(i, f > 0.5f);
                    tabDrawable.draw(canvas, this.rect, AndroidUtilities.dp(10.0f), alpha, 1.0f);
                }
            }
        }
    }

    public void setupTab(TabDrawable tabDrawable) {
        int i = this.tabColorAnimated.set(this.tabColor);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        tabDrawable.setExpandProgress(0.0f);
        tabDrawable.setBackgroundColor(i, f > 0.5f);
    }

    public void getTabBounds(RectF rectF, float f) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f2 = (width / 2.0f) * lerp;
        rectF.left = centerX - f2;
        rectF.right = centerX + f2;
        float f3 = (height / 2.0f) * lerp;
        rectF.top = centerY - f3;
        rectF.bottom = centerY + f3;
    }

    public static class TabDrawable {
        public final AnimatedFloat animatedAlpha;
        public final AnimatedFloat animatedPosition;
        private int backgroundColor;
        private boolean backgroundIsDark;
        private final Paint backgroundPaint = new Paint(1);
        private final Path closePath;
        public final Drawable closeRipple;
        public int closeRippleColor;
        private final Path expandPath;
        private float expandProgress;
        private final Paint iconPaint;
        public int index;
        private Text overrideTitle;
        private int position;
        private final float[] radii;
        private final Path rectPath;
        public final WebTabData tab;
        private int tabColor;
        private boolean tabIsDark;
        private Text title;

        public TabDrawable(View view, WebTabData webTabData) {
            Paint paint = new Paint(1);
            this.iconPaint = paint;
            Drawable createSelectorDrawable = Theme.createSelectorDrawable(822083583, 1);
            this.closeRipple = createSelectorDrawable;
            this.radii = new float[8];
            this.rectPath = new Path();
            Path path = new Path();
            this.closePath = path;
            Path path2 = new Path();
            this.expandPath = path2;
            this.tab = webTabData;
            createSelectorDrawable.setCallback(view);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedPosition = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.animatedAlpha = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.title = new Text(UserObject.getUserName(MessagesController.getInstance(webTabData.props.currentAccount).getUser(Long.valueOf(webTabData.getBotId()))), 17.0f, AndroidUtilities.bold());
            int i = webTabData.actionBarColor;
            this.tabColor = i;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(i) < 0.721f;
            path.rewind();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            path.moveTo(AndroidUtilities.dp(12.0f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(12.0f));
            path2.rewind();
            path2.moveTo(0.0f, AndroidUtilities.dp(6.33f) / 2.0f);
            path2.lineTo(AndroidUtilities.dp(12.66f) / 2.0f, (-AndroidUtilities.dp(6.33f)) / 2.0f);
            path2.lineTo(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(6.33f) / 2.0f);
        }

        public void setOverrideTitle(String str) {
            if (str == null) {
                this.overrideTitle = null;
            } else {
                this.overrideTitle = new Text(str, 17.0f, AndroidUtilities.bold());
            }
        }

        public float getPosition() {
            return this.index < 0 ? this.position : this.animatedPosition.set(this.position);
        }

        public float getAlpha() {
            float min;
            float position = getPosition();
            if (position < 0.0f) {
                min = position + 1.0f;
            } else if (position >= 0.0f && position < 1.0f) {
                min = AndroidUtilities.lerp(1.0f, 0.87f, position);
            } else {
                min = (1.0f - Math.min(1.0f, position - 1.0f)) * 0.87f;
            }
            return min * this.animatedAlpha.set(this.index >= 0);
        }

        public void setBackgroundColor(int i, boolean z) {
            this.backgroundColor = i;
            this.backgroundIsDark = z;
        }

        public void setExpandProgress(float f) {
            this.expandProgress = f;
        }

        public void draw(Canvas canvas, RectF rectF, float f, float f2, float f3) {
            this.backgroundPaint.setColor(ColorUtils.blendARGB(this.backgroundColor, this.tabColor, this.expandProgress));
            float f4 = 255.0f * f2;
            this.backgroundPaint.setAlpha((int) f4);
            this.backgroundPaint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(268435456, f2));
            float[] fArr = this.radii;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            fArr[0] = f;
            float lerp = AndroidUtilities.lerp(f, 0.0f, this.expandProgress);
            fArr[7] = lerp;
            fArr[6] = lerp;
            fArr[5] = lerp;
            fArr[4] = lerp;
            this.rectPath.rewind();
            this.rectPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
            canvas.drawPath(this.rectPath, this.backgroundPaint);
            float lerp2 = AndroidUtilities.lerp(this.backgroundIsDark ? 1.0f : 0.0f, this.tabIsDark ? 1.0f : 0.0f, this.expandProgress);
            int blendARGB = ColorUtils.blendARGB(-16777216, -1, lerp2);
            this.iconPaint.setColor(blendARGB);
            this.iconPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.save();
            canvas.translate(rectF.left, rectF.centerY());
            int blendARGB2 = ColorUtils.blendARGB(553648127, 553648127, lerp2);
            this.closeRipple.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f));
            if (this.closeRippleColor != blendARGB2) {
                Drawable drawable = this.closeRipple;
                this.closeRippleColor = blendARGB2;
                Theme.setSelectorDrawableColor(drawable, blendARGB2, false);
            }
            this.closeRipple.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
            float f5 = f4 * f3;
            this.iconPaint.setAlpha((int) f5);
            canvas.drawPath(this.closePath, this.iconPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
            this.iconPaint.setAlpha((int) (f5 * (1.0f - this.expandProgress)));
            canvas.drawPath(this.expandPath, this.iconPaint);
            canvas.restore();
            Text text = this.overrideTitle;
            if (text != null) {
                text.ellipsize((int) (rectF.width() - AndroidUtilities.dp(100.0f))).draw(canvas, AndroidUtilities.dp(60.0f) + rectF.left, rectF.centerY(), blendARGB, (1.0f - this.expandProgress) * f2 * f3);
            }
            this.title.ellipsize((int) (rectF.width() - AndroidUtilities.dp(100.0f))).draw(canvas, AndroidUtilities.dp(60.0f) + rectF.left, rectF.centerY(), blendARGB, (this.overrideTitle != null ? this.expandProgress : 1.0f) * f2 * f3);
        }
    }

    public static class WebTabData {
        public int actionBarColor;
        public int actionBarColorKey;
        public boolean backButton;
        public int backgroundColor;
        public boolean confirmDismiss;
        public boolean expanded;
        public float expandedOffset = Float.MAX_VALUE;
        public boolean fullsize;
        public String lastUrl;
        public BotWebViewAttachedSheet.MainButtonSettings main;
        public boolean needsContext;
        public boolean overrideActionBarColor;
        public Bitmap previewBitmap;
        public Object previewNode;
        public BotWebViewAttachedSheet.WebViewRequestProps props;
        public boolean ready;
        public boolean settings;
        public boolean themeIsDark;
        public BotWebViewContainer.MyWebView webView;
        public int webViewHeight;
        public BotWebViewContainer.WebViewProxy webViewProxy;
        public int webViewScroll;
        public int webViewWidth;

        public long getBotId() {
            BotWebViewAttachedSheet.WebViewRequestProps webViewRequestProps = this.props;
            if (webViewRequestProps == null) {
                return 0L;
            }
            return webViewRequestProps.botId;
        }

        public void destroy() {
            try {
                BotWebViewContainer.MyWebView myWebView = this.webView;
                if (myWebView != null) {
                    myWebView.destroy();
                    this.webView = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
