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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.uc1;
public abstract class na extends mm0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f22818j3 = new byte[1024];
    public boolean Y2;
    public final hg.a0 Z2;
    public final HashMap f22819a3;
    public final HashMap f22820b3;
    public org.telegram.ui.ActionBar.j6 f22821c3;
    public final ma f22822d3;
    public final ArrayList f22823e3;
    public final ArrayList f22824f3;
    public final int f22825g3;
    public int f22826h3;
    public final org.telegram.ui.ActionBar.o2 f22827i3;

    public na(Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f22819a3 = new HashMap();
        this.f22820b3 = new HashMap();
        this.f22823e3 = arrayList2;
        this.f22824f3 = arrayList;
        this.f22825g3 = i10;
        this.f22827i3 = o2Var;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, this, null);
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(3);
        this.Z2 = a0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        ma maVar = new ma(this, context);
        this.f22822d3 = maVar;
        setAdapter(maVar);
        setOnItemClickListener(new am0() {
            @Override
            public final void d(int i11, View view) {
                na naVar = na.this;
                naVar.getClass();
                naVar.E1(((ThemesHorizontalListCell$InnerThemeView) view).f22060b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    naVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > naVar.getMeasuredWidth()) {
                    naVar.v0(right - naVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ja(this, 0));
    }

    public final void C1(org.telegram.ui.ActionBar.j6 j6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f22060b == j6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f22060b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void D1(int i10) {
        org.telegram.ui.ActionBar.j6 C0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f22825g3 == 1) {
                C0 = org.telegram.ui.ActionBar.k6.J;
            } else {
                C0 = org.telegram.ui.ActionBar.k6.C0();
            }
            this.f22821c3 = C0;
            ArrayList arrayList = this.f22824f3;
            int indexOf = arrayList.indexOf(C0);
            if (indexOf < 0 && (indexOf = this.f22823e3.indexOf(this.f22821c3) + arrayList.size()) < 0) {
                return;
            }
            this.Z2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void E1(org.telegram.ui.ActionBar.j6 j6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.j6 C0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = j6Var.F;
        if (tL_theme != null) {
            if (j6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f22827i3;
                    if (o2Var != null) {
                        o2Var.presentFragment(new uc1(j6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(j6Var.d)) {
            org.telegram.ui.ActionBar.f6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f22825g3 != 1 && !j6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, j6Var.m());
        edit.commit();
        if (this.f22825g3 == 1) {
            if (j6Var != org.telegram.ui.ActionBar.k6.J) {
                if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.k6.J = j6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.k6.l(true);
                }
            } else {
                return;
            }
        } else if (j6Var != org.telegram.ui.ActionBar.k6.C0()) {
            org.telegram.ui.ActionBar.k6.H1(j6Var, false, -1, view);
        } else {
            return;
        }
        G1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f22059a0.f22825g3 == 1) {
                    C0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    C0 = org.telegram.ui.ActionBar.k6.C0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f22058a;
                if (themesHorizontalListCell$InnerThemeView.f22060b == C0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.f4.p(j6Var, j6Var.Y);
        if (this.f22825g3 != 1) {
            org.telegram.ui.ActionBar.k6.J1(this.f22827i3);
        }
    }

    public abstract void G1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f22819a3.get(str);
            if (j6Var != null) {
                this.f22819a3.remove(str);
                if (this.f22820b3.remove(j6Var) != null) {
                    Utilities.globalQueue.postRunnable(new ig.d2(this, j6Var, file, 25));
                } else {
                    C1(j6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.f22819a3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.Y2) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21304k0);
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
        this.Y2 = z10;
    }

    public void F1(org.telegram.ui.ActionBar.j6 j6Var) {
    }
}
