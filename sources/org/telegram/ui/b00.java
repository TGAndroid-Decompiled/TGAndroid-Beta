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
public abstract class b00 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public TL_chatlists.TL_exportedChatlistInvite D;
    public final org.telegram.ui.ActionBar.k2 f35875a;
    public final int f35876b;
    public final int f35877c;
    public final Drawable d;
    public final Drawable e;
    public final org.telegram.ui.Components.f6 f35878f;
    public final org.telegram.ui.Components.f6 h;
    public final Paint f35879n;
    public final Paint f35880r;
    public float f35881s;
    public boolean f35882w;
    public ValueAnimator f35883x;
    public String f35884y;

    public b00(Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        super(context);
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        float f13;
        float f14;
        this.f35875a = k2Var;
        this.f35876b = i10;
        this.f35877c = i11;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, false);
        this.f35878f = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.66f));
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, null);
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        f6Var.setGravity(i12);
        f6Var.setEllipsizeByGradient(true);
        boolean z10 = org.telegram.messenger.dd.X;
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        addView(f6Var, w7.b6.d(-1, 20.0f, 55, f7, 10.33f, f10, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.h = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.f21331z6, null);
        if (org.telegram.messenger.dd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        f6Var2.setGravity(i13);
        boolean z11 = org.telegram.messenger.dd.X;
        if (z11) {
            f11 = 56.0f;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 56.0f;
        }
        addView(f6Var2, w7.b6.d(-1, 16.0f, 55, f11, 33.33f, f12, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231245));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i14 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i14, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        int i15 = org.telegram.ui.ActionBar.t6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i15, null, mode);
        imageView.setOnClickListener(new a(this, 24));
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        boolean z12 = org.telegram.messenger.dd.X;
        int i16 = (z12 ? 3 : 5) | 16;
        if (z12) {
            f13 = 8.0f;
        } else {
            f13 = 4.0f;
        }
        if (z12) {
            f14 = 4.0f;
        } else {
            f14 = 8.0f;
        }
        addView(imageView, w7.b6.d(40, 40.0f, i16, f13, 4.0f, f14, 4.0f));
        Paint paint = new Paint();
        this.f35879n = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        Paint paint2 = new Paint();
        this.f35880r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.kk, false));
        Drawable mutate = getContext().getResources().getDrawable(2131232204).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131232205).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.f35884y;
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
        tL_inputChatlistDialogFilter.filter_id = this.f35877c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        a00 a00Var = new a00(this, 2);
        ConnectionsManager.getInstance(this.f35876b).sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.Components.t20(11, this, a00Var));
        org.telegram.messenger.i0.h3(a00Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f35875a;
        if (!(k2Var instanceof h00)) {
            return;
        }
        ag.b1 b1Var = ((h00) k2Var).f37601a;
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, this);
        H.W(b1Var.U0(this, false));
        H.c(2131232319, org.telegram.messenger.dd.L0(2131750481, null), new a00(this, 0), false);
        H.c(2131232107, org.telegram.messenger.dd.L0(2131751535, null), new a00(this, 1), true);
        if (org.telegram.messenger.dd.X) {
            H.f33026i = 3;
        }
        H.Z();
    }

    public final void d() {
        if (this.f35884y == null) {
            return;
        }
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(getContext(), org.telegram.messenger.dd.L0(2131749180, null), this.f35884y, org.telegram.messenger.dd.L0(2131746521, null), false);
        oh0Var.I0();
        oh0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z10) {
        boolean z11;
        if (this.D == tL_exportedChatlistInvite) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.f35884y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.f6 f6Var = this.f35878f;
        if (isEmpty) {
            f6Var.c(str, z11, true);
        } else {
            f6Var.c(tL_exportedChatlistInvite.title, z11, true);
        }
        this.h.c(org.telegram.messenger.dd.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z11, true);
        if (this.f35882w != z10) {
            this.f35882w = z10;
            invalidate();
        }
        boolean z12 = tL_exportedChatlistInvite.revoked;
        if ((z12 ? 1.0f : 0.0f) != this.f35881s) {
            ValueAnimator valueAnimator = this.f35883x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35883x = null;
            }
            float f7 = 0.0f;
            if (z11) {
                float f10 = this.f35881s;
                if (z12) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f35883x = ofFloat;
                ofFloat.addUpdateListener(new a3(this, 10));
                this.f35883x.addListener(new org.telegram.ui.Components.ha0(14, this, z12));
                this.f35883x.setInterpolator(org.telegram.ui.Components.gr.h);
                this.f35883x.setDuration(350L);
                this.f35883x.start();
                return;
            }
            if (z12) {
                f7 = 1.0f;
            }
            this.f35881s = f7;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        int i10;
        super.onDraw(canvas);
        if (org.telegram.messenger.dd.X) {
            L = getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f);
        } else {
            L = org.telegram.messenger.i0.L(32.0f);
        }
        float f7 = L;
        canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f), this.f35879n);
        float f10 = 0.0f;
        if (this.f35881s > 0.0f) {
            canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * this.f35881s, this.f35880r);
        }
        float f11 = this.f35881s;
        if (f11 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f11) * 255.0f));
            drawable.setBounds(L - org.telegram.messenger.i0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f) + L, org.telegram.messenger.i0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f12 = this.f35881s;
        if (f12 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f12 * 255.0f));
            drawable2.setBounds(L - org.telegram.messenger.i0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f) + L, org.telegram.messenger.i0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.f35882w) {
            if (!org.telegram.messenger.dd.X) {
                f10 = org.telegram.messenger.i0.L(64.0f);
            }
            float f13 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.dd.X) {
                i10 = org.telegram.messenger.i0.L(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f13, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21053k0);
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
            str = a1.g.r(new StringBuilder(), this.D.title, "\n ");
        }
        sb2.append(str);
        sb2.append(org.telegram.messenger.dd.L0(2131749159, null));
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f35879n.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
            this.f35880r.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.kk, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
