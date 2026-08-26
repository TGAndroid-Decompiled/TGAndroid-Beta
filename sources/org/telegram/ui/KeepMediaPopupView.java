package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FiltersListBottomSheet;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ThemeEditorView;

public final class KeepMediaPopupView extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
    public final CacheByChatsController cacheByChatsController;
    public Callback callback;
    public final ArrayList checkItems;
    public int currentType;
    public final ActionBarMenuSubItem delete;
    public final LinkSpanDrawable.LinksTextView description;
    public ArrayList exceptions;
    public final ExceptionsView exceptionsView;
    public final FrameLayout gap;
    public final ActionBarMenuSubItem oneMonth;
    public final BaseFragment parentFragment;
    public final ActionBarMenuSubItem twoDay;

    public interface Callback {
        void onKeepMediaChange(int i);
    }

    public final class CheckItem {
        public final ActionBarMenuSubItem item;
        public final int type;

        public CheckItem(ActionBarMenuSubItem actionBarMenuSubItem, int i) {
            this.item = actionBarMenuSubItem;
            this.type = i;
        }
    }

    public KeepMediaPopupView(Context context, BaseFragment baseFragment) {
        super(R.drawable.popup_fixed_alert2, 0, context, null);
        ArrayList arrayList = new ArrayList();
        this.checkItems = arrayList;
        this.parentFragment = baseFragment;
        this.cacheByChatsController = baseFragment.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.twoDay = actionBarMenuSubItemAddItem2;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.oneMonth = actionBarMenuSubItemAddItem4;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem6 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.delete = actionBarMenuSubItemAddItem6;
        int i = Theme.key_text_RedRegular;
        int color = Theme.getColor(null, i, false);
        int color2 = Theme.getColor(null, i, false);
        actionBarMenuSubItemAddItem6.setTextColor(color);
        actionBarMenuSubItemAddItem6.setIconColor(color2);
        arrayList.add(new CheckItem(actionBarMenuSubItemAddItem, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new CheckItem(actionBarMenuSubItemAddItem2, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new CheckItem(actionBarMenuSubItemAddItem3, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new CheckItem(actionBarMenuSubItemAddItem4, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new CheckItem(actionBarMenuSubItemAddItem5, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new CheckItem(actionBarMenuSubItemAddItem6, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.gap = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuSeparator, false));
        View view = new View(context);
        view.setBackground(Theme.getThemedDrawable(context, R.drawable.greydivider, Theme.getColor(null, Theme.key_windowBackgroundGrayShadow, false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        this.linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 8));
        ExceptionsView exceptionsView = new ExceptionsView(this, context);
        this.exceptionsView = exceptionsView;
        this.linearLayout.addView(exceptionsView, LayoutHelper.createLinear(-1, 48));
        exceptionsView.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(18, this, baseFragment));
        for (int i2 = 0; i2 < this.checkItems.size(); i2++) {
            ((CheckItem) this.checkItems.get(i2)).item.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, ((CheckItem) this.checkItems.get(i2)).type, 15));
        }
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        this.description = linksTextView;
        linksTextView.setTag(R.id.fit_width_tag, 1);
        linksTextView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        linksTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
        linksTextView.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        this.linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public final void updateAvatarsPosition() {
        if (this.exceptions != null) {
            ((AvatarsImageView) this.exceptionsView.avatarsImageView).setTranslationX((3 - Math.min(3, this.exceptions.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final class ExceptionsView extends FrameLayout {
        public final int $r8$classId = 1;
        public Object avatarsImageView;
        public boolean ignoreLayout;
        public final KeyEvent.Callback this$0;
        public final Object titleView;

        public ExceptionsView(FiltersListBottomSheet filtersListBottomSheet, Activity activity) {
            super(activity);
            this.this$0 = filtersListBottomSheet;
            this.titleView = new RectF();
        }

        @Override
        public void onDraw(Canvas canvas) {
            float fMin;
            int iMin;
            boolean z;
            Boolean bool;
            boolean z2;
            boolean z3;
            float fMin2;
            int iMin2;
            RectF rectF;
            boolean z4;
            Boolean bool2;
            boolean z5;
            boolean z6;
            switch (this.$r8$classId) {
                case 1:
                    FiltersListBottomSheet filtersListBottomSheet = (FiltersListBottomSheet) this.this$0;
                    int iDp = (filtersListBottomSheet.scrollOffsetY - ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop) - AndroidUtilities.dp(8.0f);
                    getMeasuredHeight();
                    AndroidUtilities.dp(36.0f);
                    ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop;
                    int i = iDp + AndroidUtilities.statusBarHeight;
                    if (this.ignoreLayout) {
                        int i2 = ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop + i;
                        int i3 = AndroidUtilities.statusBarHeight;
                        int i4 = i3 * 2;
                        if (i2 < i4) {
                            int iMin3 = Math.min(i3, (i4 - i) - ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop);
                            i -= iMin3;
                            fMin = 1.0f - Math.min(1.0f, (iMin3 * 2) / AndroidUtilities.statusBarHeight);
                        } else {
                            fMin = 1.0f;
                        }
                        int i5 = ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop + i;
                        int i6 = AndroidUtilities.statusBarHeight;
                        iMin = i5 < i6 ? Math.min(i6, (i6 - i) - ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop) : 0;
                        ((BottomSheet) filtersListBottomSheet).shadowDrawable.setBounds(0, i, getMeasuredWidth(), getMeasuredHeight());
                        ((BottomSheet) filtersListBottomSheet).shadowDrawable.draw(canvas);
                        if (fMin != 1.0f) {
                            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                            RectF rectF2 = (RectF) this.titleView;
                            rectF2.set(((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop + i, getMeasuredWidth() - ((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop + i);
                            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                        }
                        if (iMin > 0) {
                            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                            canvas.drawRect(((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                        }
                        if (iMin > AndroidUtilities.statusBarHeight / 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bool = (Boolean) this.avatarsImageView;
                        if (bool != null || bool.booleanValue() != z) {
                            if (AndroidUtilities.computePerceivedBrightness(filtersListBottomSheet.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(filtersListBottomSheet.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                            this.avatarsImageView = Boolean.valueOf(z);
                            if (!z) {
                                z2 = z3;
                            }
                            AndroidUtilities.setLightStatusBar(filtersListBottomSheet.getWindow(), z2);
                        }
                    } else {
                        fMin = 1.0f;
                    }
                    ((BottomSheet) filtersListBottomSheet).shadowDrawable.setBounds(0, i, getMeasuredWidth(), getMeasuredHeight());
                    ((BottomSheet) filtersListBottomSheet).shadowDrawable.draw(canvas);
                    if (fMin != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        RectF rectF3 = (RectF) this.titleView;
                        rectF3.set(((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop + i, getMeasuredWidth() - ((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop + i);
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                    }
                    if (iMin > 0) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        canvas.drawRect(((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                    }
                    if (iMin > AndroidUtilities.statusBarHeight / 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = (Boolean) this.avatarsImageView;
                    if (bool != null) {
                    }
                    if (AndroidUtilities.computePerceivedBrightness(filtersListBottomSheet.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(Theme.blendOver(filtersListBottomSheet.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f) {
                    }
                    this.avatarsImageView = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    AndroidUtilities.setLightStatusBar(filtersListBottomSheet.getWindow(), z2);
                    break;
                case 2:
                default:
                    super.onDraw(canvas);
                    break;
                case 3:
                    ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.this$0;
                    int iDp2 = AndroidUtilities.dp(6.0f) + (editorAlert.scrollOffsetY - ((BottomSheet) editorAlert).backgroundPaddingTop);
                    int iDp3 = (editorAlert.scrollOffsetY - ((BottomSheet) editorAlert).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
                    int iDp4 = ((BottomSheet) editorAlert).backgroundPaddingTop + AndroidUtilities.dp(30.0f) + getMeasuredHeight();
                    if (!((BottomSheet) editorAlert).isFullscreen) {
                        int i7 = AndroidUtilities.statusBarHeight;
                        iDp3 += i7;
                        iDp2 += i7;
                        iDp4 -= i7;
                        int i8 = ((BottomSheet) editorAlert).backgroundPaddingTop + iDp3;
                        int i9 = AndroidUtilities.statusBarHeight;
                        int i10 = i9 * 2;
                        if (i8 < i10) {
                            int iMin4 = Math.min(i9, (i10 - iDp3) - ((BottomSheet) editorAlert).backgroundPaddingTop);
                            iDp3 -= iMin4;
                            iDp4 += iMin4;
                            fMin2 = 1.0f - Math.min(1.0f, (iMin4 * 2) / AndroidUtilities.statusBarHeight);
                        } else {
                            fMin2 = 1.0f;
                        }
                        int i11 = ((BottomSheet) editorAlert).backgroundPaddingTop + iDp3;
                        int i12 = AndroidUtilities.statusBarHeight;
                        iMin2 = i11 < i12 ? Math.min(i12, (i12 - iDp3) - ((BottomSheet) editorAlert).backgroundPaddingTop) : 0;
                        int measuredWidth = getMeasuredWidth();
                        Drawable drawable = editorAlert.shadowDrawable;
                        drawable.setBounds(0, iDp3, measuredWidth, iDp4);
                        drawable.draw(canvas);
                        rectF = (RectF) this.titleView;
                        if (fMin2 != 1.0f) {
                            Theme.dialogs_onlineCirclePaint.setColor(-1);
                            rectF.set(((BottomSheet) editorAlert).backgroundPaddingLeft, ((BottomSheet) editorAlert).backgroundPaddingTop + iDp3, getMeasuredWidth() - ((BottomSheet) editorAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) editorAlert).backgroundPaddingTop + iDp3);
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin2, AndroidUtilities.dp(12.0f) * fMin2, Theme.dialogs_onlineCirclePaint);
                        }
                        int iDp5 = AndroidUtilities.dp(36.0f);
                        rectF.set((getMeasuredWidth() - iDp5) / 2, iDp2, (getMeasuredWidth() + iDp5) / 2, AndroidUtilities.dp(4.0f) + iDp2);
                        Theme.dialogs_onlineCirclePaint.setColor(-1973016);
                        Theme.dialogs_onlineCirclePaint.setAlpha((int) (editorAlert.listView.getAlpha() * 255.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                        if (iMin2 > 0) {
                            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                            canvas.drawRect(((BottomSheet) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin2, getMeasuredWidth() - ((BottomSheet) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                        }
                        if (iMin2 > AndroidUtilities.statusBarHeight / 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bool2 = (Boolean) this.avatarsImageView;
                        if (bool2 != null || bool2.booleanValue() != z4) {
                            if (AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(editorAlert.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                            this.avatarsImageView = Boolean.valueOf(z4);
                            if (!z4) {
                                z5 = z6;
                            }
                            AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z5);
                        }
                    } else {
                        fMin2 = 1.0f;
                    }
                    int measuredWidth2 = getMeasuredWidth();
                    Drawable drawable2 = editorAlert.shadowDrawable;
                    drawable2.setBounds(0, iDp3, measuredWidth2, iDp4);
                    drawable2.draw(canvas);
                    rectF = (RectF) this.titleView;
                    if (fMin2 != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(-1);
                        rectF.set(((BottomSheet) editorAlert).backgroundPaddingLeft, ((BottomSheet) editorAlert).backgroundPaddingTop + iDp3, getMeasuredWidth() - ((BottomSheet) editorAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) editorAlert).backgroundPaddingTop + iDp3);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin2, AndroidUtilities.dp(12.0f) * fMin2, Theme.dialogs_onlineCirclePaint);
                    }
                    int iDp6 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - iDp6) / 2, iDp2, (getMeasuredWidth() + iDp6) / 2, AndroidUtilities.dp(4.0f) + iDp2);
                    Theme.dialogs_onlineCirclePaint.setColor(-1973016);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (editorAlert.listView.getAlpha() * 255.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    if (iMin2 > 0) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        canvas.drawRect(((BottomSheet) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin2, getMeasuredWidth() - ((BottomSheet) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                    }
                    if (iMin2 > AndroidUtilities.statusBarHeight / 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bool2 = (Boolean) this.avatarsImageView;
                    if (bool2 != null) {
                    }
                    if (AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(Theme.blendOver(editorAlert.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f) {
                    }
                    this.avatarsImageView = Boolean.valueOf(z4);
                    if (!z4) {
                        z5 = z6;
                    }
                    AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z5);
                    break;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 2:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName("android.widget.Button");
                    accessibilityNodeInfo.setClickable(true);
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    if (motionEvent.getAction() == 0) {
                        FiltersListBottomSheet filtersListBottomSheet = (FiltersListBottomSheet) this.this$0;
                        if (filtersListBottomSheet.scrollOffsetY != 0 && motionEvent.getY() < filtersListBottomSheet.scrollOffsetY) {
                            filtersListBottomSheet.lambda$showGiftOfferSheet$15();
                            return true;
                        }
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                case 2:
                default:
                    return super.onInterceptTouchEvent(motionEvent);
                case 3:
                    if (motionEvent.getAction() == 0) {
                        ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.this$0;
                        if (editorAlert.scrollOffsetY != 0 && motionEvent.getY() < editorAlert.scrollOffsetY) {
                            editorAlert.lambda$showGiftOfferSheet$15();
                            return true;
                        }
                    }
                    return super.onInterceptTouchEvent(motionEvent);
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 1:
                    super.onLayout(z, i, i2, i3, i4);
                    FiltersListBottomSheet.access$800((FiltersListBottomSheet) this.this$0);
                    break;
                case 2:
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
                case 3:
                    super.onLayout(z, i, i2, i3, i4);
                    ThemeEditorView.EditorAlert.access$2200((ThemeEditorView.EditorAlert) this.this$0);
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    View view = (View) getParent();
                    if (view != null && view.getWidth() > 0) {
                        i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                    }
                    this.ignoreLayout = true;
                    SimpleTextView simpleTextView = (SimpleTextView) this.titleView;
                    simpleTextView.setVisibility(8);
                    super.onMeasure(i, i2);
                    simpleTextView.setVisibility(0);
                    simpleTextView.getLayoutParams().width = getMeasuredWidth();
                    this.ignoreLayout = false;
                    ((KeepMediaPopupView) this.this$0).updateAvatarsPosition();
                    super.onMeasure(i, i2);
                    break;
                case 1:
                    int size = View.MeasureSpec.getSize(i2);
                    FiltersListBottomSheet filtersListBottomSheet = (FiltersListBottomSheet) this.this$0;
                    filtersListBottomSheet.ignoreLayout = true;
                    setPadding(((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) filtersListBottomSheet).backgroundPaddingLeft, 0);
                    filtersListBottomSheet.ignoreLayout = false;
                    int itemCount = ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop + (filtersListBottomSheet.adapter.getItemCount() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
                    int i3 = size / 5;
                    int i4 = ((double) itemCount) < ((double) i3) * 3.2d ? 0 : i3 * 2;
                    if (i4 != 0 && itemCount < size) {
                        i4 -= size - itemCount;
                    }
                    if (i4 == 0) {
                        i4 = ((BottomSheet) filtersListBottomSheet).backgroundPaddingTop;
                    }
                    ChatActivity.AnonymousClass34 anonymousClass34 = filtersListBottomSheet.listView;
                    if (anonymousClass34.getPaddingTop() != i4) {
                        filtersListBottomSheet.ignoreLayout = true;
                        anonymousClass34.setPadding(AndroidUtilities.dp(10.0f), i4, AndroidUtilities.dp(10.0f), 0);
                        filtersListBottomSheet.ignoreLayout = false;
                    }
                    this.ignoreLayout = itemCount >= size;
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(itemCount, size), 1073741824));
                    break;
                case 2:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.ignoreLayout ? 80.0f : 50.0f), 1073741824));
                    break;
                default:
                    int size2 = View.MeasureSpec.getSize(i);
                    int size3 = View.MeasureSpec.getSize(i2);
                    ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.this$0;
                    if (!((BottomSheet) editorAlert).isFullscreen) {
                        this.ignoreLayout = true;
                        setPadding(((BottomSheet) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) editorAlert).backgroundPaddingLeft, 0);
                        this.ignoreLayout = false;
                    }
                    int iDp = (AndroidUtilities.dp(8.0f) + (size3 - AndroidUtilities.statusBarHeight)) - Math.min(size2, size3 - AndroidUtilities.statusBarHeight);
                    ChatActivity.AnonymousClass34 anonymousClass35 = editorAlert.listView;
                    if (anonymousClass35.getPaddingTop() != iDp) {
                        this.ignoreLayout = true;
                        anonymousClass35.getPaddingTop();
                        anonymousClass35.setPadding(0, iDp, 0, AndroidUtilities.dp(48.0f));
                        if (editorAlert.colorPicker.getVisibility() == 0) {
                            editorAlert.setScrollOffsetY(anonymousClass35.getPaddingTop());
                            editorAlert.previousScrollPosition = 0;
                        }
                        this.ignoreLayout = false;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    return !((FiltersListBottomSheet) this.this$0).isDismissed() && super.onTouchEvent(motionEvent);
                case 2:
                default:
                    return super.onTouchEvent(motionEvent);
                case 3:
                    return !((ThemeEditorView.EditorAlert) this.this$0).isDismissed() && super.onTouchEvent(motionEvent);
            }
        }

        @Override
        public void requestLayout() {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 1:
                    if (!((FiltersListBottomSheet) this.this$0).ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 2:
                default:
                    super.requestLayout();
                    break;
                case 3:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
            }
        }

        public void setText(String str, boolean z) {
            TextView[] textViewArr = (TextView[]) this.avatarsImageView;
            if (!z) {
                textViewArr[0].setText(str);
                return;
            }
            textViewArr[1].setText(str);
            ((JoinCallAlert) this.this$0).animationInProgress = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(180L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f);
            TextView textView = textViewArr[0];
            float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
            animatorSet.addListener(new ItemOptions.AnonymousClass3(this, 4));
            animatorSet.start();
        }

        public ExceptionsView(JoinCallAlert joinCallAlert, Context context, boolean z) {
            super(context);
            this.this$0 = joinCallAlert;
            this.avatarsImageView = new TextView[2];
            this.ignoreLayout = !z;
            setBackground(null);
            View view = new View(context);
            this.titleView = view;
            if (!z) {
                view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
            }
            addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, z ? 0.0f : 16.0f, 16.0f, 16.0f));
            for (int i = 0; i < 2; i++) {
                ((TextView[]) this.avatarsImageView)[i] = new TextView(context);
                ((TextView[]) this.avatarsImageView)[i].setFocusable(false);
                ((TextView[]) this.avatarsImageView)[i].setLines(1);
                ((TextView[]) this.avatarsImageView)[i].setSingleLine(true);
                ((TextView[]) this.avatarsImageView)[i].setGravity(1);
                ((TextView[]) this.avatarsImageView)[i].setEllipsize(TextUtils.TruncateAt.END);
                ((TextView[]) this.avatarsImageView)[i].setGravity(17);
                if (this.ignoreLayout) {
                    ((TextView[]) this.avatarsImageView)[i].setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                    ((TextView[]) this.avatarsImageView)[i].setTypeface(AndroidUtilities.bold());
                } else {
                    ((TextView[]) this.avatarsImageView)[i].setTextColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
                }
                ((TextView[]) this.avatarsImageView)[i].setImportantForAccessibility(2);
                ((TextView[]) this.avatarsImageView)[i].setTextSize(1, 14.0f);
                ((TextView[]) this.avatarsImageView)[i].setPadding(0, 0, 0, this.ignoreLayout ? 0 : AndroidUtilities.dp(13.0f));
                addView(((TextView[]) this.avatarsImageView)[i], LayoutHelper.createFrame(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
                if (i == 1) {
                    ((TextView[]) this.avatarsImageView)[i].setAlpha(0.0f);
                }
            }
        }

        public ExceptionsView(ThemeEditorView.EditorAlert editorAlert, Context context) {
            super(context);
            this.this$0 = editorAlert;
            this.ignoreLayout = false;
            this.titleView = new RectF();
        }

        public ExceptionsView(KeepMediaPopupView keepMediaPopupView, Context context) {
            super(context);
            this.this$0 = keepMediaPopupView;
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            simpleTextView.setTextSize(16);
            simpleTextView.setEllipsizeByGradient(true);
            simpleTextView.setRightPadding(AndroidUtilities.dp(68.0f));
            simpleTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            addView(simpleTextView, LayoutHelper.createFrame(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            this.avatarsImageView = avatarsImageView;
            avatarsImageView.avatarsDrawable.showSavedMessages = true;
            avatarsImageView.setStyle(11);
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            addView(avatarsImageView, LayoutHelper.createFrame(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            setBackground(Theme.createRadSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 0, 4));
        }
    }
}
