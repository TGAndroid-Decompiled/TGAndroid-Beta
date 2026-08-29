package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
public final class y1 extends FrameLayout {
    public final int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public View E;
    public View F;
    public int f25982a;
    public final org.telegram.ui.ActionBar.c6 f25983b;
    public final w1 f25984c;
    public final v1 d;
    public final View f25985e;
    public final TextView f25986f;
    public final View h;
    public final CheckBoxSquare f25987n;
    public final hp f25988r;
    public View f25989s;
    public final x1 v;
    public final org.telegram.ui.Components.t9 f25990w;
    public final org.telegram.ui.Components.e9 f25991x;
    public final int f25992y;

    public y1(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public final boolean a() {
        int i10 = this.f25992y;
        if (i10 != 4 && i10 != 8 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        hp hpVar = this.f25988r;
        if (hpVar != null) {
            return hpVar.f29211a.f26324q;
        }
        return this.f25987n.h;
    }

    public final void c(boolean z10, boolean z11) {
        hp hpVar = this.f25988r;
        if (hpVar != null) {
            hpVar.a(z10, z11);
        } else {
            this.f25987n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, nh.r7 r7Var) {
        int i10;
        if (aVar == null) {
            View view = this.E;
            if (view != null) {
                removeView(view);
                this.E = null;
            }
        } else {
            if (this.E == null) {
                View view2 = new View(getContext());
                this.E = view2;
                view2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, this.f25983b), 2, -1));
                addView(this.E, i7.f6.e(-1, -1, 119));
            }
            this.E.setOnClickListener(aVar);
        }
        if (r7Var == null) {
            View view3 = this.F;
            if (view3 != null) {
                removeView(view3);
                this.F = null;
                return;
            }
            return;
        }
        if (this.F == null) {
            View view4 = new View(getContext());
            this.F = view4;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(view4, i7.f6.e(56, -1, i10));
        }
        this.F.setOnClickListener(r7Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.D) {
            v1 v1Var = this.d;
            v1Var.c(Emoji.replaceEmoji(charSequence, v1Var.getPaint().getFontMetricsInt(), false), z12, true);
        } else {
            this.f25984c.setText(charSequence);
        }
        hp hpVar = this.f25988r;
        if (hpVar != null) {
            hpVar.a(z10, z12);
        } else {
            this.f25987n.a(z10, z12);
        }
        this.f25986f.setText(str);
        this.B = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f9;
        float left;
        View view = this.f25985e;
        if (this.f25989s == null) {
            return;
        }
        try {
            f9 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f9 = 0.0f;
        }
        if (LocaleController.isRTL) {
            left = (view.getRight() - f9) - AndroidUtilities.dp(20.0f);
        } else {
            left = view.getLeft() + f9 + AndroidUtilities.dp(4.0f);
        }
        this.f25989s.setTranslationX(left);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10 = this.D;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25983b;
        int i14 = this.f25992y;
        if (z10) {
            if (i14 != 1 && i14 != 5) {
                i13 = org.telegram.ui.ActionBar.g6.G6;
            } else {
                i13 = org.telegram.ui.ActionBar.g6.f23169j5;
            }
            this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        } else {
            if (i14 != 1 && i14 != 5) {
                i10 = org.telegram.ui.ActionBar.g6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23169j5;
            }
            int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            w1 w1Var = this.f25984c;
            w1Var.setTextColor(v02);
            if (i14 != 1 && i14 != 5) {
                i11 = org.telegram.ui.ActionBar.g6.J6;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f23188k5;
            }
            w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        }
        if (i14 != 1 && i14 != 5) {
            i12 = org.telegram.ui.ActionBar.g6.I6;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.f23222m5;
        }
        this.f25986f.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
    }

    public org.telegram.ui.Components.o6 getAnimatedTextView() {
        return this.d;
    }

    public hp getCheckBoxRound() {
        return this.f25988r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f25984c;
    }

