package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.wb0 f40803n;
    public static final org.telegram.ui.Components.wb0 f40804r;
    public final int f40805a;
    public final org.telegram.ui.Components.t9 f40806b;
    public final org.telegram.ui.ActionBar.h5 f40807c;
    public final TextView d;
    public final org.telegram.ui.Components.e9 f40808e;
    public final org.telegram.ui.Components.cw0 f40809f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.g6.f23433y6;
        f40803n = new org.telegram.ui.Components.wb0(i10, i11);
        f40804r = new org.telegram.ui.Components.wb0(R.drawable.mini_checklist_done_outline, i11);
    }

    public nh0(Context context) {
        super(context);
        int i10;
        this.f40805a = UserConfig.selectedAccount;
        this.f40808e = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f40806b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f40807c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        this.f40809f = new org.telegram.ui.Components.cw0(this);
        h5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(t9Var, i7.f6.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(h5Var, i7.f6.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, i7.f6.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(t9Var, i7.f6.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(h5Var, i7.f6.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, i7.f6.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.n5 a2;
        org.telegram.ui.Components.wb0 wb0Var;
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23453z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.cw0 cw0Var = this.f40809f;
        if (z11) {
            a2 = cw0Var.a((TLRPC.User) tLObject, null, w02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = cw0Var.a(null, (TLRPC.Chat) tLObject, w02, false);
        } else {
            a2 = cw0Var.a(null, null, w02, false);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f40807c;
        h5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.e9 e9Var = this.f40808e;
            int i11 = this.f40805a;
            e9Var.j(i11, tLObject);
            this.f40806b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", e9Var, tLObject);
            h5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            h5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            wb0Var = f40804r;
        } else {
            wb0Var = f40803n;
        }
        textView.setText(TextUtils.concat(wb0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        h5Var.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.User user;
        org.telegram.ui.Components.n5 a2;
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f22539id == user2.f22539id) {
                this.h = user2;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23453z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.cw0 cw0Var = this.f40809f;
                if (z10) {
                    a2 = cw0Var.a(user2, null, w02, true);
                } else {
                    a2 = cw0Var.a(null, null, w02, true);
                }
                this.f40807c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40809f.f27580a.a();
        NotificationCenter.getInstance(this.f40805a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40809f.f27580a.b();
        NotificationCenter.getInstance(this.f40805a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f40807c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder f9 = u3.c.f(formatString, " ");
            f9.append((Object) textView.getText());
            formatString = f9.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
