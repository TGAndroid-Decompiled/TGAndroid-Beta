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
public final class gi0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.mc0 f33921n;
    public static final org.telegram.ui.Components.mc0 f33922r;
    public final int f33923a;
    public final org.telegram.ui.Components.v9 f33924b;
    public final org.telegram.ui.ActionBar.j5 f33925c;
    public final TextView d;
    public final org.telegram.ui.Components.g9 e;
    public final org.telegram.ui.Components.xw0 f33926f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.j6.f19492y6;
        f33921n = new org.telegram.ui.Components.mc0(i10, i11);
        f33922r = new org.telegram.ui.Components.mc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public gi0(Context context) {
        super(context);
        int i10;
        this.f33923a = UserConfig.selectedAccount;
        this.e = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f33924b = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f33925c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        this.f33926f = new org.telegram.ui.Components.xw0(this);
        j5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19492y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(v9Var, w7.y5.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(j5Var, w7.y5.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.y5.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(v9Var, w7.y5.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(j5Var, w7.y5.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, w7.y5.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.n5 a2;
        org.telegram.ui.Components.mc0 mc0Var;
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19514z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.xw0 xw0Var = this.f33926f;
        if (z11) {
            a2 = xw0Var.a((TLRPC.User) tLObject, null, w02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = xw0Var.a(null, (TLRPC.Chat) tLObject, w02, false);
        } else {
            a2 = xw0Var.a(null, null, w02, false);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f33925c;
        j5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.g9 g9Var = this.e;
            int i11 = this.f33923a;
            g9Var.j(i11, tLObject);
            this.f33924b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", g9Var, tLObject);
            j5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            j5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            mc0Var = f33922r;
        } else {
            mc0Var = f33921n;
        }
        textView.setText(TextUtils.concat(mc0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        j5Var.setTranslationY(0.0f);
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
            if (user != null && user2 != null && user.f18490id == user2.f18490id) {
                this.h = user2;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19514z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.xw0 xw0Var = this.f33926f;
                if (z10) {
                    a2 = xw0Var.a(user2, null, w02, true);
                } else {
                    a2 = xw0Var.a(null, null, w02, true);
                }
                this.f33925c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33926f.f30419a.a();
        NotificationCenter.getInstance(this.f33923a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33926f.f30419a.b();
        NotificationCenter.getInstance(this.f33923a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f33925c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder h = v7.j0.h(formatString, " ");
            h.append((Object) textView.getText());
            formatString = h.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
