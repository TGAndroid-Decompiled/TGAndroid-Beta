package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class gx0 extends org.telegram.ui.Components.uu0 implements r0.l {
    public final ac.g f37662f0;
    public final ProfileActivity f37663g0;
    public boolean f37664h0;
    public final Paint f37665i0;
    public boolean f37666j0;
    public final ArrayList f37667k0;
    public final ex0 f37668l0;
    public final ProfileActivity m0;

    public gx0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.m0 = profileActivity;
        this.f37663g0 = profileActivity;
        this.f37662f0 = new Object();
        this.f37665i0 = new Paint();
        this.f37667k0 = new ArrayList();
        this.f37668l0 = new ex0(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        ProfileActivity profileActivity = this.m0;
        org.telegram.ui.Components.l40 l40Var = profileActivity.f33936x0;
        Paint paint = profileActivity.f33880p2;
        Paint paint2 = profileActivity.f33944y0;
        float f10 = 0.0f;
        int i10 = (profileActivity.A5 > 0.0f ? 1 : (profileActivity.A5 == 0.0f ? 0 : -1));
        Paint paint3 = this.f37665i0;
        if (i10 > 0) {
            paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, profileActivity.f33950z0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.I0(profileActivity), paint3);
        }
        int i11 = org.telegram.ui.ActionBar.t6.f20872a7;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33950z0));
        if (profileActivity.f33772a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33950z0));
            if (profileActivity.G1) {
                paint.setAlpha((int) (profileActivity.f33772a.getAlpha() * 255.0f));
            }
            if (profileActivity.G1) {
                paint3.setAlpha((int) (profileActivity.f33772a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f33772a.getChildCount();
            ArrayList arrayList = this.f37667k0;
            arrayList.clear();
            boolean z11 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = profileActivity.f33772a.getChildAt(i12);
                profileActivity.f33772a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f33772a.getChildAt(i12));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.f37668l0);
            profileActivity.f33772a.getY();
            int size = arrayList.size();
            if (!profileActivity.F1 && size > 0 && !z11) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z12 = false;
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) arrayList.get(i13);
                if (view.getBackground() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                profileActivity.f33772a.getY();
                view.getY();
                if (z12 == z10) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z12 = z10;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (l40Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f33936x0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.f33928w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f33928w0.getLeft(), profileActivity.f33928w0.getTop());
            View view2 = profileActivity.f33928w0;
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            if (view2 == lVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((l40Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f33928w0.getMeasuredWidth(), profileActivity.f33928w0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f33928w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        do0 do0Var = profileActivity.T;
        if (do0Var != null && do0Var.getVisibility() == 0) {
            if (profileActivity.T.getAlpha() != 1.0f) {
                if (profileActivity.T.getAlpha() != 0.0f) {
                    canvas2.saveLayerAlpha(profileActivity.T.getLeft(), profileActivity.T.getTop(), profileActivity.T.getRight(), profileActivity.T.getBottom(), (int) (profileActivity.T.getAlpha() * 255.0f), 31);
                    canvas.translate(profileActivity.T.getLeft(), profileActivity.T.getTop());
                    profileActivity.T.draw(canvas);
                    canvas.restore();
                }
            } else {
                profileActivity.T.draw(canvas);
            }
        }
        if (!profileActivity.I0) {
            canvas.save();
            bw0 bw0Var = profileActivity.f33772a;
            if (bw0Var != null) {
                f7 = bw0Var.getTranslationX();
            } else {
                f7 = 0.0f;
            }
            canvas.translate(f7, 0.0f);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, profileActivity.f33950z0);
            int i14 = profileActivity.H6;
            bw0 bw0Var2 = profileActivity.f33772a;
            if (bw0Var2 != null) {
                f10 = bw0Var2.getAlpha();
            }
            org.telegram.messenger.i0.O(canvas, this, w02, i14, f10);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.ss0[] ss0VarArr;
        org.telegram.ui.Components.ss0 ss0Var;
        ProfileActivity profileActivity = this.m0;
        ow0 ow0Var = profileActivity.V4;
        if (ow0Var.f41053n) {
            return ow0Var.g(motionEvent);
        }
        ix0 ix0Var = profileActivity.N;
        if (ix0Var != null && (ss0Var = (ss0VarArr = ix0Var.m0)[0]) != null && ss0Var.h.getFastScroll() != null && ss0VarArr[0].h.getFastScroll().f33092n) {
            ix0 ix0Var2 = profileActivity.N;
            if (ix0Var2.d) {
                return ix0Var2.X(motionEvent);
            }
        }
        ix0 ix0Var3 = profileActivity.N;
        if (ix0Var3 != null && ix0Var3.O(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.m0;
        if (profileActivity.V4.f41053n) {
            if (view != profileActivity.Y) {
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                if (view == lVar || view == profileActivity.f33898s) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.T) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void k(int i10, View view) {
        this.f37662f0.f385a = 0;
    }

    @Override
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.f37663g0;
        try {
            if (view == profileActivity.f33772a && profileActivity.P) {
                org.telegram.ui.Components.tk0 currentListView = profileActivity.N.getCurrentListView();
                if (profileActivity.N.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            org.telegram.messenger.i0.g3(new fx0(this, 1));
        }
    }

    @Override
    public final boolean n(View view, View view2, int i10, int i11) {
        if (this.f37663g0.J4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = true;
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = profileActivity.G;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = false;
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = profileActivity.G;
        if (d5Var2 != null) {
            d5Var2.b();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.m0;
        profileActivity.f33844j6 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
        profileActivity.N3();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gx0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.m0;
        yg.d.c(profileActivity.I6, profileActivity.fragmentView);
        profileActivity.J6.d();
    }

    @Override
    public final void q(View view, View view2, int i10, int i11) {
        this.f37662f0.f385a = i10;
    }

    @Override
    public final void requestLayout() {
        if (this.f37664h0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.tk0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f37663g0;
        if (view == profileActivity.f33772a) {
            int i14 = -1;
            if (profileActivity.J4 != -1 && profileActivity.P) {
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                boolean z10 = lVar.f20497n0;
                int top = profileActivity.N.getTop();
                boolean z11 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.N.getCurrentListView()) != null && (L0 = ((s4.a0) currentListView.getLayoutManager()).L0()) != -1) {
                        s4.c1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f47898a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i14 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i11;
                            } else {
                                max = Math.max(i11, i14 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i11);
                            z11 = true;
                        }
                    }
                    if (z10) {
                        if (!z11 && top < 0) {
                            iArr[1] = i11 - Math.max(top, i11);
                        } else {
                            iArr[1] = i11;
                        }
                    }
                } else if (z10) {
                    org.telegram.ui.Components.tk0 currentListView2 = profileActivity.N.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                        currentListView2.scrollBy(0, i13);
                    }
                }
            }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
