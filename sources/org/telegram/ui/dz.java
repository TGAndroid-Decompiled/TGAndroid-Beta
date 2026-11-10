package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_chatlists;
public abstract class dz extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public TL_chatlists.TL_exportedChatlistInvite D;
    public final org.telegram.ui.ActionBar.f2 f45071a;
    public final int f45072b;
    public final int f45073c;
    public final Drawable d;
    public final Drawable f45074e;
    public final org.telegram.ui.Components.i6 f45075f;
    public final org.telegram.ui.Components.i6 h;
    public final Paint f45076n;
    public final Paint f45077r;
    public float f45078s;
    public boolean f45079w;
    public ValueAnimator f45080x;
    public String f45081y;

    public dz(Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, int i10) {
        super(context);
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f45071a = f2Var;
        this.f45072b = i7;
        this.f45073c = i10;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, true, false);
        this.f45075f = i6Var;
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.66f));
        org.telegram.ui.ActionBar.t6.Y(i6Var, org.telegram.ui.ActionBar.m6.G6, null);
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        i6Var.setGravity(i11);
        i6Var.setEllipsizeByGradient(true);
        boolean z9 = org.telegram.messenger.id.f23161a0;
        if (z9) {
            f10 = 56.0f;
        } else {
            f10 = 64.0f;
        }
        if (z9) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        addView(i6Var, c8.ha.d(-1, 20.0f, 55, f10, 10.33f, f11, 0.0f));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(context, false, false, false);
        this.h = i6Var2;
        i6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.f28300z6, null);
        if (org.telegram.messenger.id.f23161a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        i6Var2.setGravity(i12);
        boolean z10 = org.telegram.messenger.id.f23161a0;
        if (z10) {
            f12 = 56.0f;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 56.0f;
        }
        addView(i6Var2, c8.ha.d(-1, 16.0f, 55, f12, 33.33f, f13, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231244));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i13 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        int i14 = org.telegram.ui.ActionBar.m6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i14, null, mode);
        imageView.setOnClickListener(new a(this, 24));
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        boolean z11 = org.telegram.messenger.id.f23161a0;
        int i15 = (z11 ? 3 : 5) | 16;
        if (z11) {
            f14 = 8.0f;
        } else {
            f14 = 4.0f;
        }
        if (z11) {
            f15 = 4.0f;
        } else {
            f15 = 8.0f;
        }
        addView(imageView, c8.ha.d(40, 40.0f, i15, f14, 4.0f, f15, 4.0f));
        Paint paint = new Paint();
        this.f45076n = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
        Paint paint2 = new Paint();
        this.f45077r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.kk, false));
        Drawable mutate = getContext().getResources().getDrawable(2131232205).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131232206).mutate();
        this.f45074e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.f45081y;
        if (str == null) {
            substring = null;
        } else {
            substring = str.substring(str.lastIndexOf(47) + 1);
        }
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.f45073c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        cz czVar = new cz(this, 2);
        ConnectionsManager.getInstance(this.f45072b).sendRequest(tL_chatlists_deleteExportedInvite, new ld(27, this, czVar));
        org.telegram.messenger.g0.i3(czVar, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f45071a;
        if (!(f2Var instanceof jz)) {
            return;
        }
        ct ctVar = ((jz) f2Var).f47108a;
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, this);
        H.W(ctVar.U0(this, false));
        H.c(2131232320, org.telegram.messenger.id.M0(2131750472, null), new cz(this, 0), false);
        H.c(2131232108, org.telegram.messenger.id.M0(2131751534, null), new cz(this, 1), true);
        if (org.telegram.messenger.id.f23161a0) {
            H.f35201i = 3;
        }
        H.Z();
    }

    public final void d() {
        if (this.f45081y == null) {
            return;
        }
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(getContext(), org.telegram.messenger.id.M0(2131749170, null), this.f45081y, org.telegram.messenger.id.M0(2131746506, null), false);
        lg0Var.I0();
        lg0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z9) {
        boolean z10;
        if (this.D == tL_exportedChatlistInvite) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.f45081y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.i6 i6Var = this.f45075f;
        if (isEmpty) {
            i6Var.c(str, z10, true);
        } else {
            i6Var.c(tL_exportedChatlistInvite.title, z10, true);
        }
        this.h.c(org.telegram.messenger.id.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z10, true);
        if (this.f45079w != z9) {
            this.f45079w = z9;
            invalidate();
        }
        boolean z11 = tL_exportedChatlistInvite.revoked;
        if ((z11 ? 1.0f : 0.0f) != this.f45078s) {
            ValueAnimator valueAnimator = this.f45080x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f45080x = null;
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f45078s;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f45080x = ofFloat;
                ofFloat.addUpdateListener(new a3(this, 10));
                this.f45080x.addListener(new org.telegram.ui.Components.s9(28, this, z11));
                this.f45080x.setInterpolator(org.telegram.ui.Components.wq.h);
                this.f45080x.setDuration(350L);
                this.f45080x.start();
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            this.f45078s = f10;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        int i7;
        super.onDraw(canvas);
        if (org.telegram.messenger.id.f23161a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f);
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        float f10 = L;
        canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), this.f45076n);
        float f11 = 0.0f;
        if (this.f45078s > 0.0f) {
            canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * this.f45078s, this.f45077r);
        }
        float f12 = this.f45078s;
        if (f12 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f12) * 255.0f));
            drawable.setBounds(L - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + L, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f13 = this.f45078s;
        if (f13 > 0.0f) {
            Drawable drawable2 = this.f45074e;
            drawable2.setAlpha((int) (f13 * 255.0f));
            drawable2.setBounds(L - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + L, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.f45079w) {
            if (!org.telegram.messenger.id.f23161a0) {
                f11 = org.telegram.messenger.g0.L(64.0f);
            }
            float f14 = f11;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f14, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.D;
        String str2 = "";
        if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
            str = "";
        } else {
            str = a8.p0.s(new StringBuilder(), this.D.title, "\n ");
        }
        sb2.append(str);
        sb2.append(org.telegram.messenger.id.M0(2131749149, null));
        sb2.append(", ");
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.D;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str2 = "\n\n" + this.D.url;
        }
        sb2.append(str2);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f45076n.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            this.f45077r.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.kk, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
