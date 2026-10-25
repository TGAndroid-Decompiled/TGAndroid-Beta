package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zp;
public final class y1 extends FrameLayout {
    public final int E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public View I;
    public View J;
    public int f25734a;
    public final org.telegram.ui.ActionBar.u6 f25735b;
    public final w1 f25736c;
    public final v1 d;
    public final View e;
    public final TextView f25737f;
    public final View h;
    public final CheckBoxSquare f25738n;
    public final zp f25739r;
    public View f25740s;
    public final x1 v;
    public final org.telegram.ui.Components.y9 f25741w;
    public final org.telegram.ui.Components.j9 f25742x;
    public final int f25743y;

    public y1(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public final boolean a() {
        int i10 = this.f25743y;
        if (i10 != 4 && i10 != 8 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        zp zpVar = this.f25739r;
        if (zpVar != null) {
            return zpVar.f35379a.f26087q;
        }
        return this.f25738n.h;
    }

    public final void c(boolean z10, boolean z11) {
        zp zpVar = this.f25739r;
        if (zpVar != null) {
            zpVar.a(z10, z11);
        } else {
            this.f25738n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, org.telegram.ui.ActionBar.u1 u1Var) {
        int i10;
        if (aVar == null) {
            View view = this.I;
            if (view != null) {
                removeView(view);
                this.I = null;
            }
        } else {
            if (this.I == null) {
                View view2 = new View(getContext());
                this.I = view2;
                int i11 = org.telegram.ui.ActionBar.y6.f23446i6;
                org.telegram.ui.ActionBar.u6 u6Var = this.f25735b;
                y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 2, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                view2.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(view2, g02, null, N, u6Var);
                addView(this.I, gb1.i(-1, -1, 119));
            }
            this.I.setOnClickListener(aVar);
        }
        if (u1Var == null) {
            View view3 = this.J;
            if (view3 != null) {
                removeView(view3);
                this.J = null;
                return;
            }
            return;
        }
        if (this.J == null) {
            View view4 = new View(getContext());
            this.J = view4;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(view4, gb1.i(56, -1, i10));
        }
        this.J.setOnClickListener(u1Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.H) {
            v1 v1Var = this.d;
            v1Var.c(Emoji.replaceEmoji(charSequence, v1Var.getPaint().getFontMetricsInt(), false), z12, true);
        } else {
            this.f25736c.setText(charSequence);
        }
        zp zpVar = this.f25739r;
        if (zpVar != null) {
            zpVar.a(z10, z12);
        } else {
            this.f25738n.a(z10, z12);
        }
        this.f25737f.setText(str);
        this.F = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f7;
        float left;
        View view = this.e;
        if (this.f25740s == null) {
            return;
        }
        try {
            f7 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f7 = 0.0f;
        }
        if (LocaleController.isRTL) {
            left = (view.getRight() - f7) - AndroidUtilities.dp(20.0f);
        } else {
            left = view.getLeft() + f7 + AndroidUtilities.dp(4.0f);
        }
        this.f25740s.setTranslationX(left);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.u6 u6Var = this.f25735b;
        int i14 = this.f25743y;
        if (z10) {
            if (i14 != 1 && i14 != 5) {
                i13 = org.telegram.ui.ActionBar.y6.G6;
            } else {
                i13 = org.telegram.ui.ActionBar.y6.f23462j5;
            }
            org.telegram.ui.ActionBar.f7.Z(this.d, i13, u6Var);
        } else {
            if (i14 != 1 && i14 != 5) {
                i10 = org.telegram.ui.ActionBar.y6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23462j5;
            }
            w1 w1Var = this.f25736c;
            org.telegram.ui.ActionBar.f7.V(w1Var, i10, u6Var);
            if (i14 != 1 && i14 != 5) {
                i11 = org.telegram.ui.ActionBar.y6.J6;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23481k5;
            }
            org.telegram.ui.ActionBar.f7.H(w1Var, i11, u6Var);
        }
        if (i14 != 1 && i14 != 5) {
            i12 = org.telegram.ui.ActionBar.y6.I6;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.f23517m5;
        }
        org.telegram.ui.ActionBar.f7.V(this.f25737f, i12, u6Var);
    }

    public org.telegram.ui.Components.s6 getAnimatedTextView() {
        return this.d;
    }

    public zp getCheckBoxRound() {
        return this.f25739r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f25736c;
    }

    public TextView getValueTextView() {
        return this.f25737f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint;
        float f10;
        if (this.F) {
            if (a()) {
                f7 = 60.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.f25743y == 7) {
                dp += AndroidUtilities.dp(39.0f);
            }
            org.telegram.ui.ActionBar.u6 u6Var = this.f25735b;
            if (u6Var != null) {
                paint = u6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.y6.f23476k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                dp = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - dp, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        v1 v1Var = this.d;
        if (v1Var != null) {
            accessibilityNodeInfo.setText(v1Var.getText());
        } else {
            w1 w1Var = this.f25736c;
            if (w1Var != null) {
                accessibilityNodeInfo.setText(w1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        View view = this.h;
        int i12 = this.E;
        View view2 = this.e;
        TextView textView = this.f25737f;
        int i13 = this.f25743y;
        if (i13 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), Integer.MIN_VALUE));
            float f10 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            setMeasuredDimension(AndroidUtilities.dp(29.0f) + view2.getMeasuredWidth(), AndroidUtilities.dp(50.0f));
        } else if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.F ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f7 = 60.0f;
            } else {
                f7 = 34.0f;
            }
            int dp = measuredWidth - AndroidUtilities.dp(f7);
            if (this.H) {
                dp += (int) this.d.getRightPadding();
            }
            if (i13 == 7) {
                dp -= AndroidUtilities.dp(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                dp -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i14 = dp / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            x1 x1Var = this.v;
            if (x1Var != null) {
                x1Var.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = org.telegram.ui.d3.w(11.0f, x1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(vh.x(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(vh.x(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.y9 y9Var = this.f25741w;
            if (y9Var != null) {
                y9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
            }
            float f11 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
        }
        View view3 = this.I;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.I.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view4 = this.J;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view5 = this.f25740s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f7;
        if (bool == null) {
            View view = this.f25740s;
            if (view != null) {
                removeView(view);
                this.f25740s = null;
                return;
            }
            return;
        }
        if (this.f25740s == null) {
            this.f25740s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.G6, this.f25735b, PorterDuff.Mode.MULTIPLY);
            this.f25740s.setBackground(mutate);
            addView(this.f25740s, gb1.i(16, 16, 16));
        }
        f();
        this.f25740s.animate().cancel();
        ViewPropertyAnimator animate = this.f25740s.animate();
        if (bool.booleanValue()) {
            f7 = 0.0f;
        } else {
            f7 = 180.0f;
        }
        animate.rotation(f7).setDuration(340L).setInterpolator(ds.h).start();
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        float f11 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.e.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f25737f.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.h.setAlpha(f11);
    }

    public void setIcon(int i10) {
        this.f25739r.setIcon(i10);
    }

    public void setMultiline(boolean z10) {
        if (this.H) {
            return;
        }
        this.G = z10;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.G;
        w1 w1Var = this.f25736c;
        if (z11) {
            w1Var.setLines(0);
            w1Var.setMaxLines(0);
            w1Var.setSingleLine(false);
            w1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            w1Var.setLines(1);
            w1Var.setMaxLines(1);
            w1Var.setSingleLine(true);
            w1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = AndroidUtilities.dp(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.F = z10;
    }

    public void setPad(int i10) {
        int i11;
        int i12 = i10 * 40;
        if (LocaleController.isRTL) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        int dp = AndroidUtilities.dp(i12 * i11);
        View view = this.h;
        if (view != null) {
            view.setTranslationX(dp);
        }
        float f7 = dp;
        this.e.setTranslationX(f7);
        org.telegram.ui.Components.y9 y9Var = this.f25741w;
        if (y9Var != null) {
            y9Var.setTranslationX(f7);
        }
        View view2 = this.I;
        if (view2 != null) {
            view2.setTranslationX(f7);
        }
        View view3 = this.J;
        if (view3 != null) {
            view3.setTranslationX(f7);
        }
    }

    public void setTextColor(int i10) {
        int i11;
        if (this.H) {
            v1 v1Var = this.d;
            org.telegram.ui.ActionBar.f7.r(v1Var);
            v1Var.setTextColor(i10);
            return;
        }
        w1 w1Var = this.f25736c;
        org.telegram.ui.ActionBar.f7.r(w1Var);
        w1Var.setTextColor(i10);
        int i12 = this.f25743y;
        if (i12 != 1 && i12 != 5) {
            i11 = org.telegram.ui.ActionBar.y6.J6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23481k5;
        }
        if (w1Var.getLinkTextColors() != null) {
            int defaultColor = w1Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.u6 u6Var = this.f25735b;
            if (defaultColor == org.telegram.ui.ActionBar.y6.w0(i11, u6Var)) {
                org.telegram.ui.ActionBar.f7.H(w1Var, i11, u6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String formatName;
        org.telegram.ui.Components.j9 j9Var = this.f25742x;
        j9Var.p(tLObject);
        this.f25741w.f(tLObject, j9Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        if (z10) {
            formatName = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            formatName = ContactsController.formatName(tLObject);
        }
        if (z10 && ((TLRPC.User) tLObject).f22174id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            formatName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (this.H) {
            v1 v1Var = this.d;
            v1Var.setText(Emoji.replaceEmoji(formatName, v1Var.getPaint().getFontMetricsInt(), false));
            return;
        }
        this.f25736c.setText(formatName);
    }

    public y1(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this(i10, 17, context, u6Var, false);
    }

    public y1(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.f25735b = u6Var;
        this.f25743y = i10;
        this.H = z10;
        boolean z11 = true;
        if (z10) {
            v1 v1Var = new v1(this, context, 0);
            this.d = v1Var;
            NotificationCenter.listenEmojiLoading(v1Var);
            v1Var.setEllipsizeByGradient(true);
            v1Var.setRightPadding(AndroidUtilities.dp(8.0f));
            v1Var.getDrawable().r(true, false);
            v1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.y6.f23462j5 : org.telegram.ui.ActionBar.y6.G6, u6Var)));
            v1Var.setTextSize(AndroidUtilities.dp(16.0f));
            if (i10 == 7) {
                v1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                v1Var.setGravity(19);
                addView(v1Var, gb1.h(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                v1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                v1Var.setRightPadding(AndroidUtilities.dp(i11));
                v1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z12 = LocaleController.isRTL;
                    addView(v1Var, gb1.h(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i10 == 7 ? i12 + 39 : i12;
                    boolean z13 = LocaleController.isRTL;
                    addView(v1Var, gb1.h(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i11 : (i11 - 17) + i12, 0.0f, z13 ? (i11 - 17) + i12 : i11, 0.0f));
                }
            }
            this.e = v1Var;
        } else {
            w1 w1Var = new w1(this, context, 0);
            this.f25736c = w1Var;
            NotificationCenter.listenEmojiLoading(w1Var);
            w1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.y6.f23462j5 : org.telegram.ui.ActionBar.y6.G6, u6Var)));
            w1Var.setTextSize(1, 16.0f);
            w1Var.setLines(1);
            w1Var.setMaxLines(1);
            w1Var.setSingleLine(true);
            w1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i10 == 7) {
                w1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                w1Var.setGravity(19);
                addView(w1Var, gb1.h(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z14 = LocaleController.isRTL;
                    addView(w1Var, gb1.h(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = LocaleController.isRTL;
                    addView(w1Var, gb1.h(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i11 : (i11 - 17) + i13, 0.0f, z15 ? (i11 - 17) + i13 : i11, 0.0f));
                }
            }
            this.e = w1Var;
        }
        TextView textView = new TextView(context);
        this.f25737f = textView;
        textView.setTag(Integer.valueOf((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.y6.f23517m5 : org.telegram.ui.ActionBar.y6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f7 = i11;
        addView(textView, gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f));
        if (a()) {
            zp zpVar = new zp(context, 21, u6Var);
            this.f25739r = zpVar;
            this.h = zpVar;
            zpVar.setDrawUnchecked(true);
            zpVar.a(true, false);
            zpVar.setDrawBackgroundAsArc(10);
            this.E = 21;
            float f10 = 21;
            boolean z16 = LocaleController.isRTL;
            addView(zpVar, gb1.h(21, f10, (z16 ? 5 : 3) | 48, z16 ? 0 : i11, 16.0f, z16 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, u6Var, z11);
            this.f25738n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.E = 18;
            if (i10 == 5) {
                float f11 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, gb1.h(18, f11, (z17 ? 5 : 3) | 16, z17 ? 0 : i11, 0.0f, z17 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, gb1.h(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, gb1.h(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f12 = 18;
                boolean z18 = LocaleController.isRTL;
                addView(checkBoxSquare, gb1.h(18, f12, (z18 ? 5 : 3) | 48, z18 ? 0 : i11, 16.0f, z18 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            x1 x1Var = new x1(this, context, R.drawable.msg_folders_groups);
            this.v = x1Var;
            addView(x1Var, gb1.m(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            x1 x1Var2 = new x1(this, context, 0);
            this.v = x1Var2;
            addView(x1Var2, gb1.m(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.f25742x = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            this.f25741w = y9Var;
            y9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(y9Var, gb1.m(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
