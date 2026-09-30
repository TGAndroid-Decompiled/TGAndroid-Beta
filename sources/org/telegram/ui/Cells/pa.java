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
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.td1;
public abstract class pa extends zl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f20836p3 = new byte[1024];
    public boolean f20837e3;
    public final gg.b0 f20838f3;
    public final HashMap f20839g3;
    public final HashMap f20840h3;
    public org.telegram.ui.ActionBar.g6 f20841i3;
    public final oa j3;
    public final ArrayList f20842k3;
    public final ArrayList f20843l3;
    public final int f20844m3;
    public int f20845n3;
    public final org.telegram.ui.ActionBar.m2 f20846o3;

    public pa(Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f20839g3 = new HashMap();
        this.f20840h3 = new HashMap();
        this.f20842k3 = arrayList2;
        this.f20843l3 = arrayList;
        this.f20844m3 = i10;
        this.f20846o3 = m2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19146h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(3);
        this.f20838f3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        oa oaVar = new oa(this, context);
        this.j3 = oaVar;
        setAdapter(oaVar);
        setOnItemClickListener(new nl0() {
            @Override
            public final void d(int i11, View view) {
                pa paVar = pa.this;
                paVar.getClass();
                paVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).f20007b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    paVar.w0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > paVar.getMeasuredWidth()) {
                    paVar.w0(right - paVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new la(this, 0));
    }

    public final void A1(org.telegram.ui.ActionBar.g6 g6Var) {
        String str;
        org.telegram.ui.ActionBar.g6 A0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = g6Var.F;
        if (tL_theme != null) {
            if (g6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.m2 m2Var = this.f20846o3;
                    if (m2Var != null) {
                        m2Var.presentFragment(new td1(g6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(g6Var.d)) {
            org.telegram.ui.ActionBar.c6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f20844m3 != 1 && !g6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, g6Var.m());
        edit.commit();
        if (this.f20844m3 == 1) {
            if (g6Var != org.telegram.ui.ActionBar.h6.J) {
                if (org.telegram.ui.ActionBar.h6.I == org.telegram.ui.ActionBar.h6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.h6.J = g6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.h6.l(true);
                }
            } else {
                return;
            }
        } else if (g6Var != org.telegram.ui.ActionBar.h6.A0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, -1);
        } else {
            return;
        }
        C1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f20006a0.f20844m3 == 1) {
                    A0 = org.telegram.ui.ActionBar.h6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.h6.A0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f20005a;
                if (themesHorizontalListCell$InnerThemeView.f20007b == A0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.b4.q(g6Var, g6Var.Y);
        if (this.f20844m3 != 1) {
            org.telegram.ui.ActionBar.h6.F1(this.f20846o3);
        }
    }

    public abstract void C1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f20839g3.get(str);
            if (g6Var != null) {
                this.f20839g3.remove(str);
                if (this.f20840h3.remove(g6Var) != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, g6Var, file, 8));
                } else {
                    y1(g6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.f20839g3.remove((String) objArr[0]);
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
        if (this.f20837e3) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19197k0);
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
        h1();
    }

    public void setDrawDivider(boolean z10) {
        this.f20837e3 = z10;
    }

    public final void y1(org.telegram.ui.ActionBar.g6 g6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f20007b == g6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f20007b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void z1(int i10) {
        org.telegram.ui.ActionBar.g6 A0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f20844m3 == 1) {
                A0 = org.telegram.ui.ActionBar.h6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.h6.A0();
            }
            this.f20841i3 = A0;
            ArrayList arrayList = this.f20843l3;
            int indexOf = arrayList.indexOf(A0);
            if (indexOf < 0 && (indexOf = this.f20842k3.indexOf(this.f20841i3) + arrayList.size()) < 0) {
                return;
            }
            this.f20838f3.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public void B1(org.telegram.ui.ActionBar.g6 g6Var) {
    }
}
