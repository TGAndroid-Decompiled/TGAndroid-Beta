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
public abstract class f extends r59 implements jm7 {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final zs g3;
    public final HashMap h3;
    public final HashMap i3;
    public bmb j3;
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
            anb.h(cmb.g5, null, this);
        } else {
            anb.h(cmb.c6, null, this);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        zs zsVar = new zs((byte) 18);
        this.g3 = zsVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        zsVar.i1(0);
        setLayoutManager(zsVar);
        e eVar = new e(this, context);
        this.k3 = eVar;
        setAdapter(eVar);
        setOnItemClickListener(new f59() {
            @Override
            public final void g(int i2, View view) {
                bmb bmbVar = ((ThemesHorizontalListCell$InnerThemeView) view).b;
                f fVar = f.this;
                fVar.B1(bmbVar, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    fVar.x0(left - gm.L(8.0f), 0, null);
                } else if (right > fVar.getMeasuredWidth()) {
                    fVar.x0(right - fVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new h59() {
            @Override
            public final boolean g(int i2, View view) {
                f.this.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                return true;
            }
        });
    }

    public final void A1(int i) {
        bmb B0;
        View view;
        if (i == 0 && (view = (View) getParent()) != null) {
            i = view.getMeasuredWidth();
        }
        if (i != 0) {
            if (this.n3 == 1) {
                B0 = cmb.J;
            } else {
                B0 = cmb.B0();
            }
            this.j3 = B0;
            ArrayList arrayList = this.m3;
            int indexOf = arrayList.indexOf(B0);
            if (indexOf < 0 && (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) < 0) {
                return;
            }
            this.g3.g1(indexOf, (i - gm.L(76.0f)) / 2);
        }
    }

    public final void B1(bmb bmbVar, View view) {
        String str;
        bmb B0;
        boolean z;
        boolean z2;
        TLRPC.TL_theme tL_theme = bmbVar.G;
        if (tL_theme != null) {
            if (bmbVar.V) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.d dVar = this.p3;
                    if (dVar != null) {
                        dVar.presentFragment(new zob(bmbVar, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
        if (this.n3 != 1 && !bmbVar.o()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, bmbVar.k());
        edit.commit();
        if (this.n3 == 1) {
            if (bmbVar != cmb.J) {
                if (cmb.I == cmb.J) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cmb.J = bmbVar;
                if (z2) {
                    cmb.l(true);
                }
            } else {
                return;
            }
        } else if (bmbVar != cmb.B0()) {
            cmb.I1(bmbVar, false, -1, view);
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
                    B0 = cmb.J;
                } else {
                    B0 = cmb.B0();
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
        tz3.q(bmbVar, bmbVar.Z);
        if (this.n3 != 1) {
            cmb.K1(this.p3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.Y1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            bmb bmbVar = (bmb) this.h3.get(str);
            if (bmbVar != null) {
                this.h3.remove(str);
                if (this.i3.remove(bmbVar) != null) {
                    Utilities.e.c(new j2b(this, bmbVar, file, (byte) 17));
                } else {
                    z1(bmbVar);
                }
            }
        } else if (i == nm7.Z1) {
            this.h3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < 4; i++) {
            nm7.f(i).b(this, nm7.Y1);
            nm7.f(i).b(this, nm7.Z1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            nm7.f(i).n(this, nm7.Y1);
            nm7.f(i).n(this, nm7.Z1);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.f3) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
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

    public final void z1(bmb bmbVar) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == bmbVar && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(bmb bmbVar) {
    }
}
