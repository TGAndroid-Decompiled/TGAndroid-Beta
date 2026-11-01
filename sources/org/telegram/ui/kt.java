package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kt {
    public static TextPaint f38971f0;
    public static volatile kt f38972g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.lc0 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public sc1 O;
    public org.telegram.ui.Components.fb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final ft U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.kz X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f38973a;
    public TLRPC.InputStickerSet f38974a0;
    public int f38975b;
    public Object f38976b0;
    public float f38977c;
    public org.telegram.ui.ActionBar.p6 f38978c0;
    public float d;
    public VibrationEffect f38979d0;
    public boolean f38980e0;
    public float f38981f;
    public float f38982g;
    public View h;
    public boolean f38983i;
    public org.telegram.ui.Components.d11 f38984j;
    public org.telegram.ui.ActionBar.k1 f38985k;
    public ht f38986l;
    public boolean f38987m;
    public boolean f38988n;
    public ArrayList f38989o;
    public boolean f38990p;
    public int f38992r;
    public final hi.b f38993s;
    public final tg.b f38994t;
    public final ColorDrawable f38995u;
    public Bitmap v;
    public Activity f38996w;
    public WindowManager.LayoutParams f38997x;
    public l0 f38998y;
    public fg.i f38999z;
    public float e = 0.0f;
    public i0.c f38991q = i0.c.e;

    public kt() {
        hi.b bVar = new hi.b();
        this.f38993s = bVar;
        this.f38994t = new tg.b(bVar, bVar, bVar);
        this.f38995u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.i0.L(200.0f);
        this.N = new Paint(1);
        this.U = new ft(this);
    }

    public static void a(kt ktVar, Bitmap bitmap, Bitmap bitmap2) {
        hi.b bVar = ktVar.f38993s;
        Paint paint = ktVar.N;
        ktVar.A.O0(true, false);
        ktVar.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        bVar.a(bitmap2);
        yg.d.c(bVar, ktVar.f38998y);
        ktVar.f38994t.d();
        ktVar.f38980e0 = false;
        fg.i iVar = ktVar.f38999z;
        if (iVar != null) {
            iVar.invalidate();
        }
    }

    public static boolean g(kt ktVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        float f10;
        int i11;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ih.r rVar;
        String str2;
        ih.r rVar2;
        org.telegram.ui.ActionBar.k2 k2Var;
        ht htVar = ktVar.f38986l;
        if (htVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = htVar.d();
        TLRPC.PollAnswer g10 = ktVar.f38986l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters F1 = org.telegram.messenger.kj.F1(d, g10.option);
        if (F1 != null && F1.voters > 0 && org.telegram.messenger.kj.A(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.kj.W4(d) && !d.poll.closed && !ktVar.f38986l.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && org.telegram.messenger.kj.D(d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            ih.r rVar3 = new ih.r(ktVar.f38992r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.f38978c0);
            org.telegram.ui.Components.z60 z60Var = new org.telegram.ui.Components.z60(actionBarPopupWindow$ActionBarPopupWindowLayout, ktVar.f38978c0);
            View view = z60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i12 = org.telegram.ui.ActionBar.t6.E8;
            z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i12, ktVar.f38978c0)));
            tg.b bVar = ktVar.f38994t;
            wg.d k10 = w7.b9.k(ktVar.f38978c0);
            if (view != null) {
                rVar = rVar3;
                str2 = null;
                vg.f c10 = bVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            } else {
                rVar = rVar3;
                str2 = null;
            }
            z60Var.c(2131231241, org.telegram.messenger.dd.L0(2131753756, str2), new rh(actionBarPopupWindow$ActionBarPopupWindowLayout, 16), false);
            z60Var.k();
            org.telegram.messenger.kj y3 = ktVar.f38986l.y();
            Activity activity = ktVar.f38996w;
            if ((activity instanceof LaunchActivity) && y3 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    k2Var = launchActivity.M().getLastFragment();
                } else {
                    k2Var = null;
                }
                if (k2Var != null) {
                    org.telegram.ui.Components.v51 a2 = rVar.a(k2Var, org.telegram.messenger.kj.B0(y3.f16690k), y3.f1(), g10.option, F1.voters, new org.telegram.ui.Components.vg(15, ktVar, k2Var));
                    rVar2 = rVar;
                    z60Var.q(a2);
                    rVar2.setText(org.telegram.messenger.dd.G(F1.voters, "PollVotesCount", new Object[0]));
                    rVar2.f8575a.d(F1.recent_voters, false);
                    rVar2.setLayoutParams(w7.b6.o(-1, 48));
                    int i13 = org.telegram.ui.ActionBar.t6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i13, ktVar.f38978c0), 12, 0);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                    org.telegram.ui.ActionBar.p6 p6Var = ktVar.f38978c0;
                    rVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.a7.k(rVar2, a02, null, N, p6Var);
                    rVar2.setOnClickListener(new bh.f(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar2);
                    View h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.f38978c0);
                    h1Var.setTag(2131296437, 1);
                    f7 = 0.06f;
                    org.telegram.ui.ActionBar.a7.j(h1Var, org.telegram.ui.ActionBar.a7.L(0.06f, i12), ktVar.f38978c0);
                    i10 = -1;
                    h1Var.setLayoutParams(w7.b6.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(h1Var);
                }
            }
            rVar2 = rVar;
            rVar2.setText(org.telegram.messenger.dd.G(F1.voters, "PollVotesCount", new Object[0]));
            rVar2.f8575a.d(F1.recent_voters, false);
            rVar2.setLayoutParams(w7.b6.o(-1, 48));
            int i132 = org.telegram.ui.ActionBar.t6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i132, ktVar.f38978c0), 12, 0);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i132);
            org.telegram.ui.ActionBar.p6 p6Var2 = ktVar.f38978c0;
            rVar2.setBackground(a022);
            org.telegram.ui.ActionBar.a7.k(rVar2, a022, null, N2, p6Var2);
            rVar2.setOnClickListener(new bh.f(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar2);
            View h1Var2 = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.f38978c0);
            h1Var2.setTag(2131296437, 1);
            f7 = 0.06f;
            org.telegram.ui.ActionBar.a7.j(h1Var2, org.telegram.ui.ActionBar.a7.L(0.06f, i12), ktVar.f38978c0);
            i10 = -1;
            h1Var2.setLayoutParams(w7.b6.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(h1Var2);
        } else {
            f7 = 0.06f;
            i10 = -1;
        }
        if (z11) {
            i11 = i10;
            str = null;
            f10 = f7;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232356, org.telegram.messenger.dd.L0(2131747171, null), false, ktVar.f38978c0).setOnClickListener(new ys(ktVar, 2));
        } else {
            f10 = f7;
            i11 = i10;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232413, org.telegram.messenger.dd.L0(2131743850, str), false, ktVar.f38978c0).setOnClickListener(new ys(ktVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View h1Var3 = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ktVar.f38978c0);
            h1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.a7.j(h1Var3, org.telegram.ui.ActionBar.a7.L(f10, org.telegram.ui.ActionBar.t6.E8), ktVar.f38978c0);
            h1Var3.setLayoutParams(w7.b6.o(i11, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(h1Var3);
        }
        if (z10 || z11 || z12) {
            return true;
        }
        return false;
    }

    public static kt p() {
        kt ktVar;
        kt ktVar2 = f38972g0;
        if (ktVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ktVar = f38972g0;
                    if (ktVar == null) {
                        ktVar = new kt();
                        f38972g0 = ktVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ktVar;
        }
        return ktVar2;
    }

    public final void m() {
        if (this.f38996w != null && !this.K) {
            org.telegram.messenger.i0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f38999z.invalidate();
            this.W = null;
            this.f38974a0 = null;
            this.Y = null;
            this.f38986l = null;
            this.E = false;
            org.telegram.messenger.i0.h3(new ws(this, 0), 200L);
            sc1 sc1Var = this.O;
            if (sc1Var != null) {
                sc1Var.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f26523f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.gr.f26523f).start();
            }
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14735k1, 8);
        }
    }

    public final void n() {
        sg.b0 reactionsWindow;
        org.telegram.ui.Components.fb fbVar = this.P;
        if (fbVar != null && (reactionsWindow = fbVar.getReactionsWindow()) != null && !reactionsWindow.f48299q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.k1 k1Var = this.f38985k;
        if (k1Var != null) {
            k1Var.dismiss();
            this.f38985k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.a30.m(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.i0.L(-12.0f)), org.telegram.ui.Components.gr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.uk0 uk0Var, ht htVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        this.f38986l = htVar;
        if (htVar != null) {
            this.f38987m = htVar.j();
            this.f38988n = this.f38986l.o();
        }
        ht htVar2 = this.f38986l;
        if ((htVar2 == null || htVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = uk0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = uk0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.d8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.d8) childAt).f21819a.L()) {
                            imageReceiver.J0(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                        if (((org.telegram.ui.Cells.b8) childAt).f21736a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.f21953a.n() != null) {
                                int i12 = h2Var.P;
                                if (i12 == 6) {
                                    imageReceiver.J0(0);
                                    i10 = 0;
                                } else if (i12 == 2 && h2Var.f21969w) {
                                    imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.vu) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.ey) && ((org.telegram.ui.Components.ey) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.sx0) && (((org.telegram.ui.Components.sx0) childAt).f30463b instanceof org.telegram.ui.Components.f5)) {
                                imageReceiver.J0(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f38973a = x10;
                        this.f38975b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.d11 d11Var = new org.telegram.ui.Components.d11(this, uk0Var, i10, p6Var, 1);
                        this.f38984j = d11Var;
                        org.telegram.messenger.i0.h3(d11Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.uk0 r18, java.lang.Object r19, org.telegram.ui.ht r20, org.telegram.ui.ActionBar.p6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kt.r(android.view.MotionEvent, org.telegram.ui.Components.uk0, java.lang.Object, org.telegram.ui.ht, org.telegram.ui.ActionBar.p6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.kz r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.p6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kt.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.kz, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.p6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.d11 d11Var = this.f38984j;
        if (d11Var != null) {
            org.telegram.messenger.i0.r(d11Var);
            this.f38984j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(ht htVar) {
        this.f38986l = htVar;
        if (htVar != null) {
            this.f38987m = htVar.j();
            this.f38988n = this.f38986l.o();
        }
    }

    public final void v(Activity activity) {
        int i10 = org.telegram.messenger.e20.f15506s0;
        this.f38992r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i10;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i11 = this.f38992r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i11;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f38996w == activity) {
            return;
        }
        this.f38996w = activity;
        this.J = activity.getResources().getDrawable(2131232571);
        this.f38998y = new l0(this, activity, 6);
        zg.h hVar = new zg.h(this.f38998y);
        l0 l0Var = this.f38998y;
        tg.b bVar = this.f38994t;
        bVar.h = hVar;
        bVar.f48713i = l0Var;
        bVar.f48712g = new je.b();
        this.f38998y.setFocusable(true);
        this.f38998y.setFocusableInTouchMode(true);
        this.f38998y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f38998y;
        xs xsVar = new xs(this);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(l0Var2, xsVar);
        fg.i iVar = new fg.i(this, activity);
        this.f38999z = iVar;
        iVar.setFocusable(false);
        this.f38998y.addView(this.f38999z, w7.b6.e(-1, -1, 51));
        this.f38999z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.wp.r1(this.f38992r);
        this.I = org.telegram.messenger.wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f38997x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.i0.m(layoutParams);
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(this.f38999z);
        imageReceiver2.R0 = true;
        imageReceiver2.J0 = true;
        imageReceiver2.H0(this.f38999z);
    }

    public final void w() {
        this.T = null;
    }

    public final boolean x(View view) {
        if (!(view instanceof org.telegram.ui.Cells.d8)) {
            return false;
        }
        Activity W = org.telegram.messenger.i0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.d8) {
            ((org.telegram.ui.Cells.d8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.b8) {
            ((org.telegram.ui.Cells.b8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view2).setScaled(false);
        }
        this.h = d8Var;
        TLRPC.Document sticker = d8Var.getSticker();
        org.telegram.messenger.kz stickerPath = d8Var.getStickerPath();
        String str = null;
        String V = org.telegram.messenger.kj.V(d8Var.getSticker(), null, Integer.valueOf(this.f38992r));
        ht htVar = this.f38986l;
        if (htVar != null) {
            str = htVar.F(false);
        }
        s(sticker, stickerPath, V, str, null, 0, d8Var.D, d8Var.getParentObject(), this.f38978c0, 0);
        ft ftVar = this.U;
        org.telegram.messenger.i0.r(ftVar);
        org.telegram.messenger.i0.h3(ftVar, 16L);
        d8Var.setScaled(true);
        return true;
    }
}
