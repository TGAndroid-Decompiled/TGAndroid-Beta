package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class kj extends FrameLayout {

    public final n9 f30112a;

    public final eg.c f30113b;

    public final org.telegram.ui.ActionBar.h5 f30114c;
    public final bp d;

    public final y8 f30115e;

    public TLRPC.User f30116f;
    public int h;

    public CharSequence f30117n;

    public CharSequence f30118r;

    public TLRPC.User f30119s;
    public String v;

    public String f30120w;

    public final int f30121x;

    public boolean f30122y;

    public kj(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30121x = UserConfig.selectedAccount;
        this.f30115e = new y8(c6Var);
        n9 n9Var = new n9(context);
        this.f30112a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        eg.c cVar = new eg.c(context, 5);
        this.f30113b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(cVar, h7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f30114c = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, c6Var));
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        bp bpVar = new bp(context, 21, c6Var);
        this.d = bpVar;
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        addView(bpVar, h7.z5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, jj jjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f30118r = null;
            this.f30117n = null;
            this.f30113b.l("", false);
            this.f30114c.l("", false);
            this.f30112a.setImageDrawable(null);
        } else {
            this.f30118r = null;
            this.f30117n = charSequence;
            this.f30116f = user;
            this.f30122y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.yq(18, this, jjVar));
    }

    public final void b() {
        TLRPC.User user = this.f30116f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        y8 y8Var = this.f30115e;
        if (user != null) {
            y8Var.m(this.f30121x, user);
            TLRPC.UserStatus userStatus = this.f30116f.status;
        } else {
            CharSequence charSequence = this.f30117n;
            if (charSequence != null) {
                y8Var.n(this.h, charSequence.toString(), null);
            } else {
                y8Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f30117n;
        eg.c cVar = this.f30113b;
        if (charSequence2 != null) {
            this.f30120w = null;
            cVar.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f30116f;
            if (user2 != null) {
                this.f30120w = UserObject.getUserName(user2);
            } else {
                this.f30120w = "";
            }
            cVar.l(this.f30120w, false);
        }
        setStatus(this.f30118r);
        TLRPC.User user3 = this.f30116f;
        n9 n9Var = this.f30112a;
        if (user3 != null) {
            n9Var.e(user3, y8Var);
        } else {
            n9Var.setImageDrawable(y8Var);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f30122y) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f30122y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f30118r = charSequence;
        if (charSequence != null) {
            this.f30114c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f30116f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f30114c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f30119s != this.f30116f && (str = this.v) != null) {
                this.f30114c.l(str, false);
            } else {
                this.f30114c.l("", false);
                Utilities.globalQueue.postRunnable(new ij(this, 0));
            }
        }
    }
}
