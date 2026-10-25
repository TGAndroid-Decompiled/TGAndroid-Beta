package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class mm extends org.telegram.ui.Components.vw0 {
    public boolean A0;
    public final un B0;
    public int f41573l0;
    public int m0;
    public int f41574n0;
    public final ArrayList f41575o0;
    public final ArrayList f41576p0;
    public final ArrayList f41577q0;
    public final ArrayList f41578r0;
    public Paint f41579s0;
    public int f41580t0;
    public final km f41581u0;
    public final km f41582v0;
    public final RectF f41583w0;
    public float f41584x0;
    public float f41585y0;
    public long f41586z0;

    public mm(un unVar, Context context, org.telegram.ui.ActionBar.j5 j5Var) {
        super(context, j5Var);
        this.B0 = unVar;
        this.f41573l0 = 0;
        this.f41575o0 = new ArrayList();
        this.f41576p0 = new ArrayList();
        this.f41577q0 = new ArrayList();
        this.f41578r0 = new ArrayList();
        this.f41581u0 = new dh.a(this) {
            public final mm f40962b;

            {
                this.f40962b = this;
            }

            @Override
            public final void b(ch.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f6296a = true;
                        return;
                }
            }

            @Override
            public final void f(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        un unVar2 = this.f40962b.B0;
                        if (unVar2.f44468x0.Z0()) {
                            unVar2.f44468x0.f(canvas, rectF);
                            return;
                        }
                        unVar2.f44468x0.C1(canvas, rectF);
                        for (int i10 = 0; i10 < unVar2.f44468x0.getChildCount(); i10++) {
                            View childAt = unVar2.f44468x0.getChildAt(i10);
                            if (!un.g2(unVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                    if (s1Var.C1()) {
                                        canvas.save();
                                        canvas.translate(0.0f, s1Var.V);
                                        s1Var.D1(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    unVar2.f44468x0.drawChild(canvas, childAt, uptimeMillis);
                                    if (s1Var.U2()) {
                                        canvas.save();
                                        canvas.translate(s1Var.getX(), s1Var.getY());
                                        s1Var.X1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                    unVar2.f44468x0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                                    canvas.restore();
                                } else {
                                    unVar2.f44468x0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        unVar2.f44468x0.D1(canvas, rectF);
                        return;
                    default:
                        mm mmVar = this.f40962b;
                        un unVar3 = mmVar.B0;
                        RectF rectF2 = mmVar.f41583w0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, mmVar.getWidth(), mmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = unVar3.Vc.e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.y6.m0(org.telegram.ui.ActionBar.y6.o1(f7 * 0.85f, unVar3.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6))));
                            }
                            ih.d.b(mmVar.f41581u0, canvas, rectF, unVar3.f44468x0, mmVar, i11);
                            bi.r1 r1Var = unVar3.X3;
                            if (r1Var != null) {
                                ih.d.b(r1Var, canvas, rectF, r1Var, mmVar, i12);
                            }
                            fi.h1 h1Var = unVar3.C1;
                            if (h1Var != null && h1Var.getVisibility() == 0) {
                                int childCount = unVar3.C1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = unVar3.C1.getChildAt(i13);
                                    if ((childAt2 instanceof wn) && childAt2.getVisibility() == 0) {
                                        mm mmVar2 = ((wn) childAt2).f45518a.f44292j1;
                                        ih.d.a(mmVar2.f41582v0, canvas, rectF, mmVar2, mmVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f41582v0 = new dh.a(this) {
            public final mm f40962b;

            {
                this.f40962b = this;
            }

            @Override
            public final void b(ch.a aVar, RectF rectF) {
                switch (r2) {
                    case 0:
                    default:
                        aVar.f6296a = true;
                        return;
                }
            }

            @Override
            public final void f(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        un unVar2 = this.f40962b.B0;
                        if (unVar2.f44468x0.Z0()) {
                            unVar2.f44468x0.f(canvas, rectF);
                            return;
                        }
                        unVar2.f44468x0.C1(canvas, rectF);
                        for (int i10 = 0; i10 < unVar2.f44468x0.getChildCount(); i10++) {
                            View childAt = unVar2.f44468x0.getChildAt(i10);
                            if (!un.g2(unVar2, childAt, rectF)) {
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                    if (s1Var.C1()) {
                                        canvas.save();
                                        canvas.translate(0.0f, s1Var.V);
                                        s1Var.D1(canvas, true, false);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    unVar2.f44468x0.drawChild(canvas, childAt, uptimeMillis);
                                    if (s1Var.U2()) {
                                        canvas.save();
                                        canvas.translate(s1Var.getX(), s1Var.getY());
                                        s1Var.X1(canvas);
                                        canvas.restore();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                    unVar2.f44468x0.drawChild(canvas, childAt, uptimeMillis);
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                                    canvas.restore();
                                } else {
                                    unVar2.f44468x0.drawChild(canvas, childAt, uptimeMillis);
                                }
                            }
                        }
                        unVar2.f44468x0.D1(canvas, rectF);
                        return;
                    default:
                        mm mmVar = this.f40962b;
                        un unVar3 = mmVar.B0;
                        RectF rectF2 = mmVar.f41583w0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, mmVar.getWidth(), mmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = unVar3.Vc.e;
                            int i11 = (int) ((1.0f - f7) * 255.0f);
                            int i12 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.y6.m0(org.telegram.ui.ActionBar.y6.o1(f7 * 0.85f, unVar3.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6))));
                            }
                            ih.d.b(mmVar.f41581u0, canvas, rectF, unVar3.f44468x0, mmVar, i11);
                            bi.r1 r1Var = unVar3.X3;
                            if (r1Var != null) {
                                ih.d.b(r1Var, canvas, rectF, r1Var, mmVar, i12);
                            }
                            fi.h1 h1Var = unVar3.C1;
                            if (h1Var != null && h1Var.getVisibility() == 0) {
                                int childCount = unVar3.C1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = unVar3.C1.getChildAt(i13);
                                    if ((childAt2 instanceof wn) && childAt2.getVisibility() == 0) {
                                        mm mmVar2 = ((wn) childAt2).f45518a.f44292j1;
                                        ih.d.a(mmVar2.f41582v0, canvas, rectF, mmVar2, mmVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f41583w0 = new RectF();
        this.H = new lm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        un unVar = this.B0;
        unVar.f44292j1.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        kVar.setTranslationY(0.0f);
        xk xkVar = unVar.f44465wb;
        if (xkVar != null) {
            sk skVar = unVar.A1;
            if (skVar != null) {
                i10 = skVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            xkVar.setTranslationY(i10);
        }
        fi.v3 v3Var = unVar.I1;
        if (v3Var != null) {
            v3Var.setTranslationY(0.0f);
        }
        fi.v3 v3Var2 = unVar.H1;
        if (v3Var2 != null) {
            v3Var2.setTranslationY(0.0f);
        }
        unVar.f44205c1.setTranslationY(0.0f);
        unVar.P.setTranslationY(0.0f);
        unVar.I9 = 0.0f;
        unVar.J9 = 0.0f;
        unVar.f44292j1.setBackgroundTranslation(0);
        org.telegram.ui.Components.t60 t60Var = unVar.f44343n3;
        if (t60Var != null) {
            t60Var.e(0.0f);
        }
        fi.f6 f6Var = unVar.K2;
        if (f6Var != null) {
            org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f6Var.f10864b;
            jaVar.f29571u = 0.0f;
            jaVar.d.invalidate();
        }
        unVar.setFragmentPanTranslationOffset(0);
        unVar.x9();
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final int Q() {
        di.a3 a3Var = this.B0.V1;
        if (a3Var != null && a3Var.isShowing()) {
            this.f34280f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z10;
        un unVar = this.B0;
        jh.m mVar = unVar.W;
        if (drawable instanceof org.telegram.ui.Components.uc0) {
            ((org.telegram.ui.Components.uc0) drawable).p();
        }
        hh.a c10 = mVar.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(mVar.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(mVar.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.Zb = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        unVar.f44188ac = z11;
        unVar.L.f12845a = c10;
        hh.d dVar = unVar.H;
        if (dVar != null) {
            Iterator it = dVar.v.iterator();
            while (it.hasNext()) {
                ((eh.e) it.next()).f9974g0 = true;
            }
        }
        hh.d dVar2 = unVar.I;
        if (dVar2 != null) {
            Iterator it2 = dVar2.v.iterator();
            while (it2.hasNext()) {
                ((eh.e) it2.next()).f9974g0 = true;
            }
        }
        lh.f fVar = unVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        jh.f fVar2 = unVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        unVar.f44292j1.invalidate();
        Iterator it3 = unVar.f44480y.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        unVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f7, org.telegram.ui.Cells.s1 s1Var, int i10) {
        float f10;
        int save = canvas.save();
        un unVar = this.B0;
        float x9 = s1Var.getX() + unVar.f44468x0.getLeft();
        float y3 = s1Var.getY() + unVar.f44468x0.getY() + s1Var.getPaddingTop();
        if (s1Var.a()) {
            f10 = s1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(unVar.f44468x0.getLeft(), f7, unVar.f44468x0.getRight(), ((((unVar.f44468x0.getY() + unVar.f44468x0.getMeasuredHeight()) - unVar.Na) - unVar.v.e()) - unVar.Pc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x9, y3);
        boolean z10 = true;
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(f10, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, f10);
        } else if (i10 == 2) {
            if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            s1Var.I1(f10, canvas, z10);
        } else if (i10 == 3) {
            if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            s1Var.N1(canvas, f10);
            if (!z10) {
                s1Var.d2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && unVar.Y8 != null)) {
            float f11 = (unVar.T8 * unVar.W8) / 0.2f;
            canvas.save();
            s1Var.h2(canvas, unVar.Y8, f11, unVar.U8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x9, y3);
            s1Var.i2(this, canvas, unVar.Z8, unVar.Y8, f11);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(View view) {
        if (view != this.L) {
            un unVar = this.B0;
            if (view != unVar.K2 && view != unVar.C1 && view != unVar.f44489y9 && view != unVar.X && view != unVar.W3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        int i11;
        un unVar = this.B0;
        hk hkVar = unVar.Y;
        if (hkVar != null && view == hkVar.m0) {
            lh.f fVar = unVar.X;
            if (fVar != null) {
                i11 = indexOfChild(fVar);
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                i10 = i11;
            }
            super.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
        hk hkVar2 = unVar.Y;
        if (hkVar2 != null && view == hkVar2.m0) {
            hi.e0 e0Var = (hi.e0) view;
            e0Var.setBackgroundDrawable(unVar.J.c(e0Var.f12949c, unVar.f44467x, false));
        }
        hk hkVar3 = unVar.Y;
        if (hkVar3 != null && view == (sgVar = hkVar3.O1)) {
            sgVar.setBlurredBackgroundFactory(unVar.J);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        cl clVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (clVar = this.B0.Ra) != null && clVar.f30960s) {
            clVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.B0.f44468x0.getBottom();
    }

    public un getChatActivity() {
        return this.B0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.B0.f44201bb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.B0.f44468x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable l4 = this.B0.f44385qa.l();
        if (l4 != null) {
            return l4;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.B0.f44385qa.f43543g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        if (wallPaperSettings != null && wallPaperSettings.motion) {
            return true;
        }
        return false;
    }

    @Override
    public int getScrollOffset() {
        return this.B0.f44468x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        super.onAttachedToWindow();
        un unVar = this.B0;
        if (!unVar.f44201bb) {
            j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
                if (((ActionBarLayout) j5Var2).f22304b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.H;
                    j5Var3 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
                    q1Var.f22963b = (FrameLayout) j5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f22963b = unVar.f44292j1;
        }
        this.H.c();
        unVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == unVar.f44249f6)) {
            MediaController.getInstance().setTextureView(unVar.U7(false), unVar.H8, unVar.F8, true);
        }
        rp rpVar = unVar.f44200ba;
        if (rpVar != null) {
            rpVar.f();
        }
        unVar.Ja.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        un unVar = this.B0;
        rp rpVar = unVar.f44200ba;
        if (rpVar != null) {
            NotificationCenter.getInstance(rpVar.f43206e0).removeObserver(rpVar, NotificationCenter.updateInterfaces);
            rpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.t5 t5Var = rpVar.f43213k0;
            if (t5Var != null && (view = rpVar.f43200a0) != null) {
                t5Var.o(view);
            }
            rpVar.Q = 0.0f;
            rpVar.P = 0L;
            unVar.f44200ba = null;
        }
        unVar.Ja.j();
        AndroidUtilities.runOnUIThread(new ag.c(26));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        un unVar;
        fi.f6 f6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (f6Var = (unVar = this.B0).K2) != null && f6Var.a() && unVar.K2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        un unVar = this.B0;
        ih.d.c(unVar.L8, unVar.fragmentView);
        unVar.M8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.B0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        un unVar = this.B0;
        unVar.H9 = i11;
        unVar.x9();
        unVar.z9();
    }

    @Override
    public final void L() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
