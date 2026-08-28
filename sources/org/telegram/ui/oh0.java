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
public final class oh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.hb0 f41158n;
    public static final org.telegram.ui.Components.hb0 f41159r;
    public final int f41160a;
    public final org.telegram.ui.Components.o9 f41161b;
    public final org.telegram.ui.ActionBar.h5 f41162c;
    public final TextView d;
    public final org.telegram.ui.Components.z8 f41163e;
    public final org.telegram.ui.Components.sv0 f41164f;
    public TLObject h;

    static {
        int i9 = R.drawable.msg_mini_checks;
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        f41158n = new org.telegram.ui.Components.hb0(i9, i10);
        f41159r = new org.telegram.ui.Components.hb0(R.drawable.mini_checklist_done_outline, i10);
    }

    public oh0(Context context) {
        super(context);
        int i9;
        this.f41160a = UserConfig.selectedAccount;
        this.f41163e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f41161b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41162c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        h5Var.setGravity(i9);
        this.f41164f = new org.telegram.ui.Components.sv0(this);
        h5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(o9Var, g7.e6.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(h5Var, g7.e6.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, g7.e6.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(o9Var, g7.e6.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(h5Var, g7.e6.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, g7.e6.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i9) {
        org.telegram.ui.Components.i5 a2;
        org.telegram.ui.Components.hb0 hb0Var;
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23389z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.sv0 sv0Var = this.f41164f;
        if (z11) {
            a2 = sv0Var.a((TLRPC.User) tLObject, null, w02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = sv0Var.a(null, (TLRPC.Chat) tLObject, w02, false);
        } else {
            a2 = sv0Var.a(null, null, w02, false);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f41162c;
        h5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.z8 z8Var = this.f41163e;
            int i10 = this.f41160a;
            z8Var.j(i10, tLObject);
            this.f41161b.h(ImageLocation.getForUserOrChat(i10, tLObject, 1), "50_50", z8Var, tLObject);
            h5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i9 <= 0) {
            textView.setVisibility(8);
            h5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            hb0Var = f41159r;
        } else {
            hb0Var = f41158n;
        }
        textView.setText(TextUtils.concat(hb0Var.a(getContext(), null), LocaleController.formatSeenDate(i9)));
        textView.setVisibility(0);
        h5Var.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.User user;
        org.telegram.ui.Components.i5 a2;
        if (i9 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f22527id == user2.f22527id) {
                this.h = user2;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23389z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.sv0 sv0Var = this.f41164f;
                if (z10) {
                    a2 = sv0Var.a(user2, null, w02, true);
                } else {
                    a2 = sv0Var.a(null, null, w02, true);
                }
                this.f41162c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41164f.f32559a.a();
        NotificationCenter.getInstance(this.f41160a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41164f.f32559a.b();
        NotificationCenter.getInstance(this.f41160a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f41162c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder e10 = ta.b.e(formatString, " ");
            e10.append((Object) textView.getText());
            formatString = e10.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
