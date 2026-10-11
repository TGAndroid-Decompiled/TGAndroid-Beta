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
public final class fi0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.bd0 f37718n;
    public static final org.telegram.ui.Components.bd0 f37719r;
    public final int f37720a;
    public final org.telegram.ui.Components.y9 f37721b;
    public final org.telegram.ui.ActionBar.h5 f37722c;
    public final TextView d;
    public final org.telegram.ui.Components.j9 f37723e;
    public final org.telegram.ui.Components.ox0 f37724f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.h6.f21207y6;
        f37718n = new org.telegram.ui.Components.bd0(i10, i11);
        f37719r = new org.telegram.ui.Components.bd0(R.drawable.mini_checklist_done_outline, i11);
    }

    public fi0(Context context) {
        super(context);
        int i10;
        this.f37720a = UserConfig.selectedAccount;
        this.f37723e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f37721b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f37722c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        this.f37724f = new org.telegram.ui.Components.ox0(this);
        h5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(y9Var, w7.x5.a(34.0f, 0.0f, 0.0f, 10.0f, 0.0f, 34, 21));
            addView(h5Var, w7.x5.a(-2.0f, 8.0f, 5.33f, 55.0f, 0.0f, -2, 53));
            addView(textView, w7.x5.a(-2.0f, 13.0f, 19.0f, 55.0f, 0.0f, -2, 53));
            return;
        }
        addView(y9Var, w7.x5.a(34.0f, 10.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        addView(h5Var, w7.x5.a(-2.0f, 55.0f, 5.33f, 8.0f, 0.0f, -2, 51));
        addView(textView, w7.x5.a(-2.0f, 55.0f, 19.0f, 13.0f, 0.0f, -2, 51));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.q5 a2;
        org.telegram.ui.Components.bd0 bd0Var;
        this.h = tLObject;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.ox0 ox0Var = this.f37724f;
        if (z11) {
            a2 = ox0Var.a((TLRPC.User) tLObject, null, x02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = ox0Var.a(null, (TLRPC.Chat) tLObject, x02, false);
        } else {
            a2 = ox0Var.a(null, null, x02, false);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f37722c;
        h5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.j9 j9Var = this.f37723e;
            int i11 = this.f37720a;
            j9Var.j(i11, tLObject);
            this.f37721b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", j9Var, tLObject);
            h5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            h5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            bd0Var = f37719r;
        } else {
            bd0Var = f37718n;
        }
        textView.setText(TextUtils.concat(bd0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        h5Var.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.User user;
        org.telegram.ui.Components.q5 a2;
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f20215id == user2.f20215id) {
                this.h = user2;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.ox0 ox0Var = this.f37724f;
                if (z10) {
                    a2 = ox0Var.a(user2, null, x02, true);
                } else {
                    a2 = ox0Var.a(null, null, x02, true);
                }
                this.f37722c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37724f.f29648a.a();
        NotificationCenter.getInstance(this.f37720a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37724f.f29648a.b();
        NotificationCenter.getInstance(this.f37720a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f37722c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder j3 = sc.v.j(formatString, " ");
            j3.append((Object) textView.getText());
            formatString = j3.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
