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
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.p91;
public abstract class ga extends tk0 implements us {
    public static final byte[] f21935p3 = new byte[1024];
    public boolean f21936e3;
    public final dh.f f21937f3;
    public final HashMap f21938g3;
    public final HashMap f21939h3;
    public org.telegram.ui.ActionBar.s6 f21940i3;
    public final fa f21941j3;
    public final ArrayList f21942k3;
    public final ArrayList f21943l3;
    public final int f21944m3;
    public int f21945n3;
    public final org.telegram.ui.ActionBar.k2 f21946o3;

    public ga(Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f21938g3 = new HashMap();
        this.f21939h3 = new HashMap();
        this.f21942k3 = arrayList2;
        this.f21943l3 = arrayList;
        this.f21944m3 = i10;
        this.f21946o3 = k2Var;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, this, null);
        } else {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        dh.f fVar = new dh.f(2);
        this.f21937f3 = fVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        fVar.j1(0);
        setLayoutManager(fVar);
        fa faVar = new fa(this, context);
        this.f21941j3 = faVar;
        setAdapter(faVar);
        setOnItemClickListener(new gk0() {
            @Override
            public final void f(int i11, View view) {
                ga gaVar = ga.this;
                gaVar.getClass();
                gaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).f21644b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    gaVar.w0(left - org.telegram.messenger.i0.L(8.0f), 0, null);
                } else if (right > gaVar.getMeasuredWidth()) {
                    gaVar.w0(right - gaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ca(this, 0));
    }

    public final void A1(int i10) {
        org.telegram.ui.ActionBar.s6 D0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f21944m3 == 1) {
                D0 = org.telegram.ui.ActionBar.t6.J;
            } else {
                D0 = org.telegram.ui.ActionBar.t6.D0();
            }
            this.f21940i3 = D0;
            ArrayList arrayList = this.f21943l3;
            int indexOf = arrayList.indexOf(D0);
            if (indexOf < 0 && (indexOf = this.f21942k3.indexOf(this.f21940i3) + arrayList.size()) < 0) {
                return;
            }
            this.f21937f3.h1(indexOf, (i10 - org.telegram.messenger.i0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.s6 s6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.s6 D0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = s6Var.F;
        if (tL_theme != null) {
            if (s6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.k2 k2Var = this.f21946o3;
                    if (k2Var != null) {
                        k2Var.presentFragment(new p91(s6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(s6Var.d)) {
            org.telegram.ui.ActionBar.o6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0).edit();
        if (this.f21944m3 != 1 && !s6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, s6Var.m());
        edit.commit();
        if (this.f21944m3 == 1) {
            if (s6Var != org.telegram.ui.ActionBar.t6.J) {
                if (org.telegram.ui.ActionBar.t6.I == org.telegram.ui.ActionBar.t6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.t6.J = s6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.t6.m(true);
                }
            } else {
                return;
            }
        } else if (s6Var != org.telegram.ui.ActionBar.t6.D0()) {
            org.telegram.ui.ActionBar.t6.K1(s6Var, false, -1, view);
        } else {
            return;
        }
        D1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f21643a0.f21944m3 == 1) {
                    D0 = org.telegram.ui.ActionBar.t6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.t6.D0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f21642a;
                if (themesHorizontalListCell$InnerThemeView.f21644b == D0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.y3.q(s6Var, s6Var.Y);
        if (this.f21944m3 != 1) {
            org.telegram.ui.ActionBar.t6.M1(this.f21946o3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.Y1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.f21938g3.get(str);
            if (s6Var != null) {
                this.f21938g3.remove(str);
                if (this.f21939h3.remove(s6Var) != null) {
                    Utilities.e.c(new li.s(this, s6Var, file, 24));
                } else {
                    z1(s6Var);
                }
            }
        } else if (i10 == zs.Z1) {
            this.f21938g3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).c(this, zs.Y1);
            zs.f(i10).c(this, zs.Z1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).n(this, zs.Y1);
            zs.f(i10).n(this, zs.Z1);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.f21936e3) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
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
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        g1();
    }

    public void setDrawDivider(boolean z10) {
        this.f21936e3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.s6 s6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f21644b == s6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f21644b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.s6 s6Var) {
    }
}
