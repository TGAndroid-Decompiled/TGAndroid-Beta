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
    public static final org.telegram.ui.Components.bd0 f38066n;
    public static final org.telegram.ui.Components.bd0 f38067r;
    public final int f38068a;
    public final org.telegram.ui.Components.y9 f38069b;
    public final org.telegram.ui.ActionBar.j5 f38070c;
    public final TextView d;
    public final org.telegram.ui.Components.j9 f38071e;
    public final org.telegram.ui.Components.ox0 f38072f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.i6.f21185y6;
        f38066n = new org.telegram.ui.Components.bd0(i10, i11);
        f38067r = new org.telegram.ui.Components.bd0(R.drawable.mini_checklist_done_outline, i11);
    }

    public gi0(Context context) {
        super(context);
        int i10;
        this.f38068a = UserConfig.selectedAccount;
        this.f38071e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f38069b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f38070c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        this.f38072f = new org.telegram.ui.Components.ox0(this);
        j5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21185y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(y9Var, w7.x5.a(34.0f, 0.0f, 0.0f, 10.0f, 0.0f, 34, 21));
            addView(j5Var, w7.x5.a(-2.0f, 8.0f, 5.33f, 55.0f, 0.0f, -2, 53));
            addView(textView, w7.x5.a(-2.0f, 13.0f, 19.0f, 55.0f, 0.0f, -2, 53));
            return;
        }
        addView(y9Var, w7.x5.a(34.0f, 10.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        addView(j5Var, w7.x5.a(-2.0f, 55.0f, 5.33f, 8.0f, 0.0f, -2, 51));
        addView(textView, w7.x5.a(-2.0f, 55.0f, 19.0f, 13.0f, 0.0f, -2, 51));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.q5 a2;
        org.telegram.ui.Components.bd0 bd0Var;
        this.h = tLObject;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21206z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.ox0 ox0Var = this.f38072f;
        if (z11) {
            a2 = ox0Var.a((TLRPC.User) tLObject, null, x02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = ox0Var.a(null, (TLRPC.Chat) tLObject, x02, false);
        } else {
            a2 = ox0Var.a(null, null, x02, false);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f38070c;
        j5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.j9 j9Var = this.f38071e;
            int i11 = this.f38068a;
            j9Var.j(i11, tLObject);
            this.f38069b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", j9Var, tLObject);
            j5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            j5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            bd0Var = f38067r;
        } else {
            bd0Var = f38066n;
        }
        textView.setText(TextUtils.concat(bd0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        j5Var.setTranslationY(0.0f);
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
            if (user != null && user2 != null && user.f20189id == user2.f20189id) {
                this.h = user2;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21206z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.ox0 ox0Var = this.f38072f;
                if (z10) {
                    a2 = ox0Var.a(user2, null, x02, true);
                } else {
                    a2 = ox0Var.a(null, null, x02, true);
                }
                this.f38070c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38072f.f29616a.a();
        NotificationCenter.getInstance(this.f38068a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38072f.f29616a.b();
        NotificationCenter.getInstance(this.f38068a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f38070c.getText());
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
