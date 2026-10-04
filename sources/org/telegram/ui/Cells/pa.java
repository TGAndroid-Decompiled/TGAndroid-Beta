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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.wd1;
public abstract class pa extends zl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f22660p3 = new byte[1024];
    public boolean f22661e3;
    public final gg.b0 f22662f3;
    public final HashMap f22663g3;
    public final HashMap f22664h3;
    public org.telegram.ui.ActionBar.h6 f22665i3;
    public final oa j3;
    public final ArrayList f22666k3;
    public final ArrayList f22667l3;
    public final int f22668m3;
    public int f22669n3;
    public final org.telegram.ui.ActionBar.n2 f22670o3;

    public pa(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f22663g3 = new HashMap();
        this.f22664h3 = new HashMap();
        this.f22666k3 = arrayList2;
        this.f22667l3 = arrayList;
        this.f22668m3 = i10;
        this.f22670o3 = n2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20890h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20818d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(3);
        this.f22662f3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        oa oaVar = new oa(this, context);
        this.j3 = oaVar;
        setAdapter(oaVar);
        setOnItemClickListener(new ml0() {
            @Override
            public final void d(int i11, View view) {
                pa paVar = pa.this;
                paVar.getClass();
                paVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).f21758b);
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

    public final void A1(org.telegram.ui.ActionBar.h6 h6Var) {
        String str;
        org.telegram.ui.ActionBar.h6 A0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = h6Var.F;
        if (tL_theme != null) {
            if (h6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f22670o3;
                    if (n2Var != null) {
                        n2Var.presentFragment(new wd1(h6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(h6Var.d)) {
            org.telegram.ui.ActionBar.c6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f22668m3 != 1 && !h6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, h6Var.m());
        edit.commit();
        if (this.f22668m3 == 1) {
            if (h6Var != org.telegram.ui.ActionBar.i6.J) {
                if (org.telegram.ui.ActionBar.i6.I == org.telegram.ui.ActionBar.i6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.i6.J = h6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.i6.l(true);
                }
            } else {
                return;
            }
        } else if (h6Var != org.telegram.ui.ActionBar.i6.A0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, h6Var, Boolean.FALSE, null, -1);
        } else {
            return;
        }
        C1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f21757a0.f22668m3 == 1) {
                    A0 = org.telegram.ui.ActionBar.i6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.i6.A0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f21756a;
                if (themesHorizontalListCell$InnerThemeView.f21758b == A0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.c4.q(h6Var, h6Var.Y);
        if (this.f22668m3 != 1) {
            org.telegram.ui.ActionBar.i6.F1(this.f22670o3);
        }
    }

    public abstract void C1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f22663g3.get(str);
            if (h6Var != null) {
                this.f22663g3.remove(str);
                if (this.f22664h3.remove(h6Var) != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, h6Var, file, 8));
                } else {
                    y1(h6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.f22663g3.remove((String) objArr[0]);
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
        if (this.f22661e3) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20941k0);
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
        this.f22661e3 = z10;
    }

    public final void y1(org.telegram.ui.ActionBar.h6 h6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f21758b == h6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f21758b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void z1(int i10) {
        org.telegram.ui.ActionBar.h6 A0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f22668m3 == 1) {
                A0 = org.telegram.ui.ActionBar.i6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.i6.A0();
            }
            this.f22665i3 = A0;
            ArrayList arrayList = this.f22667l3;
            int indexOf = arrayList.indexOf(A0);
            if (indexOf < 0 && (indexOf = this.f22666k3.indexOf(this.f22665i3) + arrayList.size()) < 0) {
                return;
            }
            this.f22662f3.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public void B1(org.telegram.ui.ActionBar.h6 h6Var) {
    }
}
