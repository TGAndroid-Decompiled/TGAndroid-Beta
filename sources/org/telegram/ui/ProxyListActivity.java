package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ProxyRotationController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;

public final class ProxyListActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int callsDetailRow;
    public int callsRow;
    public int connectionsHeaderRow;
    public int currentConnectionState;
    public int deleteAllRow;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public int proxyAddRow;
    public int proxyEndRow;
    public final ArrayList proxyList;
    public int proxyShadowRow;
    public int proxyStartRow;
    public int rotationRow;
    public int rotationTimeoutInfoRow;
    public int rotationTimeoutRow;
    public int rowCount;
    public NumberTextView selectedCountTextView;
    public final ArrayList selectedItems;
    public boolean useProxyForCalls;
    public boolean useProxySettings;
    public int useProxyShadowRow;
    public boolean wasCheckedAllList;

    public final class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        public final Context val$context;

        public AnonymousClass2(Context context) {
            this.val$context = context;
        }

        @Override
        public final void onItemClick(int i) {
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            ArrayList arrayList = proxyListActivity.selectedItems;
            if (i == -1) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.listAdapter.clearSelected();
                    return;
                }
            }
            int i2 = 0;
            if (i == 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(proxyListActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.message = string;
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                alertDialog.title = LocaleController.getString(R.string.DeleteProxyTitle);
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new StoriesViewPager$$ExternalSyntheticLambda0(this, 1));
                proxyListActivity.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                if (sb.length() > 0) {
                    sb.append("\n\n");
                }
                sb.append(proxyInfo.getLink());
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            Intent intentCreateChooser = Intent.createChooser(intent, LocaleController.getString(arrayList.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
            intentCreateChooser.setFlags(268435456);
            this.val$context.startActivity(intentCreateChooser);
            ListAdapter listAdapter = proxyListActivity.listAdapter;
            if (listAdapter != null) {
                listAdapter.clearSelected();
            }
        }
    }

    public final class TextDetailProxyCell extends FrameLayout {
        public final CheckBox2 checkBox;
        public Drawable checkDrawable;
        public final ImageView checkImageView;
        public int color;
        public SharedConfig.ProxyInfo currentInfo;
        public boolean isSelected;
        public boolean isSelectionEnabled;
        public final TextView textView;
        public final TextView valueTextView;

        public TextDetailProxyCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 56 : 21, 10.0f, z ? 21 : 56, 0.0f));
            TextView textView2 = new TextView(context);
            this.valueTextView = textView2;
            textView2.setTextSize(1, 13.0f);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setEllipsize(truncateAt);
            textView2.setPadding(0, 0, 0, 0);
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 56 : 21, 35.0f, z2 ? 21 : 56, 0.0f));
            ImageView imageView = new ImageView(context);
            this.checkImageView = imageView;
            imageView.setImageResource(R.drawable.msg_info);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setContentDescription(LocaleController.getString(R.string.Edit));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
            imageView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 25));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.checkBoxBase.setColor(Theme.key_checkbox, Theme.key_radioBackground, Theme.key_checkboxCheck);
            checkBox2.setDrawBackgroundAsArc(14);
            checkBox2.setVisibility(8);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
            setWillNotDraw(false);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateStatus();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), zzkm.m(64.0f, 1));
        }

        public void setChecked(boolean z) {
            TextView textView = this.valueTextView;
            if (!z) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            if (this.checkDrawable == null) {
                this.checkDrawable = getResources().getDrawable(R.drawable.proxy_check).mutate();
            }
            Drawable drawable = this.checkDrawable;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.color, PorterDuff.Mode.MULTIPLY));
            }
            if (LocaleController.isRTL) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.checkDrawable, (Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.checkDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
            this.textView.setText(proxyInfo.address + ":" + proxyInfo.port);
            this.currentInfo = proxyInfo;
        }

        public final void setSelectionEnabled(boolean z, boolean z2) {
            if (this.isSelectionEnabled == z && z2) {
                return;
            }
            this.isSelectionEnabled = z;
            float fDp = LocaleController.isRTL ? -AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
            if (z2) {
                ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda305(this, fDp, 4));
                duration.addListener(new LoginActivity.AnonymousClass9(25, this, z));
                duration.start();
                return;
            }
            if (!z) {
                fDp = 0.0f;
            }
            this.textView.setTranslationX(fDp);
            this.valueTextView.setTranslationX(fDp);
            ImageView imageView = this.checkImageView;
            imageView.setTranslationX(fDp);
            boolean z3 = LocaleController.isRTL;
            int iDp = AndroidUtilities.dp(32.0f);
            if (!z3) {
                iDp = -iDp;
            }
            float f = iDp + fDp;
            CheckBox2 checkBox2 = this.checkBox;
            checkBox2.setTranslationX(f);
            imageView.setVisibility(z ? 8 : 0);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            checkBox2.setVisibility(z ? 0 : 8);
            checkBox2.setAlpha(1.0f);
            checkBox2.setScaleX(1.0f);
            checkBox2.setScaleY(1.0f);
        }

        public void setValue(CharSequence charSequence) {
            this.valueTextView.setText(charSequence);
        }

        public final void updateStatus() {
            int i;
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
            SharedConfig.ProxyInfo proxyInfo2 = this.currentInfo;
            TextView textView = this.valueTextView;
            if (proxyInfo == proxyInfo2) {
                ProxyListActivity proxyListActivity = ProxyListActivity.this;
                if (proxyListActivity.useProxySettings) {
                    int i2 = proxyListActivity.currentConnectionState;
                    if (i2 == 3 || i2 == 5) {
                        int i3 = Theme.key_windowBackgroundWhiteBlueText6;
                        if (proxyInfo2.ping != 0) {
                            StringBuilder sb = new StringBuilder();
                            zzlf.m(R.string.Connected, ", ", sb);
                            sb.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.currentInfo.ping)));
                            textView.setText(sb.toString());
                        } else {
                            textView.setText(LocaleController.getString(R.string.Connected));
                        }
                        SharedConfig.ProxyInfo proxyInfo3 = this.currentInfo;
                        if (!proxyInfo3.checking && !proxyInfo3.available) {
                            proxyInfo3.availableCheckTime = 0L;
                        }
                        i = i3;
                    } else {
                        i = Theme.key_windowBackgroundWhiteGrayText2;
                        textView.setText(LocaleController.getString(R.string.Connecting));
                    }
                } else if (proxyInfo2.checking) {
                    textView.setText(LocaleController.getString(R.string.Checking));
                    i = Theme.key_windowBackgroundWhiteGrayText2;
                } else if (proxyInfo2.available) {
                    if (proxyInfo2.ping != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        zzlf.m(R.string.Available, ", ", sb2);
                        sb2.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.currentInfo.ping)));
                        textView.setText(sb2.toString());
                    } else {
                        textView.setText(LocaleController.getString(R.string.Available));
                    }
                    i = Theme.key_windowBackgroundWhiteGreenText;
                } else {
                    textView.setText(LocaleController.getString(R.string.Unavailable));
                    i = Theme.key_text_RedRegular;
                }
            } else if (proxyInfo2.checking) {
                textView.setText(LocaleController.getString(R.string.Checking));
                i = Theme.key_windowBackgroundWhiteGrayText2;
            } else if (proxyInfo2.available) {
                if (proxyInfo2.ping != 0) {
                    StringBuilder sb3 = new StringBuilder();
                    zzlf.m(R.string.Available, ", ", sb3);
                    sb3.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.currentInfo.ping)));
                    textView.setText(sb3.toString());
                } else {
                    textView.setText(LocaleController.getString(R.string.Available));
                }
                i = Theme.key_windowBackgroundWhiteGreenText;
            } else {
                textView.setText(LocaleController.getString(R.string.Unavailable));
                i = Theme.key_text_RedRegular;
            }
            this.color = Theme.getColor(null, i, false);
            textView.setTag(Integer.valueOf(i));
            textView.setTextColor(this.color);
            Drawable drawable = this.checkDrawable;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.color, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public ProxyListActivity() {
        super(null);
        this.selectedItems = new ArrayList();
        this.proxyList = new ArrayList();
    }

    @Override
    public final View createView(Context context) {
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 17));
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        ((DefaultItemAnimator) this.listView.getItemAnimator()).translationInterpolator = CubicBezierInterpolator.DEFAULT;
        this.listView.setVerticalScrollBarEnabled(false);
        zzku.m(this.listView);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 1));
        this.listView.setOnItemLongClickListener(new ProxyListActivity$$ExternalSyntheticLambda2(this));
        ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
        NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
        this.selectedCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedCountTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
        anonymousClass1CreateActionMode.addView(this.selectedCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, 72, 0, 0));
        this.selectedCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        anonymousClass1CreateActionMode.addItemWithWidth(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        anonymousClass1CreateActionMode.addItemWithWidth(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2(context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView.Holder holder;
        SharedConfig.ProxyInfo proxyInfo;
        RecyclerListView.Holder holder2;
        boolean z = false;
        if (i == NotificationCenter.proxyChangedByRotation) {
            this.listView.forAllChild(new ChatActivity$$ExternalSyntheticLambda211(this, 12));
            updateRows$7(false);
            return;
        }
        if (i == NotificationCenter.proxySettingsChanged) {
            updateRows$7(true);
            return;
        }
        int i3 = NotificationCenter.didUpdateConnectionState;
        ArrayList arrayList = this.proxyList;
        if (i == i3) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.currentConnectionState != connectionState) {
                this.currentConnectionState = connectionState;
                if (this.listView == null || (proxyInfo = SharedConfig.currentProxy) == null) {
                    return;
                }
                int iIndexOf = arrayList.indexOf(proxyInfo);
                if (iIndexOf >= 0 && (holder2 = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(iIndexOf + this.proxyStartRow)) != null) {
                    ((TextDetailProxyCell) holder2.itemView).updateStatus();
                }
                if (this.currentConnectionState == 3) {
                    updateRows$7(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != NotificationCenter.proxyCheckDone || this.listView == null) {
            return;
        }
        int iIndexOf2 = arrayList.indexOf((SharedConfig.ProxyInfo) objArr[0]);
        if (iIndexOf2 >= 0 && (holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(iIndexOf2 + this.proxyStartRow)) != null) {
            ((TextDetailProxyCell) holder.itemView).updateStatus();
        }
        if (!this.wasCheckedAllList) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj;
                if (proxyInfo2.checking || proxyInfo2.availableCheckTime == 0) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.wasCheckedAllList = true;
            }
        }
        if (z) {
            return;
        }
        updateRows$7(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, TextCheckCell.class, HeaderCell.class, TextDetailProxyCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailProxyCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 262156, new Class[]{TextDetailProxyCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText6));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 262156, new Class[]{TextDetailProxyCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262156, new Class[]{TextDetailProxyCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGreenText));
        arrayList.add(new ThemeDescription(this.listView, 262156, new Class[]{TextDetailProxyCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{TextDetailProxyCell.class}, new String[]{"checkImageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.selectedItems.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        this.listAdapter.clearSelected();
        return false;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        SharedConfig.loadProxyList();
        this.currentConnectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        this.useProxySettings = globalMainSettings.getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty();
        this.useProxyForCalls = globalMainSettings.getBoolean("proxy_enabled_calls", false);
        updateRows$7(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void updateRows$7(boolean z) {
        ListAdapter listAdapter;
        final boolean z2;
        this.rowCount = 1;
        if (!this.useProxySettings || SharedConfig.currentProxy == null || SharedConfig.proxyList.size() <= 1) {
            this.rotationRow = -1;
            this.rotationTimeoutRow = -1;
            this.rotationTimeoutInfoRow = -1;
        } else {
            int i = this.rowCount;
            int i2 = i + 1;
            this.rowCount = i2;
            this.rotationRow = i;
            if (SharedConfig.proxyRotationEnabled) {
                this.rotationTimeoutRow = i2;
                this.rowCount = i + 3;
                this.rotationTimeoutInfoRow = i + 2;
            } else {
                this.rotationTimeoutRow = -1;
                this.rotationTimeoutInfoRow = -1;
            }
        }
        if (this.rotationTimeoutInfoRow == -1) {
            int i3 = this.rowCount;
            this.rowCount = i3 + 1;
            this.useProxyShadowRow = i3;
        } else {
            this.useProxyShadowRow = -1;
        }
        int i4 = this.rowCount;
        this.rowCount = i4 + 1;
        this.connectionsHeaderRow = i4;
        ArrayList arrayList = this.proxyList;
        if (z) {
            arrayList.clear();
            arrayList.addAll(SharedConfig.proxyList);
            if (this.wasCheckedAllList) {
                z2 = false;
            } else {
                int size = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        z2 = false;
                        break;
                    }
                    Object obj = arrayList.get(i5);
                    i5++;
                    SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                    if (proxyInfo.checking || proxyInfo.availableCheckTime == 0) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    this.wasCheckedAllList = true;
                }
            }
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj2, Object obj3) {
                    SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj2;
                    SharedConfig.ProxyInfo proxyInfo3 = (SharedConfig.ProxyInfo) obj3;
                    SharedConfig.ProxyInfo proxyInfo4 = SharedConfig.currentProxy;
                    long j = proxyInfo4 == proxyInfo2 ? -200000L : 0L;
                    if (!proxyInfo2.available) {
                        j += 100000;
                    }
                    long j2 = proxyInfo4 == proxyInfo3 ? -200000L : 0L;
                    if (!proxyInfo3.available) {
                        j2 += 100000;
                    }
                    boolean z3 = z2;
                    return Long.compare((!z3 || proxyInfo2 == proxyInfo4) ? j + proxyInfo2.ping : ((long) SharedConfig.proxyList.indexOf(proxyInfo2)) * 10000, (!z3 || proxyInfo3 == SharedConfig.currentProxy) ? proxyInfo3.ping + j2 : ((long) SharedConfig.proxyList.indexOf(proxyInfo3)) * 10000);
                }
            });
        }
        if (arrayList.isEmpty()) {
            this.proxyStartRow = -1;
            this.proxyEndRow = -1;
        } else {
            int i6 = this.rowCount;
            this.proxyStartRow = i6;
            int size2 = arrayList.size() + i6;
            this.rowCount = size2;
            this.proxyEndRow = size2;
        }
        int i7 = this.rowCount;
        this.proxyAddRow = i7;
        this.rowCount = i7 + 2;
        this.proxyShadowRow = i7 + 1;
        SharedConfig.ProxyInfo proxyInfo2 = SharedConfig.currentProxy;
        if (proxyInfo2 == null || proxyInfo2.secret.isEmpty()) {
            boolean z3 = this.callsRow == -1;
            int i8 = this.rowCount;
            this.callsRow = i8;
            this.rowCount = i8 + 2;
            this.callsDetailRow = i8 + 1;
            if (!z && z3) {
                this.listAdapter.notifyItemChanged(this.proxyShadowRow);
                this.listAdapter.mObservable.notifyItemRangeInserted(this.proxyShadowRow + 1, 2);
            }
        } else {
            boolean z4 = this.callsRow != -1;
            this.callsRow = -1;
            this.callsDetailRow = -1;
            if (!z && z4) {
                this.listAdapter.notifyItemChanged(this.proxyShadowRow);
                this.listAdapter.mObservable.notifyItemRangeRemoved(this.proxyShadowRow + 1, 2);
            }
        }
        if (arrayList.size() >= 10) {
            int i9 = this.rowCount;
            this.rowCount = i9 + 1;
            this.deleteAllRow = i9;
        } else {
            this.deleteAllRow = -1;
        }
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            SharedConfig.ProxyInfo proxyInfo3 = (SharedConfig.ProxyInfo) arrayList.get(i10);
            if (!proxyInfo3.checking && SystemClock.elapsedRealtime() - proxyInfo3.availableCheckTime >= 120000) {
                proxyInfo3.checking = true;
                proxyInfo3.proxyCheckPingId = ConnectionsManager.getInstance(this.currentAccount).checkProxy(proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret, new PhotoViewer$$ExternalSyntheticLambda115(proxyInfo3, 29));
            }
        }
        if (!z || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.mObservable.notifyChanged();
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        public final void checkActionMode$1() {
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            int size = proxyListActivity.selectedItems.size();
            boolean zIsActionModeShowed = ((BaseFragment) proxyListActivity).actionBar.isActionModeShowed();
            RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
            if (size <= 0) {
                if (zIsActionModeShowed) {
                    ((BaseFragment) proxyListActivity).actionBar.hideActionMode$1();
                    int i = proxyListActivity.proxyStartRow;
                    adapterDataObservable.notifyItemRangeChanged(i, proxyListActivity.proxyEndRow - i, 2);
                    return;
                }
                return;
            }
            proxyListActivity.selectedCountTextView.setNumber(size, zIsActionModeShowed);
            if (zIsActionModeShowed) {
                return;
            }
            ((BaseFragment) proxyListActivity).actionBar.showActionMode(null, null);
            int i2 = proxyListActivity.proxyStartRow;
            adapterDataObservable.notifyItemRangeChanged(i2, proxyListActivity.proxyEndRow - i2, 2);
        }

        public final void clearSelected() {
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            proxyListActivity.selectedItems.clear();
            int i = proxyListActivity.proxyStartRow;
            this.mObservable.notifyItemRangeChanged(i, proxyListActivity.proxyEndRow - i, 1);
            checkActionMode$1();
        }

        @Override
        public final int getItemCount() {
            return ProxyListActivity.this.rowCount;
        }

        @Override
        public final long getItemId(int i) {
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            if (i == proxyListActivity.useProxyShadowRow) {
                return -1L;
            }
            if (i == proxyListActivity.proxyShadowRow) {
                return -2L;
            }
            if (i == proxyListActivity.proxyAddRow) {
                return -3L;
            }
            proxyListActivity.getClass();
            if (i == 0) {
                return -4L;
            }
            if (i == proxyListActivity.callsRow) {
                return -5L;
            }
            if (i == proxyListActivity.connectionsHeaderRow) {
                return -6L;
            }
            if (i == proxyListActivity.deleteAllRow) {
                return -8L;
            }
            if (i == proxyListActivity.rotationRow) {
                return -9L;
            }
            if (i == proxyListActivity.rotationTimeoutRow) {
                return -10L;
            }
            if (i == proxyListActivity.rotationTimeoutInfoRow) {
                return -11L;
            }
            int i2 = proxyListActivity.proxyStartRow;
            if (i < i2 || i >= proxyListActivity.proxyEndRow) {
                return -7L;
            }
            return ((SharedConfig.ProxyInfo) proxyListActivity.proxyList.get(i - i2)).hashCode();
        }

        @Override
        public final int getItemViewType(int i) {
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            if (i == proxyListActivity.useProxyShadowRow || i == proxyListActivity.proxyShadowRow) {
                return 0;
            }
            if (i == proxyListActivity.proxyAddRow || i == proxyListActivity.deleteAllRow) {
                return 1;
            }
            if (i == 0 || i == proxyListActivity.rotationRow || i == proxyListActivity.callsRow) {
                return 3;
            }
            if (i == proxyListActivity.connectionsHeaderRow) {
                return 2;
            }
            if (i == proxyListActivity.rotationTimeoutRow) {
                return 6;
            }
            return (i < proxyListActivity.proxyStartRow || i >= proxyListActivity.proxyEndRow) ? 4 : 5;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            if (adapterPosition == 0 || adapterPosition == proxyListActivity.rotationRow || adapterPosition == proxyListActivity.callsRow || adapterPosition == proxyListActivity.proxyAddRow || adapterPosition == proxyListActivity.deleteAllRow) {
                return true;
            }
            return adapterPosition >= proxyListActivity.proxyStartRow && adapterPosition < proxyListActivity.proxyEndRow;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            View view = viewHolder.itemView;
            switch (i2) {
                case 1:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                    if (i == proxyListActivity.proxyAddRow) {
                        textSettingsCell.setText(LocaleController.getString(R.string.AddProxy), proxyListActivity.deleteAllRow != -1);
                    } else if (i == proxyListActivity.deleteAllRow) {
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        textSettingsCell.setText(LocaleController.getString(R.string.DeleteAllProxies), false);
                    }
                    break;
                case 2:
                    HeaderCell headerCell = (HeaderCell) view;
                    if (i == proxyListActivity.connectionsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.ProxyConnections));
                    }
                    break;
                case 3:
                    TextCheckCell textCheckCell = (TextCheckCell) view;
                    if (i == 0) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.useProxySettings, proxyListActivity.rotationRow != -1);
                    } else if (i == proxyListActivity.callsRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.useProxyForCalls, false);
                    } else if (i == proxyListActivity.rotationRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    }
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i == proxyListActivity.callsDetailRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    } else if (i == proxyListActivity.rotationTimeoutInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    }
                    break;
                case 5:
                    TextDetailProxyCell textDetailProxyCell = (TextDetailProxyCell) view;
                    ArrayList arrayList = proxyListActivity.proxyList;
                    SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i - proxyListActivity.proxyStartRow);
                    textDetailProxyCell.setProxy(proxyInfo);
                    textDetailProxyCell.setChecked(SharedConfig.currentProxy == proxyInfo);
                    ArrayList arrayList2 = proxyListActivity.selectedItems;
                    boolean zContains = arrayList2.contains(arrayList.get(i - proxyListActivity.proxyStartRow));
                    textDetailProxyCell.isSelected = zContains;
                    textDetailProxyCell.checkBox.checkBoxBase.setChecked(-1, zContains, false);
                    textDetailProxyCell.setSelectionEnabled(!arrayList2.isEmpty(), false);
                    break;
                case 6:
                    if (i == proxyListActivity.rotationTimeoutRow) {
                        SlideChooseView slideChooseView = (SlideChooseView) view;
                        ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                        String[] strArr = new String[arrayList3.size()];
                        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                            strArr[i3] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i3));
                        }
                        slideChooseView.setCallback(new PhotoViewer$$ExternalSyntheticLambda97(20));
                        slideChooseView.setOptions(SharedConfig.proxyRotationTimeout, null, strArr);
                    }
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = this.mContext;
            if (i == 0) {
                shadowSectionCell = new ShadowSectionCell(context, (Object) null);
            } else if (i == 1) {
                shadowSectionCell = new TextSettingsCell(context, 0, null);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 2) {
                shadowSectionCell = new HeaderCell(context);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 3) {
                shadowSectionCell = new TextCheckCell(context);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 4) {
                shadowSectionCell = new TextInfoPrivacyCell(context, 24, null);
            } else if (i != 6) {
                shadowSectionCell = ProxyListActivity.this.new TextDetailProxyCell(context);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else {
                shadowSectionCell = new SlideChooseView(context, null);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
            return zzkl.m(shadowSectionCell, shadowSectionCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                int adapterPosition = viewHolder.getAdapterPosition();
                ProxyListActivity proxyListActivity = ProxyListActivity.this;
                if (adapterPosition == 0) {
                    textCheckCell.setChecked(proxyListActivity.useProxySettings);
                } else if (adapterPosition == proxyListActivity.callsRow) {
                    textCheckCell.setChecked(proxyListActivity.useProxyForCalls);
                } else if (adapterPosition == proxyListActivity.rotationRow) {
                    textCheckCell.setChecked(SharedConfig.proxyRotationEnabled);
                }
            }
        }

        public final void toggleSelected(int i) {
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            int i2 = proxyListActivity.proxyStartRow;
            if (i < i2 || i >= proxyListActivity.proxyEndRow) {
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.proxyList.get(i - i2);
            ArrayList arrayList = proxyListActivity.selectedItems;
            if (arrayList.contains(proxyInfo)) {
                arrayList.remove(proxyInfo);
            } else {
                arrayList.add(proxyInfo);
            }
            this.mObservable.notifyItemRangeChanged(i, 1, 1);
            checkActionMode$1();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            boolean zContains;
            int i2 = viewHolder.mItemViewType;
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 5 && !list.isEmpty()) {
                TextDetailProxyCell textDetailProxyCell = (TextDetailProxyCell) view;
                boolean zContains2 = list.contains(1);
                ArrayList arrayList = proxyListActivity.selectedItems;
                if (zContains2 && (zContains = arrayList.contains(proxyListActivity.proxyList.get(i - proxyListActivity.proxyStartRow))) != textDetailProxyCell.isSelected) {
                    textDetailProxyCell.isSelected = zContains;
                    textDetailProxyCell.checkBox.checkBoxBase.setChecked(-1, zContains, true);
                }
                if (list.contains(2)) {
                    textDetailProxyCell.setSelectionEnabled(!arrayList.isEmpty(), true);
                    return;
                }
                return;
            }
            if (viewHolder.mItemViewType == 3 && list.contains(0)) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                if (i == 0) {
                    textCheckCell.setChecked(proxyListActivity.useProxySettings);
                    return;
                } else if (i == proxyListActivity.callsRow) {
                    textCheckCell.setChecked(proxyListActivity.useProxyForCalls);
                    return;
                } else {
                    if (i == proxyListActivity.rotationRow) {
                        textCheckCell.setChecked(SharedConfig.proxyRotationEnabled);
                        return;
                    }
                    return;
                }
            }
            onBindViewHolder(viewHolder, i);
        }
    }
}
