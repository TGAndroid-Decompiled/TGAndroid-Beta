package org.telegram.ui.Cells;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.z71;
public abstract class ga extends qj0 implements ls {
    public static final byte[] f29219p3 = new byte[1024];
    public boolean f29220e3;
    public final jg.b0 f29221f3;
    public final HashMap f29222g3;
    public final HashMap f29223h3;
    public org.telegram.ui.ActionBar.k6 f29224i3;
    public final fa j3;
    public final ArrayList f29225k3;
    public final ArrayList f29226l3;
    public final int f29227m3;
    public int f29228n3;
    public final org.telegram.ui.ActionBar.f2 f29229o3;

    public ga(Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f29222g3 = new HashMap();
        this.f29223h3 = new HashMap();
        this.f29225k3 = arrayList2;
        this.f29226l3 = arrayList;
        this.f29227m3 = i7;
        this.f29229o3 = f2Var;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, this, null);
        } else {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(3);
        this.f29221f3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        fa faVar = new fa(this, context);
        this.j3 = faVar;
        setAdapter(faVar);
        setOnItemClickListener(new cj0() {
            @Override
            public final void c(int i10, View view) {
                ga gaVar = ga.this;
                gaVar.getClass();
                gaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).f28858b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    gaVar.w0(left - org.telegram.messenger.g0.L(8.0f), 0, null);
                } else if (right > gaVar.getMeasuredWidth()) {
                    gaVar.w0(right - gaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ca(this, 0));
    }

    public final void A1(int i7) {
        org.telegram.ui.ActionBar.k6 D0;
        View view;
        if (i7 == 0 && (view = (View) getParent()) != null) {
            i7 = view.getMeasuredWidth();
        }
        if (i7 != 0) {
            if (this.f29227m3 == 1) {
                D0 = org.telegram.ui.ActionBar.l6.J;
            } else {
                D0 = org.telegram.ui.ActionBar.l6.D0();
            }
            this.f29224i3 = D0;
            ArrayList arrayList = this.f29226l3;
            int indexOf = arrayList.indexOf(D0);
            if (indexOf < 0 && (indexOf = this.f29225k3.indexOf(this.f29224i3) + arrayList.size()) < 0) {
                return;
            }
            this.f29221f3.h1(indexOf, (i7 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.k6 k6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.k6 D0;
        boolean z9;
        boolean z10;
        TLRPC.TL_theme tL_theme = k6Var.F;
        if (tL_theme != null) {
            if (k6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.f2 f2Var = this.f29229o3;
                    if (f2Var != null) {
                        f2Var.presentFragment(new z71(k6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(k6Var.d)) {
            org.telegram.ui.ActionBar.f6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0).edit();
        if (this.f29227m3 != 1 && !k6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, k6Var.m());
        edit.commit();
        if (this.f29227m3 == 1) {
            if (k6Var != org.telegram.ui.ActionBar.l6.J) {
                if (org.telegram.ui.ActionBar.l6.I == org.telegram.ui.ActionBar.l6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.ActionBar.l6.J = k6Var;
                if (z10) {
                    org.telegram.ui.ActionBar.l6.m(true);
                }
            } else {
                return;
            }
        } else if (k6Var != org.telegram.ui.ActionBar.l6.D0()) {
            org.telegram.ui.ActionBar.l6.K1(k6Var, false, -1, view);
        } else {
            return;
        }
        D1();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f28857a0.f29227m3 == 1) {
                    D0 = org.telegram.ui.ActionBar.l6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.l6.D0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f28856a;
                if (themesHorizontalListCell$InnerThemeView.f28858b == D0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                radioButton.a(z9, true);
            }
        }
        org.telegram.ui.ActionBar.r3.q(k6Var, k6Var.Y);
        if (this.f29227m3 != 1) {
            org.telegram.ui.ActionBar.l6.M1(this.f29229o3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.Y1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.f29222g3.get(str);
            if (k6Var != null) {
                this.f29222g3.remove(str);
                if (this.f29223h3.remove(k6Var) != null) {
                    Utilities.f21336e.c(new l2.z0(this, k6Var, file, 24));
                } else {
                    z1(k6Var);
                }
            }
        } else if (i7 == qs.Z1) {
            this.f29222g3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).c(this, qs.Y1);
            qs.f(i7).c(this, qs.Z1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).n(this, qs.Y1);
            qs.f(i7).n(this, qs.Z1);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f29220e3) {
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        g1();
    }

    public void setDrawDivider(boolean z9) {
        this.f29220e3 = z9;
    }

    public final void z1(org.telegram.ui.ActionBar.k6 k6Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f28858b == k6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f28858b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.k6 k6Var) {
    }
}