    public TextView getValueTextView() {
        return this.f25986f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        Paint paint;
        float f10;
        if (this.B) {
            if (a()) {
                f9 = 60.0f;
            } else {
                f9 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f9) + ((int) Math.abs(this.f25985e.getTranslationX()));
            if (this.f25992y == 7) {
                dp += AndroidUtilities.dp(39.0f);
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f25983b;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                dp = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - dp, getMeasuredHeight() - 1, paint2);
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
            w1 w1Var = this.f25984c;
            if (w1Var != null) {
                accessibilityNodeInfo.setText(w1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int size = View.MeasureSpec.getSize(i10);
        View view = this.h;
        int i12 = this.A;
        View view2 = this.f25985e;
        TextView textView = this.f25986f;
        int i13 = this.f25992y;
        if (i13 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), Integer.MIN_VALUE));
            float f10 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            setMeasuredDimension(AndroidUtilities.dp(29.0f) + view2.getMeasuredWidth(), AndroidUtilities.dp(50.0f));
        } else if (this.C) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.B ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f9 = 60.0f;
            } else {
                f9 = 34.0f;
            }
            int dp = measuredWidth - AndroidUtilities.dp(f9);
            if (this.D) {
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
                measuredWidth2 = org.telegram.ui.b.C(11.0f, x1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(org.telegram.ui.b.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(org.telegram.ui.b.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.t9 t9Var = this.f25990w;
            if (t9Var != null) {
                t9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
            }
            float f11 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
        }
        View view3 = this.E;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.E.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view4 = this.F;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view5 = this.f25989s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f9;
        if (bool == null) {
            View view = this.f25989s;
            if (view != null) {
                removeView(view);
                this.f25989s = null;
                return;
            }
            return;
        }
        if (this.f25989s == null) {
            this.f25989s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f25983b), PorterDuff.Mode.MULTIPLY));
            this.f25989s.setBackground(mutate);
            addView(this.f25989s, i7.f6.e(16, 16, 16));
        }
        f();
        this.f25989s.animate().cancel();
        ViewPropertyAnimator animate = this.f25989s.animate();
        if (bool.booleanValue()) {
            f9 = 0.0f;
        } else {
            f9 = 180.0f;
        }
        animate.rotation(f9).setDuration(340L).setInterpolator(jr.h).start();
    }

    @Override
    public void setEnabled(boolean z10) {
        float f9;
        float f10;
        super.setEnabled(z10);
        float f11 = 0.5f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        this.f25985e.setAlpha(f9);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f25986f.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.h.setAlpha(f11);
    }

    public void setIcon(int i10) {
        this.f25988r.setIcon(i10);
    }

    public void setMultiline(boolean z10) {
        if (this.D) {
            return;
        }
        this.C = z10;
        View view = this.f25985e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.C;
        w1 w1Var = this.f25984c;
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
        this.B = z10;
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
        float f9 = dp;
        this.f25985e.setTranslationX(f9);
        org.telegram.ui.Components.t9 t9Var = this.f25990w;
        if (t9Var != null) {
            t9Var.setTranslationX(f9);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setTranslationX(f9);
        }
        View view3 = this.F;
        if (view3 != null) {
            view3.setTranslationX(f9);
        }
    }

    public void setTextColor(int i10) {
        if (this.D) {
            this.d.setTextColor(i10);
        } else {
            this.f25984c.setTextColor(i10);
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String formatName;
        org.telegram.ui.Components.e9 e9Var = this.f25991x;
        e9Var.p(tLObject);
        this.f25990w.e(tLObject, e9Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        if (z10) {
            formatName = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            formatName = ContactsController.formatName(tLObject);
        }
        if (z10 && ((TLRPC.User) tLObject).f22539id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            formatName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (this.D) {
            v1 v1Var = this.d;
            v1Var.setText(Emoji.replaceEmoji(formatName, v1Var.getPaint().getFontMetricsInt(), false));
            return;
        }
        this.f25984c.setText(formatName);
    }

    public y1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(i10, 17, context, c6Var, false);
    }

    public y1(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f25983b = c6Var;
        this.f25992y = i10;
        this.D = z10;
        boolean z11 = true;
        if (z10) {
            v1 v1Var = new v1(this, context, 0);
            this.d = v1Var;
            NotificationCenter.listenEmojiLoading(v1Var);
            v1Var.setEllipsizeByGradient(true);
            v1Var.setRightPadding(AndroidUtilities.dp(8.0f));
            v1Var.getDrawable().o(true, false, false);
            v1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.f23169j5 : org.telegram.ui.ActionBar.g6.G6, c6Var)));
            v1Var.setTextSize(AndroidUtilities.dp(16.0f));
            if (i10 == 7) {
                v1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                v1Var.setGravity(19);
                addView(v1Var, i7.f6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                v1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                v1Var.setRightPadding(AndroidUtilities.dp(i11));
                v1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z12 = LocaleController.isRTL;
                    addView(v1Var, i7.f6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i10 == 7 ? i12 + 39 : i12;
                    boolean z13 = LocaleController.isRTL;
                    addView(v1Var, i7.f6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i11 : (i11 - 17) + i12, 0.0f, z13 ? (i11 - 17) + i12 : i11, 0.0f));
                }
            }
            this.f25985e = v1Var;
        } else {
            w1 w1Var = new w1(this, context, 0);
            this.f25984c = w1Var;
            NotificationCenter.listenEmojiLoading(w1Var);
            w1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.f23169j5 : org.telegram.ui.ActionBar.g6.G6, c6Var)));
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
                addView(w1Var, i7.f6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z14 = LocaleController.isRTL;
                    addView(w1Var, i7.f6.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = LocaleController.isRTL;
                    addView(w1Var, i7.f6.d(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i11 : (i11 - 17) + i13, 0.0f, z15 ? (i11 - 17) + i13 : i11, 0.0f));
                }
            }
            this.f25985e = w1Var;
        }
        TextView textView = new TextView(context);
        this.f25986f = textView;
        textView.setTag(Integer.valueOf((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.f23222m5 : org.telegram.ui.ActionBar.g6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f9 = i11;
        addView(textView, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f9, 0.0f, f9, 0.0f));
        if (a()) {
            hp hpVar = new hp(context, 21, c6Var);
            this.f25988r = hpVar;
            this.h = hpVar;
            hpVar.setDrawUnchecked(true);
            hpVar.a(true, false);
            hpVar.setDrawBackgroundAsArc(10);
            this.A = 21;
            float f10 = 21;
            boolean z16 = LocaleController.isRTL;
            addView(hpVar, i7.f6.d(21, f10, (z16 ? 5 : 3) | 48, z16 ? 0 : i11, 16.0f, z16 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, c6Var, z11);
            this.f25987n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.A = 18;
            if (i10 == 5) {
                float f11 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, i7.f6.d(18, f11, (z17 ? 5 : 3) | 16, z17 ? 0 : i11, 0.0f, z17 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, i7.f6.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, i7.f6.d(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f12 = 18;
                boolean z18 = LocaleController.isRTL;
                addView(checkBoxSquare, i7.f6.d(18, f12, (z18 ? 5 : 3) | 48, z18 ? 0 : i11, 16.0f, z18 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            x1 x1Var = new x1(this, context, R.drawable.msg_folders_groups);
            this.v = x1Var;
            addView(x1Var, i7.f6.i(-2.0f, -2.0f, 8388629, f9, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            x1 x1Var2 = new x1(this, context, 0);
            this.v = x1Var2;
            addView(x1Var2, i7.f6.i(-2.0f, -2.0f, 8388629, f9, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.f25991x = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            this.f25990w = t9Var;
            t9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(t9Var, i7.f6.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
