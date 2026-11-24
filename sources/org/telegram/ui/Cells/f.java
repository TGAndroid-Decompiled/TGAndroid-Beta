package org.telegram.ui.Cells;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
public abstract class f extends o39 implements gk7 {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final zr g3;
    public final HashMap h3;
    public final HashMap i3;
    public akb j3;
    public final e k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final byte n3;
    public int o3;
    public final org.telegram.ui.ActionBar.d p3;

    public f(Context context, org.telegram.ui.ActionBar.d dVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.h3 = new HashMap();
        this.i3 = new HashMap();
        this.l3 = arrayList2;
        this.m3 = arrayList;
        this.n3 = i;
        this.p3 = dVar;
        if (i == 2) {
            zkb.h(bkb.g5, null, this);
        } else {
            zkb.h(bkb.c6, null, this);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        zr zrVar = new zr((byte) 18);
        this.g3 = zrVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        zrVar.i1(0);
        setLayoutManager(zrVar);
        e eVar = new e(this, context);
        this.k3 = eVar;
        setAdapter(eVar);
        setOnItemClickListener(new c39() {
            @Override
            public final void d(int i2, View view) {
                akb akbVar = ((ThemesHorizontalListCell$InnerThemeView) view).b;
                f fVar = f.this;
                fVar.B1(akbVar, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    fVar.x0(left - gl.L(8.0f), 0, null);
                } else if (right > fVar.getMeasuredWidth()) {
                    fVar.x0(right - fVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new e39() {
            @Override
            public final boolean d(int i2, View view) {
                f.this.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                return true;
            }
        });
    }

    public final void A1(int i) {
        akb B0;
        View view;
        if (i == 0 && (view = (View) getParent()) != null) {
            i = view.getMeasuredWidth();
        }
        if (i != 0) {
            if (this.n3 == 1) {
                B0 = bkb.J;
            } else {
                B0 = bkb.B0();
            }
            this.j3 = B0;
            ArrayList arrayList = this.m3;
            int indexOf = arrayList.indexOf(B0);
            if (indexOf < 0 && (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) < 0) {
                return;
            }
            this.g3.g1(indexOf, (i - gl.L(76.0f)) / 2);
        }
    }

    public final void B1(akb akbVar, View view) {
        String str;
        akb B0;
        boolean z;
        boolean z2;
        TLRPC.TL_theme tL_theme = akbVar.G;
        if (tL_theme != null) {
            if (akbVar.V) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.d dVar = this.p3;
                    if (dVar != null) {
                        dVar.presentFragment(new ymb(akbVar, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
        if (this.n3 != 1 && !akbVar.o()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, akbVar.k());
        edit.commit();
        if (this.n3 == 1) {
            if (akbVar != bkb.J) {
                if (bkb.I == bkb.J) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bkb.J = akbVar;
                if (z2) {
                    bkb.l(true);
                }
            } else {
                return;
            }
        } else if (akbVar != bkb.B0()) {
            bkb.I1(akbVar, false, -1, view);
        } else {
            return;
        }
        D1();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b0.n3 == 1) {
                    B0 = bkb.J;
                } else {
                    B0 = bkb.B0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
                if (themesHorizontalListCell$InnerThemeView.b == B0) {
                    z = true;
                } else {
                    z = false;
                }
                radioButton.a(z, true);
            }
        }
        jy3.q(akbVar, akbVar.Z);
        if (this.n3 != 1) {
            bkb.K1(this.p3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            akb akbVar = (akb) this.h3.get(str);
            if (akbVar != null) {
                this.h3.remove(str);
                if (this.i3.remove(akbVar) != null) {
                    Utilities.e.c(new r1b(this, akbVar, file, (byte) 14));
                } else {
                    z1(akbVar);
                }
            }
        } else if (i == kk7.Y1) {
            this.h3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < 4; i++) {
            kk7.f(i).b(this, kk7.X1);
            kk7.f(i).b(this, kk7.Y1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            kk7.f(i).n(this, kk7.X1);
            kk7.f(i).n(this, kk7.Y1);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.f3) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
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
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        h1();
    }

    public void setDrawDivider(boolean z) {
        this.f3 = z;
    }

    public final void z1(akb akbVar) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == akbVar && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(akb akbVar) {
    }
}
