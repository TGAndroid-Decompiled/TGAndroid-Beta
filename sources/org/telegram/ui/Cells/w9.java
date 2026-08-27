package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.zk0;

public abstract class w9 {
    public final ActionMode.Callback A;
    public final Rect B;
    public v9 C;
    public h7.j0 D;
    public zk0 E;
    public ViewGroup F;
    public Magnifier G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final RectF S;
    public final RectF T;
    public float U;
    public float V;
    public r9 W;
    public r9 X;
    public ActionMode Y;
    public boolean Z;

    public int f25858a;

    public final m9 f25859a0;

    public int f25860b;

    public int f25861b0;

    public int f25862c;

    public final OvershootInterpolator f25863c0;
    public int d;

    public boolean f25864d0;

    public boolean f25865e;

    public int f25866e0;

    public float f25867f;

    public final m.i3 f25868f0;

    public float f25869g;

    public final d9 f25870g0;
    public final int[] h = new int[2];

    public org.telegram.ui.ActionBar.c6 f25871h0;

    public boolean f25872i;

    public boolean f25873i0;

    public boolean f25874j;

    public boolean f25875j0;

    public boolean f25876k;

    public boolean f25877k0;

    public final int f25878l;

    public org.telegram.ui.u f25879l0;

    public final int f25880m;
    public ValueAnimator m0;

    public final float f25881n;

    public org.telegram.ui.ActionBar.n1 f25882n0;

    public final Paint f25883o;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout f25884o0;

    public final Paint f25885p;

    public TextView f25886p0;

    public final iq f25887q;

    public Rect f25888q0;

    public final Path f25889r;

    public final g f25890r0;

    public int f25891s;

    public final e9 f25892s0;

    public int f25893t;

    public final q9 f25894t0;

    public int f25895u;
    public int v;

    public int f25896w;

    public int f25897x;

    public boolean f25898y;

    public boolean f25899z;

    public w9() {
        new o9().f24825a = 0.0f;
        Paint paint = new Paint(1);
        this.f25883o = paint;
        this.f25885p = new Paint(1);
        iq iqVar = new iq();
        this.f25887q = iqVar;
        this.f25889r = new Path();
        new n9().f24737a = iqVar;
        this.f25895u = -1;
        this.v = -1;
        g9 g9Var = new g9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new h9(this, g9Var) : g9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f25859a0 = new m9();
        this.f25863c0 = new OvershootInterpolator();
        this.f25864d0 = false;
        this.f25868f0 = new m.i3(this, 9);
        this.f25870g0 = new d9(this);
        this.f25873i0 = true;
        this.f25879l0 = null;
        this.f25890r0 = new g(this, 7);
        this.f25892s0 = new e9(this);
        q9 q9Var = new q9();
        q9Var.f25084a = 0.0f;
        q9Var.f25085b = new ArrayList(1);
        q9Var.f25086c = 0;
        this.f25894t0 = q9Var;
        this.f25878l = ViewConfiguration.getLongPressTimeout();
        this.f25880m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float fDp = AndroidUtilities.dp(6.0f);
        this.f25881n = fDp;
        paint.setPathEffect(new CornerPathEffect(fDp));
        iqVar.d = 1.0f;
    }

