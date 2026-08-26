package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
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

public class ProxyListActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final boolean IS_PROXY_ROTATION_AVAILABLE = true;
    private static final int MENU_DELETE = 0;
    private static final int MENU_SHARE = 1;
    private int callsDetailRow;
    private int callsRow;
    private int connectionsHeaderRow;
    private int currentConnectionState;
    private int deleteAllRow;
    private ActionBarMenuItem deleteMenuItem;
    private ItemTouchHelper itemTouchHelper;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int proxyAddRow;
    private int proxyEndRow;
    private List<SharedConfig.ProxyInfo> proxyList;
    private int proxyShadowRow;
    private int proxyStartRow;
    private int rotationRow;
    private int rotationTimeoutInfoRow;
    private int rotationTimeoutRow;
    private int rowCount;
    private NumberTextView selectedCountTextView;
    private List<SharedConfig.ProxyInfo> selectedItems;
    private ActionBarMenuItem shareMenuItem;
    private boolean useProxyForCalls;
    private int useProxyRow;
    private boolean useProxySettings;
    private int useProxyShadowRow;
    private boolean wasCheckedAllList;

    public class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        final Context val$context;

        public AnonymousClass2(Context context) {
            this.val$context = context;
        }

        public void lambda$onItemClick$0(AlertDialog alertDialog, int i) {
            Iterator it = ProxyListActivity.this.selectedItems.iterator();
            while (it.hasNext()) {
                SharedConfig.deleteProxy((SharedConfig.ProxyInfo) it.next());
            }
            if (SharedConfig.currentProxy == null) {
                ProxyListActivity.this.useProxyForCalls = false;
                ProxyListActivity.this.useProxySettings = false;
            }
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            ProxyListActivity proxyListActivity = ProxyListActivity.this;
            int i2 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i2);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(ProxyListActivity.this, i2);
            ProxyListActivity.this.updateRows(true);
            if (ProxyListActivity.this.listAdapter != null) {
                if (SharedConfig.currentProxy == null) {
                    ProxyListActivity.this.listAdapter.notifyItemChanged(ProxyListActivity.this.useProxyRow, 0);
                    ProxyListActivity.this.listAdapter.notifyItemChanged(ProxyListActivity.this.callsRow, 0);
                }
                ProxyListActivity.this.listAdapter.clearSelected();
            }
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (ProxyListActivity.this.selectedItems.isEmpty()) {
                    ProxyListActivity.this.finishFragment();
                    return;
                } else {
                    ProxyListActivity.this.listAdapter.clearSelected();
                    return;
                }
            }
            if (i == 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProxyListActivity.this.getParentActivity(), 0, null);
                builder.setMessage(LocaleController.getString(ProxyListActivity.this.selectedItems.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setTitle(LocaleController.getString(R.string.DeleteProxyTitle));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new PhotoViewer$55$$ExternalSyntheticLambda2(this, 20));
                AlertDialog alertDialogCreate = builder.create();
                ProxyListActivity.this.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
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
            for (SharedConfig.ProxyInfo proxyInfo : ProxyListActivity.this.selectedItems) {
                if (sb.length() > 0) {
                    sb.append("\n\n");
                }
                sb.append(proxyInfo.getLink());
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            Intent intentCreateChooser = Intent.createChooser(intent, LocaleController.getString(ProxyListActivity.this.selectedItems.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
            intentCreateChooser.setFlags(268435456);
            this.val$context.startActivity(intentCreateChooser);
            if (ProxyListActivity.this.listAdapter != null) {
                ProxyListActivity.this.listAdapter.clearSelected();
            }
        }
    }

    public class TextDetailProxyCell extends FrameLayout {
        private CheckBox2 checkBox;
        private Drawable checkDrawable;
        private ImageView checkImageView;
        private int color;
        private SharedConfig.ProxyInfo currentInfo;
        private boolean isSelected;
        private boolean isSelectionEnabled;
        private TextView textView;
        private TextView valueTextView;

        public TextDetailProxyCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            TextView textView2 = this.textView;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView3 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView3, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 56 : 21, 10.0f, z ? 21 : 56, 0.0f));
            TextView textView4 = new TextView(context);
            this.valueTextView = textView4;
            textView4.setTextSize(1, 13.0f);
            this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.valueTextView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            this.valueTextView.setEllipsize(truncateAt);
            this.valueTextView.setPadding(0, 0, 0, 0);
            TextView textView5 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            addView(textView5, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 56 : 21, 35.0f, z2 ? 21 : 56, 0.0f));
            ImageView imageView = new ImageView(context);
            this.checkImageView = imageView;
            imageView.setImageResource(R.drawable.msg_info);
            this.checkImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false), PorterDuff.Mode.MULTIPLY));
            this.checkImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.checkImageView.setContentDescription(LocaleController.getString(R.string.Edit));
            addView(this.checkImageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
            this.checkImageView.setOnClickListener(new PollItemMenu$$ExternalSyntheticLambda14(this, 5));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setColor(Theme.key_checkbox, Theme.key_radioBackground, Theme.key_checkboxCheck);
            this.checkBox.setDrawBackgroundAsArc(14);
            this.checkBox.setVisibility(8);
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
            setWillNotDraw(false);
        }

        public void lambda$new$0(View view) {
            ProxyListActivity.this.presentFragment(new ProxySettingsActivity(this.currentInfo));
        }

        public void lambda$setSelectionEnabled$1(float f, float f2, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float fLerp = AndroidUtilities.lerp(f, f2, fFloatValue);
            this.textView.setTranslationX(fLerp);
            this.valueTextView.setTranslationX(fLerp);
            this.checkImageView.setTranslationX(fLerp);
            this.checkBox.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : -AndroidUtilities.dp(32.0f)) + fLerp);
            float f3 = (fFloatValue * 0.5f) + 0.5f;
            this.checkBox.setScaleX(f3);
            this.checkBox.setScaleY(f3);
            this.checkBox.setAlpha(fFloatValue);
            float f4 = 1.0f - fFloatValue;
            float f5 = (f4 * 0.5f) + 0.5f;
            this.checkImageView.setScaleX(f5);
            this.checkImageView.setScaleY(f5);
            this.checkImageView.setAlpha(f4);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateStatus();
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ArticleViewer$10$$ExternalSyntheticOutline0.m(64.0f, 1, 1073741824));
        }

        public void setChecked(boolean z) {
            if (!z) {
                this.valueTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
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
                this.valueTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.checkDrawable, (Drawable) null);
            } else {
                this.valueTextView.setCompoundDrawablesWithIntrinsicBounds(this.checkDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public void setItemSelected(boolean z, boolean z2) {
            if (z == this.isSelected && z2) {
                return;
            }
            this.isSelected = z;
            this.checkBox.setChecked(z, z2);
        }

        public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
            this.textView.setText(proxyInfo.address + ":" + proxyInfo.port);
            this.currentInfo = proxyInfo;
        }

        public void setSelectionEnabled(final boolean z, boolean z2) {
            if (this.isSelectionEnabled == z && z2) {
                return;
            }
            this.isSelectionEnabled = z;
            float fDp = LocaleController.isRTL ? -AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
            if (z2) {
                ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda150(this, fDp, 3));
                duration.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            TextDetailProxyCell.this.checkImageView.setVisibility(8);
                        } else {
                            TextDetailProxyCell.this.checkBox.setVisibility(8);
                        }
                    }

                    @Override
                    public void onAnimationStart(Animator animator) {
                        if (z) {
                            TextDetailProxyCell.this.checkBox.setAlpha(0.0f);
                            TextDetailProxyCell.this.checkBox.setVisibility(0);
                        } else {
                            TextDetailProxyCell.this.checkImageView.setAlpha(0.0f);
                            TextDetailProxyCell.this.checkImageView.setVisibility(0);
                        }
                    }
                });
                duration.start();
                return;
            }
            if (!z) {
                fDp = 0.0f;
            }
            this.textView.setTranslationX(fDp);
            this.valueTextView.setTranslationX(fDp);
            this.checkImageView.setTranslationX(fDp);
            CheckBox2 checkBox2 = this.checkBox;
            boolean z3 = LocaleController.isRTL;
            int iDp = AndroidUtilities.dp(32.0f);
            if (!z3) {
                iDp = -iDp;
            }
            checkBox2.setTranslationX(iDp + fDp);
            this.checkImageView.setVisibility(z ? 8 : 0);
            this.checkImageView.setAlpha(1.0f);
            this.checkImageView.setScaleX(1.0f);
            this.checkImageView.setScaleY(1.0f);
            this.checkBox.setVisibility(z ? 0 : 8);
            this.checkBox.setAlpha(1.0f);
            this.checkBox.setScaleX(1.0f);
            this.checkBox.setScaleY(1.0f);
        }

        public void setValue(CharSequence charSequence) {
            this.valueTextView.setText(charSequence);
        }

        public void updateStatus() {
            int i;
            if (SharedConfig.currentProxy != this.currentInfo || !ProxyListActivity.this.useProxySettings) {
                SharedConfig.ProxyInfo proxyInfo = this.currentInfo;
                if (proxyInfo.checking) {
                    this.valueTextView.setText(LocaleController.getString(R.string.Checking));
                    i = Theme.key_windowBackgroundWhiteGrayText2;
                } else if (proxyInfo.available) {
                    if (proxyInfo.ping != 0) {
                        TextView textView = this.valueTextView;
                        StringBuilder sb = new StringBuilder();
                        zzko.m(R.string.Available, ", ", sb);
                        sb.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.currentInfo.ping)));
                        textView.setText(sb.toString());
                    } else {
                        this.valueTextView.setText(LocaleController.getString(R.string.Available));
                    }
                    i = Theme.key_windowBackgroundWhiteGreenText;
                } else {
                    this.valueTextView.setText(LocaleController.getString(R.string.Unavailable));
                    i = Theme.key_text_RedRegular;
                }
            } else if (ProxyListActivity.this.currentConnectionState == 3 || ProxyListActivity.this.currentConnectionState == 5) {
                int i2 = Theme.key_windowBackgroundWhiteBlueText6;
                if (this.currentInfo.ping != 0) {
                    TextView textView2 = this.valueTextView;
                    StringBuilder sb2 = new StringBuilder();
                    zzko.m(R.string.Connected, ", ", sb2);
                    sb2.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.currentInfo.ping)));
                    textView2.setText(sb2.toString());
                } else {
                    this.valueTextView.setText(LocaleController.getString(R.string.Connected));
                }
                SharedConfig.ProxyInfo proxyInfo2 = this.currentInfo;
                if (!proxyInfo2.checking && !proxyInfo2.available) {
                    proxyInfo2.availableCheckTime = 0L;
                }
                i = i2;
            } else {
                i = Theme.key_windowBackgroundWhiteGrayText2;
                this.valueTextView.setText(LocaleController.getString(R.string.Connecting));
            }
            this.color = Theme.getColor(null, i, false);
            this.valueTextView.setTag(Integer.valueOf(i));
            this.valueTextView.setTextColor(this.color);
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

    private void checkProxyList() {
        int size = this.proxyList.size();
        for (int i = 0; i < size; i++) {
            SharedConfig.ProxyInfo proxyInfo = this.proxyList.get(i);
            if (!proxyInfo.checking && SystemClock.elapsedRealtime() - proxyInfo.availableCheckTime >= 120000) {
                proxyInfo.checking = true;
                proxyInfo.proxyCheckPingId = ConnectionsManager.getInstance(this.currentAccount).checkProxy(proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, new TodoItemMenu$$ExternalSyntheticLambda3(proxyInfo, 17));
            }
        }
    }

    public static void lambda$checkProxyList$5(SharedConfig.ProxyInfo proxyInfo, long j) {
        proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
        proxyInfo.checking = false;
        if (j == -1) {
            proxyInfo.available = false;
            proxyInfo.ping = 0L;
        } else {
            proxyInfo.ping = j;
            proxyInfo.available = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
    }

    public static void lambda$checkProxyList$6(SharedConfig.ProxyInfo proxyInfo, long j) {
        AndroidUtilities.runOnUIThread(new LinkManager$3$$ExternalSyntheticLambda0(proxyInfo, j, 5));
    }

    public void lambda$createView$0(AlertDialog alertDialog, int i) {
        Iterator<SharedConfig.ProxyInfo> it = this.proxyList.iterator();
        while (it.hasNext()) {
            SharedConfig.deleteProxy(it.next());
        }
        this.useProxyForCalls = false;
        this.useProxySettings = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i2 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(this, i2);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(this, i2);
        updateRows(true);
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.useProxyRow, 0);
            this.listAdapter.notifyItemChanged(this.callsRow, 0);
            this.listAdapter.clearSelected();
        }
    }

    public void lambda$createView$1(View view, int i) {
        if (i == this.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (this.proxyList.isEmpty()) {
                    presentFragment(new ProxySettingsActivity());
                    return;
                }
                SharedConfig.currentProxy = this.proxyList.get(0);
                if (!this.useProxySettings) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.putString("proxy_ip", SharedConfig.currentProxy.address);
                    editorEdit.putString("proxy_pass", SharedConfig.currentProxy.password);
                    editorEdit.putString("proxy_user", SharedConfig.currentProxy.username);
                    editorEdit.putInt("proxy_port", SharedConfig.currentProxy.port);
                    editorEdit.putString("proxy_secret", SharedConfig.currentProxy.secret);
                    editorEdit.commit();
                }
            }
            this.useProxySettings = !this.useProxySettings;
            updateRows(true);
            MessagesController.getGlobalMainSettings();
            ((TextCheckCell) view).setChecked(this.useProxySettings);
            if (!this.useProxySettings) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(this.callsRow);
                if (holder != null) {
                    ((TextCheckCell) holder.itemView).setChecked(false);
                }
                this.useProxyForCalls = false;
            }
            SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
            editorEdit2.putBoolean("proxy_enabled", this.useProxySettings);
            editorEdit2.commit();
            boolean z = this.useProxySettings;
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
            ConnectionsManager.setProxySettings(z, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i2 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(this, i2);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(this, i2);
            for (int i3 = this.proxyStartRow; i3 < this.proxyEndRow; i3++) {
                RecyclerListView.Holder holder2 = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(i3);
                if (holder2 != null) {
                    ((TextDetailProxyCell) holder2.itemView).updateStatus();
                }
            }
            return;
        }
        if (i == this.rotationRow) {
            boolean z2 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z2;
            ((TextCheckCell) view).setChecked(z2);
            SharedConfig.saveConfig();
            updateRows(true);
            return;
        }
        if (i == this.callsRow) {
            boolean z3 = !this.useProxyForCalls;
            this.useProxyForCalls = z3;
            ((TextCheckCell) view).setChecked(z3);
            SharedPreferences.Editor editorEdit3 = MessagesController.getGlobalMainSettings().edit();
            editorEdit3.putBoolean("proxy_enabled_calls", this.useProxyForCalls);
            editorEdit3.commit();
            return;
        }
        if (i < this.proxyStartRow || i >= this.proxyEndRow) {
            if (i == this.proxyAddRow) {
                presentFragment(new ProxySettingsActivity());
                return;
            }
            if (i == this.deleteAllRow) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder.setMessage(LocaleController.getString(R.string.DeleteAllProxiesConfirm));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setTitle(LocaleController.getString(R.string.DeleteProxyTitle));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ProxyListActivity$$ExternalSyntheticLambda4(this));
                AlertDialog alertDialogCreate = builder.create();
                showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            return;
        }
        if (!this.selectedItems.isEmpty()) {
            this.listAdapter.toggleSelected(i);
            return;
        }
        SharedConfig.ProxyInfo proxyInfo2 = this.proxyList.get(i - this.proxyStartRow);
        this.useProxySettings = true;
        SharedPreferences.Editor editorEdit4 = MessagesController.getGlobalMainSettings().edit();
        editorEdit4.putString("proxy_ip", proxyInfo2.address);
        editorEdit4.putString("proxy_pass", proxyInfo2.password);
        editorEdit4.putString("proxy_user", proxyInfo2.username);
        editorEdit4.putInt("proxy_port", proxyInfo2.port);
        editorEdit4.putString("proxy_secret", proxyInfo2.secret);
        editorEdit4.putBoolean("proxy_enabled", this.useProxySettings);
        if (!proxyInfo2.secret.isEmpty()) {
            this.useProxyForCalls = false;
            editorEdit4.putBoolean("proxy_enabled_calls", false);
        }
        editorEdit4.commit();
        SharedConfig.currentProxy = proxyInfo2;
        for (int i4 = this.proxyStartRow; i4 < this.proxyEndRow; i4++) {
            RecyclerListView.Holder holder3 = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(i4);
            if (holder3 != null) {
                TextDetailProxyCell textDetailProxyCell = (TextDetailProxyCell) holder3.itemView;
                textDetailProxyCell.setChecked(textDetailProxyCell.currentInfo == proxyInfo2);
                textDetailProxyCell.updateStatus();
            }
        }
        updateRows(false);
        RecyclerListView.Holder holder4 = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(this.useProxyRow);
        if (holder4 != null) {
            ((TextCheckCell) holder4.itemView).setChecked(true);
        }
        boolean z4 = this.useProxySettings;
        SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
        ConnectionsManager.setProxySettings(z4, proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret);
    }

    public boolean lambda$createView$2(View view, int i) {
        if (i < this.proxyStartRow || i >= this.proxyEndRow) {
            return false;
        }
        this.listAdapter.toggleSelected(i);
        return true;
    }

    public static boolean lambda$createView$3(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$didReceivedNotification$7(View view) {
        View view2 = this.listView.getChildViewHolder(view).itemView;
        if (view2 instanceof TextDetailProxyCell) {
            TextDetailProxyCell textDetailProxyCell = (TextDetailProxyCell) view2;
            textDetailProxyCell.setChecked(textDetailProxyCell.currentInfo == SharedConfig.currentProxy);
            textDetailProxyCell.updateStatus();
        }
    }

    public static int lambda$updateRows$4(boolean z, SharedConfig.ProxyInfo proxyInfo, SharedConfig.ProxyInfo proxyInfo2) {
        SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
        long j = proxyInfo3 == proxyInfo ? -200000L : 0L;
        if (!proxyInfo.available) {
            j += 100000;
        }
        long j2 = proxyInfo3 == proxyInfo2 ? -200000L : 0L;
        if (!proxyInfo2.available) {
            j2 += 100000;
        }
        return Long.compare((!z || proxyInfo == proxyInfo3) ? j + proxyInfo.ping : ((long) SharedConfig.proxyList.indexOf(proxyInfo)) * 10000, (!z || proxyInfo2 == SharedConfig.currentProxy) ? proxyInfo2.ping + j2 : ((long) SharedConfig.proxyList.indexOf(proxyInfo2)) * 10000);
    }

    public void updateRows(boolean z) {
        boolean z2;
        ListAdapter listAdapter;
        final boolean z3;
        this.rowCount = 1;
        this.useProxyRow = 0;
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
        if (z) {
            this.proxyList.clear();
            this.proxyList.addAll(SharedConfig.proxyList);
            if (this.wasCheckedAllList) {
                z3 = false;
            } else {
                Iterator<SharedConfig.ProxyInfo> it = this.proxyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    }
                    SharedConfig.ProxyInfo next = it.next();
                    if (next.checking || next.availableCheckTime == 0) {
                        z3 = true;
                        break;
                    }
                }
                if (!z3) {
                    this.wasCheckedAllList = true;
                }
            }
            Collections.sort(this.proxyList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return ProxyListActivity.lambda$updateRows$4(z3, (SharedConfig.ProxyInfo) obj, (SharedConfig.ProxyInfo) obj2);
                }
            });
        }
        if (this.proxyList.isEmpty()) {
            this.proxyStartRow = -1;
            this.proxyEndRow = -1;
        } else {
            int i5 = this.rowCount;
            this.proxyStartRow = i5;
            int size = this.proxyList.size() + i5;
            this.rowCount = size;
            this.proxyEndRow = size;
        }
        int i6 = this.rowCount;
        this.proxyAddRow = i6;
        this.rowCount = i6 + 2;
        this.proxyShadowRow = i6 + 1;
        SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
        if (proxyInfo == null || proxyInfo.secret.isEmpty()) {
            z2 = this.callsRow == -1;
            int i7 = this.rowCount;
            this.callsRow = i7;
            this.rowCount = i7 + 2;
            this.callsDetailRow = i7 + 1;
            if (!z && z2) {
                this.listAdapter.lambda$onBindViewHolder$31(this.proxyShadowRow);
                this.listAdapter.notifyItemRangeInserted(this.proxyShadowRow + 1, 2);
            }
        } else {
            z2 = this.callsRow != -1;
            this.callsRow = -1;
            this.callsDetailRow = -1;
            if (!z && z2) {
                this.listAdapter.lambda$onBindViewHolder$31(this.proxyShadowRow);
                this.listAdapter.notifyItemRangeRemoved(this.proxyShadowRow + 1, 2);
            }
        }
        if (this.proxyList.size() >= 10) {
            int i8 = this.rowCount;
            this.rowCount = i8 + 1;
            this.deleteAllRow = i8;
        } else {
            this.deleteAllRow = -1;
        }
        checkProxyList();
        if (!z || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.notifyDataSetChanged();
    }

    @Override
    public View createView(Context context) {
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ProxyListActivity.this.finishFragment();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setTranslationInterpolator(CubicBezierInterpolator.DEFAULT);
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda11(this, 3));
        this.listView.setOnItemLongClickListener(new ProxyListActivity$$ExternalSyntheticLambda4(this));
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedCountTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
        actionBarMenuCreateActionMode.addView(this.selectedCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(27));
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth = actionBarMenuCreateActionMode.addItemWithWidth(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        this.shareMenuItem = actionBarMenuItemAddItemWithWidth;
        actionBarMenuItemAddItemWithWidth.setContentDescription(LocaleController.getString(R.string.StickersShare));
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth2 = actionBarMenuCreateActionMode.addItemWithWidth(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        this.deleteMenuItem = actionBarMenuItemAddItemWithWidth2;
        actionBarMenuItemAddItemWithWidth2.setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2(context));
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView.Holder holder;
        SharedConfig.ProxyInfo proxyInfo;
        RecyclerListView.Holder holder2;
        boolean z = false;
        if (i == NotificationCenter.proxyChangedByRotation) {
            this.listView.forAllChild(new ChatActivity$$ExternalSyntheticLambda353(this, 7));
            updateRows(false);
            return;
        }
        if (i == NotificationCenter.proxySettingsChanged) {
            updateRows(true);
            return;
        }
        if (i == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.currentConnectionState != connectionState) {
                this.currentConnectionState = connectionState;
                if (this.listView == null || (proxyInfo = SharedConfig.currentProxy) == null) {
                    return;
                }
                int iIndexOf = this.proxyList.indexOf(proxyInfo);
                if (iIndexOf >= 0 && (holder2 = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(iIndexOf + this.proxyStartRow)) != null) {
                    ((TextDetailProxyCell) holder2.itemView).updateStatus();
                }
                if (this.currentConnectionState == 3) {
                    updateRows(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != NotificationCenter.proxyCheckDone || this.listView == null) {
            return;
        }
        int iIndexOf2 = this.proxyList.indexOf((SharedConfig.ProxyInfo) objArr[0]);
        if (iIndexOf2 >= 0 && (holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(iIndexOf2 + this.proxyStartRow)) != null) {
            ((TextDetailProxyCell) holder.itemView).updateStatus();
        }
        if (!this.wasCheckedAllList) {
            for (SharedConfig.ProxyInfo proxyInfo2 : this.proxyList) {
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
        updateRows(true);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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
    public boolean onBackPressed(boolean z) {
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
    public void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public boolean onFragmentCreate() {
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
        updateRows(true);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        public static final int PAYLOAD_CHECKED_CHANGED = 0;
        public static final int PAYLOAD_SELECTION_CHANGED = 1;
        public static final int PAYLOAD_SELECTION_MODE_CHANGED = 2;
        private static final int VIEW_TYPE_HEADER = 2;
        private static final int VIEW_TYPE_INFO = 4;
        private static final int VIEW_TYPE_PROXY_DETAIL = 5;
        private static final int VIEW_TYPE_SHADOW = 0;
        private static final int VIEW_TYPE_SLIDE_CHOOSER = 6;
        private static final int VIEW_TYPE_TEXT_CHECK = 3;
        private static final int VIEW_TYPE_TEXT_SETTING = 1;
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        private void checkActionMode() {
            int size = ProxyListActivity.this.selectedItems.size();
            boolean zIsActionModeShowed = ((BaseFragment) ProxyListActivity.this).actionBar.isActionModeShowed();
            if (size <= 0) {
                if (zIsActionModeShowed) {
                    ((BaseFragment) ProxyListActivity.this).actionBar.hideActionMode();
                    notifyItemRangeChanged(ProxyListActivity.this.proxyStartRow, ProxyListActivity.this.proxyEndRow - ProxyListActivity.this.proxyStartRow, 2);
                    return;
                }
                return;
            }
            ProxyListActivity.this.selectedCountTextView.setNumber(size, zIsActionModeShowed);
            if (zIsActionModeShowed) {
                return;
            }
            ((BaseFragment) ProxyListActivity.this).actionBar.showActionMode();
            notifyItemRangeChanged(ProxyListActivity.this.proxyStartRow, ProxyListActivity.this.proxyEndRow - ProxyListActivity.this.proxyStartRow, 2);
        }

        public static void lambda$onBindViewHolder$0(int i) {
            SharedConfig.proxyRotationTimeout = i;
            SharedConfig.saveConfig();
        }

        public void clearSelected() {
            ProxyListActivity.this.selectedItems.clear();
            notifyItemRangeChanged(ProxyListActivity.this.proxyStartRow, ProxyListActivity.this.proxyEndRow - ProxyListActivity.this.proxyStartRow, 1);
            checkActionMode();
        }

        @Override
        public int getItemCount() {
            return ProxyListActivity.this.rowCount;
        }

        @Override
        public long getItemId(int i) {
            if (i == ProxyListActivity.this.useProxyShadowRow) {
                return -1L;
            }
            if (i == ProxyListActivity.this.proxyShadowRow) {
                return -2L;
            }
            if (i == ProxyListActivity.this.proxyAddRow) {
                return -3L;
            }
            if (i == ProxyListActivity.this.useProxyRow) {
                return -4L;
            }
            if (i == ProxyListActivity.this.callsRow) {
                return -5L;
            }
            if (i == ProxyListActivity.this.connectionsHeaderRow) {
                return -6L;
            }
            if (i == ProxyListActivity.this.deleteAllRow) {
                return -8L;
            }
            if (i == ProxyListActivity.this.rotationRow) {
                return -9L;
            }
            if (i == ProxyListActivity.this.rotationTimeoutRow) {
                return -10L;
            }
            if (i == ProxyListActivity.this.rotationTimeoutInfoRow) {
                return -11L;
            }
            if (i < ProxyListActivity.this.proxyStartRow || i >= ProxyListActivity.this.proxyEndRow) {
                return -7L;
            }
            return ((SharedConfig.ProxyInfo) ProxyListActivity.this.proxyList.get(i - ProxyListActivity.this.proxyStartRow)).hashCode();
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ProxyListActivity.this.useProxyShadowRow || i == ProxyListActivity.this.proxyShadowRow) {
                return 0;
            }
            if (i == ProxyListActivity.this.proxyAddRow || i == ProxyListActivity.this.deleteAllRow) {
                return 1;
            }
            if (i == ProxyListActivity.this.useProxyRow || i == ProxyListActivity.this.rotationRow || i == ProxyListActivity.this.callsRow) {
                return 3;
            }
            if (i == ProxyListActivity.this.connectionsHeaderRow) {
                return 2;
            }
            if (i == ProxyListActivity.this.rotationTimeoutRow) {
                return 6;
            }
            return (i < ProxyListActivity.this.proxyStartRow || i >= ProxyListActivity.this.proxyEndRow) ? 4 : 5;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition == ProxyListActivity.this.useProxyRow || adapterPosition == ProxyListActivity.this.rotationRow || adapterPosition == ProxyListActivity.this.callsRow || adapterPosition == ProxyListActivity.this.proxyAddRow || adapterPosition == ProxyListActivity.this.deleteAllRow) {
                return true;
            }
            return adapterPosition >= ProxyListActivity.this.proxyStartRow && adapterPosition < ProxyListActivity.this.proxyEndRow;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            switch (viewHolder.getItemViewType()) {
                case 1:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                    if (i == ProxyListActivity.this.proxyAddRow) {
                        textSettingsCell.setText(LocaleController.getString(R.string.AddProxy), ProxyListActivity.this.deleteAllRow != -1);
                    } else if (i == ProxyListActivity.this.deleteAllRow) {
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        textSettingsCell.setText(LocaleController.getString(R.string.DeleteAllProxies), false);
                    }
                    break;
                case 2:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == ProxyListActivity.this.connectionsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.ProxyConnections));
                    }
                    break;
                case 3:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (i == ProxyListActivity.this.useProxyRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UseProxySettings), ProxyListActivity.this.useProxySettings, ProxyListActivity.this.rotationRow != -1);
                    } else if (i == ProxyListActivity.this.callsRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UseProxyForCalls), ProxyListActivity.this.useProxyForCalls, false);
                    } else if (i == ProxyListActivity.this.rotationRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    }
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == ProxyListActivity.this.callsDetailRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    } else if (i == ProxyListActivity.this.rotationTimeoutInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    }
                    break;
                case 5:
                    TextDetailProxyCell textDetailProxyCell = (TextDetailProxyCell) viewHolder.itemView;
                    SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) ProxyListActivity.this.proxyList.get(i - ProxyListActivity.this.proxyStartRow);
                    textDetailProxyCell.setProxy(proxyInfo);
                    textDetailProxyCell.setChecked(SharedConfig.currentProxy == proxyInfo);
                    textDetailProxyCell.setItemSelected(ProxyListActivity.this.selectedItems.contains(ProxyListActivity.this.proxyList.get(i - ProxyListActivity.this.proxyStartRow)), false);
                    textDetailProxyCell.setSelectionEnabled(!ProxyListActivity.this.selectedItems.isEmpty(), false);
                    break;
                case 6:
                    if (i == ProxyListActivity.this.rotationTimeoutRow) {
                        SlideChooseView slideChooseView = (SlideChooseView) viewHolder.itemView;
                        ArrayList arrayList = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                        String[] strArr = new String[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            strArr[i2] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList.get(i2));
                        }
                        slideChooseView.setCallback(new ChatActivity$$ExternalSyntheticLambda49(9));
                        slideChooseView.setOptions(SharedConfig.proxyRotationTimeout, strArr);
                    }
                    break;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            if (i == 0) {
                shadowSectionCell = new ShadowSectionCell(this.mContext, null, 0);
            } else if (i == 1) {
                shadowSectionCell = new TextSettingsCell(this.mContext, null, 0);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 2) {
                shadowSectionCell = new HeaderCell(this.mContext);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 3) {
                shadowSectionCell = new TextCheckCell(this.mContext);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 4) {
                shadowSectionCell = new TextInfoPrivacyCell(this.mContext, 24, null);
            } else if (i != 6) {
                shadowSectionCell = ProxyListActivity.this.new TextDetailProxyCell(this.mContext);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else {
                shadowSectionCell = new SlideChooseView(this.mContext);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
            return zzkd.m(shadowSectionCell, shadowSectionCell, -2);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition == ProxyListActivity.this.useProxyRow) {
                    textCheckCell.setChecked(ProxyListActivity.this.useProxySettings);
                } else if (adapterPosition == ProxyListActivity.this.callsRow) {
                    textCheckCell.setChecked(ProxyListActivity.this.useProxyForCalls);
                } else if (adapterPosition == ProxyListActivity.this.rotationRow) {
                    textCheckCell.setChecked(SharedConfig.proxyRotationEnabled);
                }
            }
        }

        public void toggleSelected(int i) {
            if (i < ProxyListActivity.this.proxyStartRow || i >= ProxyListActivity.this.proxyEndRow) {
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) ProxyListActivity.this.proxyList.get(i - ProxyListActivity.this.proxyStartRow);
            if (ProxyListActivity.this.selectedItems.contains(proxyInfo)) {
                ProxyListActivity.this.selectedItems.remove(proxyInfo);
            } else {
                ProxyListActivity.this.selectedItems.add(proxyInfo);
            }
            notifyItemChanged(i, 1);
            checkActionMode();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            if (viewHolder.getItemViewType() == 5 && !list.isEmpty()) {
                TextDetailProxyCell textDetailProxyCell = (TextDetailProxyCell) viewHolder.itemView;
                if (list.contains(1)) {
                    textDetailProxyCell.setItemSelected(ProxyListActivity.this.selectedItems.contains(ProxyListActivity.this.proxyList.get(i - ProxyListActivity.this.proxyStartRow)), true);
                }
                if (list.contains(2)) {
                    textDetailProxyCell.setSelectionEnabled(!ProxyListActivity.this.selectedItems.isEmpty(), true);
                    return;
                }
                return;
            }
            if (viewHolder.getItemViewType() == 3 && list.contains(0)) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == ProxyListActivity.this.useProxyRow) {
                    textCheckCell.setChecked(ProxyListActivity.this.useProxySettings);
                    return;
                } else if (i == ProxyListActivity.this.callsRow) {
                    textCheckCell.setChecked(ProxyListActivity.this.useProxyForCalls);
                    return;
                } else {
                    if (i == ProxyListActivity.this.rotationRow) {
                        textCheckCell.setChecked(SharedConfig.proxyRotationEnabled);
                        return;
                    }
                    return;
                }
            }
            super.onBindViewHolder(viewHolder, i, list);
        }
    }
}
