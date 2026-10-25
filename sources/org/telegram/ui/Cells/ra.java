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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.xc1;
public abstract class ra extends mm0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f24996q3 = new byte[1024];
    public boolean f24997f3;
    public final ig.a0 f24998g3;
    public final HashMap f24999h3;
    public final HashMap f25000i3;
    public org.telegram.ui.ActionBar.x6 f25001j3;
    public final qa f25002k3;
    public final ArrayList f25003l3;
    public final ArrayList f25004m3;
    public final int f25005n3;
    public int f25006o3;
    public final org.telegram.ui.ActionBar.r2 f25007p3;

    public ra(Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f24999h3 = new HashMap();
        this.f25000i3 = new HashMap();
        this.f25003l3 = arrayList2;
        this.f25004m3 = arrayList;
        this.f25005n3 = i10;
        this.f25007p3 = r2Var;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, this, null);
        } else {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        ig.a0 a0Var = new ig.a0(3);
        this.f24998g3 = a0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        a0Var.k1(0);
        setLayoutManager(a0Var);
        qa qaVar = new qa(this, context);
        this.f25002k3 = qaVar;
        setAdapter(qaVar);
        setOnItemClickListener(new zl0() {
            @Override
            public final void c(int i11, View view) {
                ra raVar = ra.this;
                raVar.getClass();
                raVar.E1(((ThemesHorizontalListCell$InnerThemeView) view).f23824b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    raVar.w0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > raVar.getMeasuredWidth()) {
                    raVar.w0(right - raVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new na(this, 0));
    }

    public final void C1(org.telegram.ui.ActionBar.x6 x6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f23824b == x6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f23824b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void D1(int i10) {
        org.telegram.ui.ActionBar.x6 C0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f25005n3 == 1) {
                C0 = org.telegram.ui.ActionBar.y6.J;
            } else {
                C0 = org.telegram.ui.ActionBar.y6.C0();
            }
            this.f25001j3 = C0;
            ArrayList arrayList = this.f25004m3;
            int indexOf = arrayList.indexOf(C0);
            if (indexOf < 0 && (indexOf = this.f25003l3.indexOf(this.f25001j3) + arrayList.size()) < 0) {
                return;
            }
            this.f24998g3.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void E1(org.telegram.ui.ActionBar.x6 x6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.x6 C0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = x6Var.F;
        if (tL_theme != null) {
            if (x6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.r2 r2Var = this.f25007p3;
                    if (r2Var != null) {
                        r2Var.presentFragment(new xc1(x6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(x6Var.d)) {
            org.telegram.ui.ActionBar.t6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f25005n3 != 1 && !x6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, x6Var.m());
        edit.commit();
        if (this.f25005n3 == 1) {
            if (x6Var != org.telegram.ui.ActionBar.y6.J) {
                if (org.telegram.ui.ActionBar.y6.I == org.telegram.ui.ActionBar.y6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.y6.J = x6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.y6.l(true);
                }
            } else {
                return;
            }
        } else if (x6Var != org.telegram.ui.ActionBar.y6.C0()) {
            org.telegram.ui.ActionBar.y6.H1(x6Var, false, -1, view);
        } else {
            return;
        }
        G1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f23823a0.f25005n3 == 1) {
                    C0 = org.telegram.ui.ActionBar.y6.J;
                } else {
                    C0 = org.telegram.ui.ActionBar.y6.C0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f23822a;
                if (themesHorizontalListCell$InnerThemeView.f23824b == C0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.h4.p(x6Var, x6Var.Y);
        if (this.f25005n3 != 1) {
            org.telegram.ui.ActionBar.y6.J1(this.f25007p3);
        }
    }

    public abstract void G1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) this.f24999h3.get(str);
            if (x6Var != null) {
                this.f24999h3.remove(str);
                if (this.f25000i3.remove(x6Var) != null) {
                    Utilities.globalQueue.postRunnable(new jg.f1(this, x6Var, file, 26));
                } else {
                    C1(x6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.f24999h3.remove((String) objArr[0]);
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
        if (this.f24997f3) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
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
        this.f24997f3 = z10;
    }

    public void F1(org.telegram.ui.ActionBar.x6 x6Var) {
    }
}
