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
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.ae1;
public abstract class pa extends wl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f20783i3 = new byte[1024];
    public boolean X2;
    public final gg.b0 Y2;
    public final HashMap Z2;
    public final HashMap f20784a3;
    public org.telegram.ui.ActionBar.i6 f20785b3;
    public final oa f20786c3;
    public final ArrayList f20787d3;
    public final ArrayList f20788e3;
    public final int f20789f3;
    public int f20790g3;
    public final org.telegram.ui.ActionBar.n2 f20791h3;

    public pa(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.Z2 = new HashMap();
        this.f20784a3 = new HashMap();
        this.f20787d3 = arrayList2;
        this.f20788e3 = arrayList;
        this.f20789f3 = i10;
        this.f20791h3 = n2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19133h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(3);
        this.Y2 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        oa oaVar = new oa(this, context);
        this.f20786c3 = oaVar;
        setAdapter(oaVar);
        setOnItemClickListener(new kl0() {
            @Override
            public final void d(int i11, View view) {
                pa paVar = pa.this;
                paVar.getClass();
                paVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f19954b);
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

    public abstract void B1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.Z2.get(str);
            if (i6Var != null) {
                this.Z2.remove(str);
                if (this.f20784a3.remove(i6Var) != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, i6Var, file, 8));
                } else {
                    x1(i6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.Z2.remove((String) objArr[0]);
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
        if (this.X2) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f19184k0);
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
        this.X2 = z10;
    }

    public final void x1(org.telegram.ui.ActionBar.i6 i6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f19954b == i6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f19954b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void y1(int i10) {
        org.telegram.ui.ActionBar.i6 A0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f20789f3 == 1) {
                A0 = org.telegram.ui.ActionBar.j6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.j6.A0();
            }
            this.f20785b3 = A0;
            ArrayList arrayList = this.f20788e3;
            int indexOf = arrayList.indexOf(A0);
            if (indexOf < 0 && (indexOf = this.f20787d3.indexOf(this.f20785b3) + arrayList.size()) < 0) {
                return;
            }
            this.Y2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void z1(org.telegram.ui.ActionBar.i6 i6Var) {
        String str;
        org.telegram.ui.ActionBar.i6 A0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = i6Var.F;
        if (tL_theme != null) {
            if (i6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f20791h3;
                    if (n2Var != null) {
                        n2Var.presentFragment(new ae1(i6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(i6Var.d)) {
            org.telegram.ui.ActionBar.d6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f20789f3 != 1 && !i6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, i6Var.m());
        edit.commit();
        if (this.f20789f3 == 1) {
            if (i6Var != org.telegram.ui.ActionBar.j6.J) {
                if (org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.j6.J = i6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.j6.l(true);
                }
            } else {
                return;
            }
        } else if (i6Var != org.telegram.ui.ActionBar.j6.A0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, -1);
        } else {
            return;
        }
        B1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f19953a0.f20789f3 == 1) {
                    A0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.j6.A0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f19952a;
                if (themesHorizontalListCell$InnerThemeView.f19954b == A0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.d4.q(i6Var, i6Var.Y);
        if (this.f20789f3 != 1) {
            org.telegram.ui.ActionBar.j6.F1(this.f20791h3);
        }
    }

    public void A1(org.telegram.ui.ActionBar.i6 i6Var) {
    }
}