    public static void a(w9 w9Var, int i10) {
        int lineRight;
        int i11;
        m9 m9Var = w9Var.f25859a0;
        if (Build.VERSION.SDK_INT < 28 || w9Var.W == null || w9Var.f25876k || !w9Var.f25872i || w9Var.C == null) {
            return;
        }
        int i12 = w9Var.f25874j ? w9Var.f25895u : w9Var.v;
        w9Var.j(i12, m9Var, false);
        Layout layout = m9Var.f24688b;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.clamp(i12 - m9Var.f24687a, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] iArrM = w9Var.m();
        int lineTop = (int) (((((layout.getLineTop(lineForOffset) + w9Var.f25860b) + iArrM[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + m9Var.f24689c);
        Object obj = w9Var.W;
        if (obj instanceof org.telegram.ui.y2) {
            i11 = iArrM[0];
            lineRight = ((View) obj).getMeasuredWidth() + i11;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + iArrM[0] + w9Var.f25858a + m9Var.d);
            lineRight = (int) (layout.getLineRight(lineForOffset) + iArrM[0] + w9Var.f25858a + m9Var.d);
            i11 = lineLeft;
        }
        if (i10 < i11) {
            i10 = i11;
        } else if (i10 > lineRight) {
            i10 = lineRight;
        }
        float f10 = lineTop;
        if (w9Var.I != f10) {
            w9Var.I = f10;
            w9Var.J = (f10 - w9Var.H) / 200.0f;
        }
        float f11 = i10;
        if (w9Var.L != f11) {
            w9Var.L = f11;
            w9Var.M = (f11 - w9Var.K) / 100.0f;
        }
        if (w9Var.G == null) {
            w9Var.G = new Magnifier(w9Var.C);
            w9Var.H = w9Var.I;
            w9Var.K = w9Var.L;
        }
        float f12 = w9Var.H;
        float f13 = w9Var.I;
        if (f12 != f13) {
            w9Var.H = (w9Var.J * 16.0f) + f12;
        }
        float f14 = w9Var.J;
        if (f14 > 0.0f && w9Var.H > f13) {
            w9Var.H = f13;
        } else if (f14 < 0.0f && w9Var.H < f13) {
            w9Var.H = f13;
        }
        float f15 = w9Var.K;
        float f16 = w9Var.L;
        if (f15 != f16) {
            w9Var.K = (w9Var.M * 16.0f) + f15;
        }
        float f17 = w9Var.M;
        if (f17 > 0.0f && w9Var.K > f16) {
            w9Var.K = f16;
        } else if (f17 < 0.0f && w9Var.K < f16) {
            w9Var.K = f16;
        }
        w9Var.G.show(w9Var.K, (lineBottom * 1.5f) + w9Var.H + AndroidUtilities.dp(8.0f));
        w9Var.G.update();
    }

    public static boolean z(char c10) {
        return Character.isLetter(c10) || Character.isDigit(c10) || c10 == '_';
    }

    public boolean A(MessageObject messageObject) {
        return messageObject != null && this.f25896w == messageObject.getId();
    }

    public void B(int i10, int i11, boolean z10, float f10, float f11, r9 r9Var) {
        int i12;
        int i13;
        if (this.f25874j) {
            this.f25895u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f25895u = i13;
                this.f25874j = false;
            }
            this.f25898y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f25895u) > i11) {
            this.v = i12;
            this.f25895u = i11;
            this.f25874j = true;
        }
        this.f25898y = true;
    }

    public final int[] C(int i10) {
        m9 m9Var = this.f25859a0;
        j(i10, m9Var, false);
        Layout layout = m9Var.f24688b;
        int i11 = i10 - m9Var.f24687a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + m9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + m9Var.f24689c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        v9 v9Var;
        if (!y() || (v9Var = this.C) == null) {
            return;
        }
        this.Q = true;
        v9Var.invalidate();
        v();
    }

    public boolean K() {
        return false;
    }

    public abstract void M(r9 r9Var, r9 r9Var2);

    public final boolean N(MotionEvent motionEvent) {
        w9 w9Var;
        int action = motionEvent.getAction();
        d9 d9Var = this.f25870g0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y10 = (int) motionEvent.getY();
                    int x8 = (int) motionEvent.getX();
                    int i10 = this.f25893t - y10;
                    int i11 = this.f25891s - x8;
                    int i12 = (i11 * i11) + (i10 * i10);
                    int i13 = this.f25880m;
                    if (i12 > i13 * i13) {
                        AndroidUtilities.cancelRunOnUIThread(d9Var);
                        this.f25899z = false;
                    }
                    return this.f25899z;
                }
                if (action != 3) {
                    return false;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(d9Var);
            this.f25899z = false;
            return false;
        }
        this.f25891s = (int) motionEvent.getX();
        this.f25893t = (int) motionEvent.getY();
        this.f25899z = false;
        int i14 = -AndroidUtilities.dp(8.0f);
        int i15 = -AndroidUtilities.dp(8.0f);
        Rect rect = this.B;
        rect.inset(i14, i15);
        if (!rect.contains(this.f25891s, this.f25893t) || this.X == null) {
            w9Var = this;
        } else {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i16 = this.f25891s;
            int i17 = this.f25893t;
            int i18 = rect.right;
            if (i16 > i18) {
                i16 = i18 - 1;
            }
            int i19 = rect.left;
            if (i16 < i19) {
                i16 = i19 + 1;
            }
            int i20 = i16;
            int i21 = rect.top;
            if (i17 < i21) {
                i17 = i21 + 1;
            }
            int i22 = rect.bottom;
            if (i17 > i22) {
                i17 = i22 - 1;
            }
            w9Var = this;
            int iL = w9Var.l(i20, i17, this.f25862c, this.d, this.X, true);
            CharSequence charSequenceT = t(w9Var.X, true);
            if (iL >= charSequenceT.length()) {
                m9 m9Var = w9Var.f25859a0;
                j(iL, m9Var, true);
                Layout layout = m9Var.f24688b;
                if (layout == null) {
                    w9Var.f25899z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i20 - w9Var.f25862c;
                if (f10 < m9Var.f24688b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > m9Var.f24688b.getLineLeft(lineCount)) {
                    iL = charSequenceT.length() - 1;
                }
            }
            if (iL >= 0 && iL < charSequenceT.length() && charSequenceT.charAt(iL) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(d9Var);
                AndroidUtilities.runOnUIThread(d9Var, w9Var.f25878l);
                w9Var.f25899z = true;
            }
        }
        return w9Var.f25899z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(jh.h2 h2Var) {
        this.D = h2Var;
    }

    public final void S() {
        this.f25875j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof zk0) {
            this.E = (zk0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        int iDp;
        if (this.C == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        ActionMode.Callback callback = this.A;
        if (i10 >= 23) {
            if (!this.f25872i && y() && d()) {
                if (!this.P) {
                    if (this.Y == null) {
                        org.telegram.ui.ActionBar.g4 g4Var = new org.telegram.ui.ActionBar.g4(this.C.getContext(), ng.a.d(callback), this.C, new org.telegram.ui.ActionBar.v4(this.C.getContext(), this.C, 1, r(), null));
                        this.Y = g4Var;
                        callback.onCreateActionMode(g4Var, g4Var.f22978c);
                    }
                    ActionMode actionMode = this.Y;
                    callback.onPrepareActionMode(actionMode, actionMode.getMenu());
                    this.Y.hide(1L);
                }
                AndroidUtilities.cancelRunOnUIThread(this.f25892s0);
                this.P = true;
                return;
            }
            return;
        }
        if (!this.f25864d0) {
            if (this.Y == null && y()) {
                this.Y = this.C.startActionMode(callback);
                return;
            }
            return;
        }
        if (!this.f25872i && y() && d()) {
            if (this.f25884o0 == null) {
                this.f25888q0 = new Rect();
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.C.getContext(), null);
                this.f25884o0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.f25884o0.setBackgroundDrawable(this.C.getContext().getResources().getDrawable(R.drawable.menu_copy));
                this.f25884o0.setAnimationEnabled(false);
                this.f25884o0.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        org.telegram.ui.ActionBar.n1 n1Var;
                        w9 w9Var = this.f24128a;
                        w9Var.getClass();
                        if (motionEvent.getActionMasked() != 0 || (n1Var = w9Var.f25882n0) == null || !n1Var.isShowing()) {
                            return false;
                        }
                        view.getHitRect(w9Var.f25888q0);
                        return false;
                    }
                });
                this.f25884o0.setShownFromBottom(false);
                TextView textView = new TextView(this.C.getContext());
                this.f25886p0 = textView;
                int i11 = org.telegram.ui.ActionBar.g6.f23144i6;
                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(u(i11), 2, -1));
                this.f25886p0.setGravity(16);
                this.f25886p0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                this.f25886p0.setTextSize(1, 15.0f);
                this.f25886p0.setTypeface(AndroidUtilities.bold());
                this.f25886p0.setText(this.C.getContext().getString(17039361));
                TextView textView2 = this.f25886p0;
                int i12 = org.telegram.ui.ActionBar.g6.E8;
                textView2.setTextColor(u(i12));
                final int i13 = 0;
                this.f25886p0.setOnClickListener(new View.OnClickListener(this) {

                    public final w9 f24171b;

                    {
                        this.f24171b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.f24171b.g();
                                break;
                            case 1:
                                w9 w9Var = this.f24171b;
                                w9Var.E();
                                w9Var.v();
                                break;
                            default:
                                w9 w9Var2 = this.f24171b;
                                w9Var2.I();
                                w9Var2.v();
                                break;
                        }
                    }
                });
                this.f25884o0.addView(this.f25886p0, h7.z5.c(48.0f, -2));
                boolean z10 = this instanceof rh.d3;
                if (z10) {
                    TextView textView3 = new TextView(this.C.getContext());
                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i11, this.f25871h0), 2, -1));
                    textView3.setGravity(16);
                    textView3.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    pa.m(15.0f, 1, textView3);
                    textView3.setText(this.C.getContext().getString(17039363));
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f25871h0));
                    final int i14 = 1;
                    textView3.setOnClickListener(new View.OnClickListener(this) {

                        public final w9 f24171b;

                        {
                            this.f24171b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    this.f24171b.g();
                                    break;
                                case 1:
                                    w9 w9Var = this.f24171b;
                                    w9Var.E();
                                    w9Var.v();
                                    break;
                                default:
                                    w9 w9Var2 = this.f24171b;
                                    w9Var2.I();
                                    w9Var2.v();
                                    break;
                            }
                        }
                    });
                    this.f25884o0.addView(textView3, h7.z5.c(48.0f, -2));
                }
                if (z10) {
                    TextView textView4 = new TextView(this.C.getContext());
                    textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i11, this.f25871h0), 2, -1));
                    textView4.setGravity(16);
                    textView4.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    pa.m(15.0f, 1, textView4);
                    textView4.setText(this.C.getContext().getString(17039371));
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f25871h0));
                    final int i15 = 2;
                    textView4.setOnClickListener(new View.OnClickListener(this) {

                        public final w9 f24171b;

                        {
                            this.f24171b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    this.f24171b.g();
                                    break;
                                case 1:
                                    w9 w9Var = this.f24171b;
                                    w9Var.E();
                                    w9Var.v();
                                    break;
                                default:
                                    w9 w9Var2 = this.f24171b;
                                    w9Var2.I();
                                    w9Var2.v();
                                    break;
                            }
                        }
                    });
                    this.f25884o0.addView(textView4, h7.z5.c(48.0f, -2));
                }
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(this.f25884o0, -2, -2);
                this.f25882n0 = n1Var;
                n1Var.f23682b = false;
                n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                this.f25882n0.setOutsideTouchable(true);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f25884o0;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(u(org.telegram.ui.ActionBar.g6.G8));
                }
            }
            if (this.W != null) {
                int i16 = -n();
                int i17 = i16 / 2;
                iDp = (i17 + ((C(this.f25895u)[1] + this.f25860b) + m()[1])) - AndroidUtilities.dp(4.0f);
                if (iDp < 0) {
                    iDp = 0;
                }
            } else {
                iDp = 0;
            }
            this.f25882n0.showAtLocation(this.C, 48, 0, iDp - AndroidUtilities.dp(48.0f));
            this.f25882n0.h();
        }
    }

    public final void V() {
        if (this.V == 1.0f || this.C == null) {
            return;
        }
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.V, 1.0f);
        this.m0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new r(this, 7));
        this.m0.setDuration((long) (Math.abs(1.0f - this.V) * 250.0f));
        this.m0.start();
    }

    public final void W() {
        this.Q = false;
        this.C.invalidate();
        g gVar = this.f25890r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        return (i10 == this.f25895u || i10 == this.v) ? false : true;
    }

    public boolean d() {
        return this.W != null;
    }

    public boolean e() {
        return false;
    }

    public void f(boolean z10) {
        F(z10);
        this.f25895u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f25896w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f25870g0);
        this.f25899z = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        h7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(false);
        }
        this.f25891s = -1;
        this.f25893t = -1;
        this.f25862c = -1;
        this.d = -1;
        this.f25867f = 0.0f;
        this.f25869g = 0.0f;
        this.f25872i = false;
    }

    public final void g() {
        if (y()) {
            if (!D()) {
                CharSequence charSequenceS = s();
                if (charSequenceS == null) {
                    return;
                } else {
                    AndroidUtilities.addToClipboard(charSequenceS);
                }
            }
            v();
            f(true);
            h7.j0 j0Var = this.D;
            if (j0Var != null) {
                j0Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i13;
        iq iqVar;
        float f13;
        q9 q9Var = this.f25894t0;
        q9Var.reset();
        layout.getSelectionPath(i11, i12, q9Var);
        if (q9Var.f25084a < layout.getLineBottom(i10)) {
            int lineTop = layout.getLineTop(i10);
            float lineBottom = layout.getLineBottom(i10) - lineTop;
            f12 = lineTop;
            f11 = lineBottom / (q9Var.f25084a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = q9Var.f25086c;
            iqVar = this.f25887q;
            f13 = this.f25881n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) q9Var.f25085b.get(i14);
            rectF.set((int) (Math.max(f10, rectF.left) - (z10 ? f13 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.z(rectF.top, f12, f11, f12), (int) (Math.max(f10, rectF.right) + (z11 ? f13 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.z(rectF.bottom, f12, f11, f12));
            iqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 != 0 || z11) {
            return;
        }
        try {
            iqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f13 / 2.0f), layout.getLineTop(i10), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void i(Canvas canvas, Layout layout, int i10, int i11, boolean z10, boolean z11, float f10) {
        int i12;
        Rect rect;
        int i13;
        float f11;
        int i14;
        Path path;
        int i15;
        w9 w9Var;
        int i16;
        float lineRight;
        iq iqVar;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int iClamp = Utilities.clamp(i10, layout.getText().length(), 0);
        int iClamp2 = Utilities.clamp(i11, layout.getText().length(), 0);
        iq iqVar2 = this.f25887q;
        iqVar2.reset();
        Path path2 = this.f25889r;
        path2.reset();
        float f12 = this.f25881n;
        float f13 = f12 * 1.65f;
        int i17 = (int) (f12 / 2.0f);
        int lineForOffset = layout.getLineForOffset(iClamp);
        int lineForOffset2 = layout.getLineForOffset(iClamp2);
        if (lineForOffset == lineForOffset2) {
            h(layout, lineForOffset, iClamp, iClamp2, !z10, !z11, f10);
            w9Var = this;
            path = path2;
            f11 = f13;
            i15 = lineForOffset;
            i14 = lineForOffset2;
        } else {
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == -1 || lineEnd <= 0) {
                i12 = lineEnd;
            } else {
                i12 = lineEnd - 1;
                CharSequence text = layout.getText();
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(i12);
                if (layout.isRtlCharAt(i12)) {
                    int i18 = i12;
                    while (layout.isRtlCharAt(i18) && i18 != 0) {
                        i18--;
                    }
                    i16 = lineEnd;
                    lineRight = layout.getLineForOffset(i18) == layout.getLineForOffset(i12) ? layout.getPrimaryHorizontal(i18 + 1) : layout.getLineLeft(lineForOffset);
                } else {
                    i16 = lineEnd;
                    lineRight = layout.getLineRight(lineForOffset);
                }
                int i19 = (int) lineRight;
                int iMin = Math.min(primaryHorizontal, i19);
                int iMax = Math.max(primaryHorizontal, i19);
                if (i12 > 0 && i12 < text.length() && !Character.isWhitespace(text.charAt(i16 - 2))) {
                    rect = new Rect(((int) Math.max(f10, iMin)) - i17, layout.getLineTop(lineForOffset), ((int) Math.max(f10, iMax)) + i17, layout.getLineBottom(lineForOffset));
                }
                h(layout, lineForOffset, iClamp, i12, !z10, true, f10);
                if (rect != null) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(rect);
                    iqVar2.addRect(rectF, Path.Direction.CW);
                }
                i13 = lineForOffset + 1;
                while (i13 < lineForOffset2) {
                    int lineLeft = (int) layout.getLineLeft(i13);
                    int lineRight2 = (int) layout.getLineRight(i13);
                    int iMin2 = Math.min(lineLeft, lineRight2);
                    int iMax2 = Math.max(lineLeft, lineRight2);
                    float fMax = Math.max(f10, iMin2);
                    float f14 = i17;
                    iqVar2.addRect(fMax - f14, layout.getLineTop(i13), Math.max(f10, iMax2) + f14, layout.getLineBottom(i13) + 1, Path.Direction.CW);
                    i13++;
                    lineForOffset2 = lineForOffset2;
                    i17 = i17;
                    lineForOffset = lineForOffset;
                    path2 = path2;
                    f13 = f13;
                }
                int i20 = lineForOffset;
                f11 = f13;
                i14 = lineForOffset2;
                path = path2;
                i15 = i20;
                iClamp2 = iClamp2;
                w9Var = this;
                w9Var.h(layout, i14, layout.getLineStart(i14), iClamp2, true, !z11, f10);
            }
            rect = null;
            h(layout, lineForOffset, iClamp, i12, !z10, true, f10);
            if (rect != null) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rect);
                iqVar2.addRect(rectF2, Path.Direction.CW);
            }
            i13 = lineForOffset + 1;
            while (i13 < lineForOffset2) {
                int lineLeft2 = (int) layout.getLineLeft(i13);
                int lineRight3 = (int) layout.getLineRight(i13);
                int iMin3 = Math.min(lineLeft2, lineRight3);
                int iMax3 = Math.max(lineLeft2, lineRight3);
                float fMax2 = Math.max(f10, iMin3);
                float f15 = i17;
                iqVar2.addRect(fMax2 - f15, layout.getLineTop(i13), Math.max(f10, iMax3) + f15, layout.getLineBottom(i13) + 1, Path.Direction.CW);
                i13++;
                lineForOffset2 = lineForOffset2;
                i17 = i17;
                lineForOffset = lineForOffset;
                path2 = path2;
                f13 = f13;
            }
            int i21 = lineForOffset;
            f11 = f13;
            i14 = lineForOffset2;
            path = path2;
            i15 = i21;
            iClamp2 = iClamp2;
            w9Var = this;
            w9Var.h(layout, i14, layout.getLineStart(i14), iClamp2, true, !z11, f10);
        }
        int i22 = Build.VERSION.SDK_INT;
        boolean z12 = i22 >= 26;
        if (z12) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(iClamp);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(iClamp2);
        float lineBottom = layout.getLineBottom(i15);
        float lineBottom2 = layout.getLineBottom(i14);
        if (z10 && z11 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f11) {
            float fMin = Math.min(primaryHorizontal2, primaryHorizontal3);
            float fMax3 = Math.max(primaryHorizontal2, primaryHorizontal3);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) fMin, (int) (lineBottom - f11), (int) fMax3, (int) lineBottom);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rect2);
            path.addRect(rectF3, Path.Direction.CW);
            if (i22 >= 26) {
                canvas.clipOutRect(rect2);
            }
            iqVar = iqVar2;
        } else {
            if (!z10 || layout.isRtlCharAt(iClamp)) {
                iqVar = iqVar2;
            } else {
                Rect rect3 = AndroidUtilities.rectTmp2;
                iqVar = iqVar2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f11), (int) Math.min(primaryHorizontal2 + f11, layout.getLineRight(i15)), (int) lineBottom);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(rect3);
                path.addRect(rectF4, Path.Direction.CW);
                if (i22 >= 26) {
                    rect3.set(rect3.left - ((int) f11), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z11 && !layout.isRtlCharAt(iClamp2)) {
                Rect rect4 = AndroidUtilities.rectTmp2;
                rect4.set((int) Math.max(primaryHorizontal3 - f11, layout.getLineLeft(i14)), (int) (lineBottom2 - f11), (int) primaryHorizontal3, (int) lineBottom2);
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(rect4);
                path.addRect(rectF5, Path.Direction.CW);
                if (i22 >= 26) {
                    canvas.clipOutRect(rect4);
                }
            }
        }
        iqVar.a();
        canvas.drawPath(iqVar, w9Var.f25883o);
        if (z12) {
            canvas.restore();
            canvas.drawPath(path, w9Var.f25885p);
        }
    }

    public abstract void j(int i10, m9 m9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10);

    public final int[] m() {
        int y10;
        View view = (View) this.W;
        int i10 = 0;
        if (view != null && this.F != null) {
            y10 = 0;
            int x8 = 0;
            while (true) {
                if (view == this.F) {
                    i10 = x8;
                    break;
                }
                if (view != null) {
                    y10 = (int) (view.getY() + y10);
                    x8 = (int) (view.getX() + x8);
                    if (view instanceof NestedScrollView) {
                        y10 -= view.getScrollY();
                        x8 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
                y10 = 0;
                break;
            }
        }
        y10 = 0;
        break;
        return new int[]{i10, y10};
    }

    public abstract int n();

    public final v9 o(Context context) {
        if (this.C == null) {
            this.C = new v9(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.c6 r() {
        return this.f25871h0;
    }

    public CharSequence s() {
        CharSequence charSequenceT = t(this.W, false);
        if (charSequenceT != null) {
            return charSequenceT.subSequence(this.f25895u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(r9 r9Var, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.f25871h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f25892s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.n1 n1Var = this.f25882n0;
        if (n1Var != null) {
            n1Var.d(true);
        }
    }

    public final void w() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT < 28 || (magnifier = this.G) == null) {
            return;
        }
        magnifier.dismiss();
        this.G = null;
    }

    public void x() {
        r9 r9Var = this.W;
        if (r9Var != null) {
            r9Var.invalidate();
        }
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.invalidate();
        }
    }

    public final boolean y() {
        return this.f25895u >= 0 && this.v >= 0;
    }

    public void E() {
    }

    public void F(boolean z10) {
    }

    public void G() {
    }

    public void I() {
    }

    public void O() {
    }

    public void P() {
    }

    public void L(float f10, float f11) {
    }

    public void J(int i10, int i11, MessageObject messageObject) {
    }
}
