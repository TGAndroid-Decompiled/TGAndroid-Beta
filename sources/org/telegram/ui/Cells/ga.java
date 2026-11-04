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
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.o71;
public abstract class ga extends tj0 implements cs {
    public static final byte[] f29277q3 = new byte[1024];
    public boolean f29278f3;
    public final kg.y f29279g3;
    public final HashMap f29280h3;
    public final HashMap i3;
    public org.telegram.ui.ActionBar.j6 f29281j3;
    public final fa f29282k3;
    public final ArrayList f29283l3;
    public final ArrayList f29284m3;
    public final int f29285n3;
    public int f29286o3;
    public final org.telegram.ui.ActionBar.d2 f29287p3;

    public ga(Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f29280h3 = new HashMap();
        this.i3 = new HashMap();
        this.f29283l3 = arrayList2;
        this.f29284m3 = arrayList;
        this.f29285n3 = i3;
        this.f29287p3 = d2Var;
        if (i3 == 2) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, this, null);
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        kg.y yVar = new kg.y(3);
        this.f29279g3 = yVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        yVar.j1(0);
        setLayoutManager(yVar);
        fa faVar = new fa(this, context);
        this.f29282k3 = faVar;
        setAdapter(faVar);
        setOnItemClickListener(new fj0() {
            @Override
            public final void f(int i10, View view) {
                ga gaVar = ga.this;
                gaVar.getClass();
                gaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).f28912b, view);
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

    public final void A1(int i3) {
        org.telegram.ui.ActionBar.j6 D0;
        View view;
        if (i3 == 0 && (view = (View) getParent()) != null) {
            i3 = view.getMeasuredWidth();
        }
        if (i3 != 0) {
            if (this.f29285n3 == 1) {
                D0 = org.telegram.ui.ActionBar.k6.J;
            } else {
                D0 = org.telegram.ui.ActionBar.k6.D0();
            }
            this.f29281j3 = D0;
            ArrayList arrayList = this.f29284m3;
            int indexOf = arrayList.indexOf(D0);
            if (indexOf < 0 && (indexOf = this.f29283l3.indexOf(this.f29281j3) + arrayList.size()) < 0) {
                return;
            }
            this.f29279g3.h1(indexOf, (i3 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.j6 j6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.j6 D0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = j6Var.G;
        if (tL_theme != null) {
            if (j6Var.V) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.d2 d2Var = this.f29287p3;
                    if (d2Var != null) {
                        d2Var.presentFragment(new o71(j6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(j6Var.d)) {
            org.telegram.ui.ActionBar.d6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0).edit();
        if (this.f29285n3 != 1 && !j6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, j6Var.m());
        edit.commit();
        if (this.f29285n3 == 1) {
            if (j6Var != org.telegram.ui.ActionBar.k6.J) {
                if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.k6.J = j6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.k6.m(true);
                }
            } else {
                return;
            }
        } else if (j6Var != org.telegram.ui.ActionBar.k6.D0()) {
            org.telegram.ui.ActionBar.k6.K1(j6Var, false, -1, view);
        } else {
            return;
        }
        D1();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f28913b0.f29285n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.k6.D0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f28910a;
                if (themesHorizontalListCell$InnerThemeView.f28912b == D0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.p3.q(j6Var, j6Var.Z);
        if (this.f29285n3 != 1) {
            org.telegram.ui.ActionBar.k6.M1(this.f29287p3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.Y1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f29280h3.get(str);
            if (j6Var != null) {
                this.f29280h3.remove(str);
                if (this.i3.remove(j6Var) != null) {
                    Utilities.f21387e.c(new lg.y(this, j6Var, file, 28));
                } else {
                    z1(j6Var);
                }
            }
        } else if (i3 == hs.Z1) {
            this.f29280h3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).c(this, hs.Y1);
            hs.f(i3).c(this, hs.Z1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).n(this, hs.Y1);
            hs.f(i3).n(this, hs.Z1);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        super.onDraw(canvas);
        if (this.f29278f3) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
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
    public void setBackgroundColor(int i3) {
        super.setBackgroundColor(i3);
        g1();
    }

    public void setDrawDivider(boolean z10) {
        this.f29278f3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.j6 j6Var) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f28912b == j6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f28912b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.j6 j6Var) {
    }
}
