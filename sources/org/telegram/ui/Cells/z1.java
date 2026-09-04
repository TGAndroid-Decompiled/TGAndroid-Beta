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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
public final class z1 extends FrameLayout {
    public final int E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public View I;
    public View J;
    public int f23591a;
    public final org.telegram.ui.ActionBar.f6 f23592b;
    public final x1 f23593c;
    public final w1 d;
    public final View f23594e;
    public final TextView f23595f;
    public final View h;
    public final CheckBoxSquare f23596n;
    public final mp f23597r;
    public View f23598s;
    public final y1 v;
    public final org.telegram.ui.Components.x9 f23599w;
    public final org.telegram.ui.Components.i9 f23600x;
    public final int f23601y;

    public z1(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public final boolean a() {
        int i10 = this.f23601y;
        if (i10 != 4 && i10 != 8 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        mp mpVar = this.f23597r;
        if (mpVar != null) {
            return mpVar.f28477a.f23907q;
        }
        return this.f23596n.h;
    }

    public final void c(boolean z10, boolean z11) {
        mp mpVar = this.f23597r;
        if (mpVar != null) {
            mpVar.a(z10, z11);
        } else {
            this.f23596n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, bi.u1 u1Var) {
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
                view2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, this.f23592b), 2, -1));
                addView(this.I, w7.x5.e(-1, -1, 119));
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
            addView(view4, w7.x5.e(56, -1, i10));
        }
        this.J.setOnClickListener(u1Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.H) {
            w1 w1Var = this.d;
            w1Var.c(Emoji.replaceEmoji(charSequence, w1Var.getPaint().getFontMetricsInt(), false), z12, true);
        } else {
            this.f23593c.setText(charSequence);
        }
        mp mpVar = this.f23597r;
        if (mpVar != null) {
            mpVar.a(z10, z12);
        } else {
            this.f23596n.a(z10, z12);
        }
        this.f23595f.setText(str);
        this.F = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f7;
        float left;
        View view = this.f23594e;
        if (this.f23598s == null) {
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
        this.f23598s.setTranslationX(left);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23592b;
        int i14 = this.f23601y;
        if (z10) {
            if (i14 != 1 && i14 != 5) {
                i13 = org.telegram.ui.ActionBar.j6.G6;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.f20770j5;
            }
            this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        } else {
            if (i14 != 1 && i14 != 5) {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f20770j5;
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            x1 x1Var = this.f23593c;
            x1Var.setTextColor(v02);
            if (i14 != 1 && i14 != 5) {
                i11 = org.telegram.ui.ActionBar.j6.J6;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20790k5;
            }
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        }
        if (i14 != 1 && i14 != 5) {
            i12 = org.telegram.ui.ActionBar.j6.I6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.f20826m5;
        }
        this.f23595f.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
    }

    public org.telegram.ui.Components.q6 getAnimatedTextView() {
        return this.d;
    }

    public mp getCheckBoxRound() {
        return this.f23597r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f23593c;
    }

    public TextView getValueTextView() {
        return this.f23595f;
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
            int dp = AndroidUtilities.dp(f7) + ((int) Math.abs(this.f23594e.getTranslationX()));
            if (this.f23601y == 7) {
                dp += AndroidUtilities.dp(39.0f);
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f23592b;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
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
        w1 w1Var = this.d;
        if (w1Var != null) {
            accessibilityNodeInfo.setText(w1Var.getText());
        } else {
            x1 x1Var = this.f23593c;
            if (x1Var != null) {
                accessibilityNodeInfo.setText(x1Var.getText());
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
        View view2 = this.f23594e;
        TextView textView = this.f23595f;
        int i13 = this.f23601y;
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
            y1 y1Var = this.v;
            if (y1Var != null) {
                y1Var.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = wl.D(11.0f, y1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(wl.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(wl.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.x9 x9Var = this.f23599w;
            if (x9Var != null) {
                x9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
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
        View view5 = this.f23598s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f7;
        if (bool == null) {
            View view = this.f23598s;
            if (view != null) {
                removeView(view);
                this.f23598s = null;
                return;
            }
            return;
        }
        if (this.f23598s == null) {
            this.f23598s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f23592b), PorterDuff.Mode.MULTIPLY));
            this.f23598s.setBackground(mutate);
            addView(this.f23598s, w7.x5.e(16, 16, 16));
        }
        f();
        this.f23598s.animate().cancel();
        ViewPropertyAnimator animate = this.f23598s.animate();
        if (bool.booleanValue()) {
            f7 = 0.0f;
        } else {
            f7 = 180.0f;
        }
        animate.rotation(f7).setDuration(340L).setInterpolator(pr.h).start();
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
        this.f23594e.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f23595f.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.h.setAlpha(f11);
    }

    public void setIcon(int i10) {
        this.f23597r.setIcon(i10);
    }

    public void setMultiline(boolean z10) {
        if (this.H) {
            return;
        }
        this.G = z10;
        View view = this.f23594e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.G;
        x1 x1Var = this.f23593c;
        if (z11) {
            x1Var.setLines(0);
            x1Var.setMaxLines(0);
            x1Var.setSingleLine(false);
            x1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            x1Var.setLines(1);
            x1Var.setMaxLines(1);
            x1Var.setSingleLine(true);
            x1Var.setEllipsize(TextUtils.TruncateAt.END);
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
        this.f23594e.setTranslationX(f7);
        org.telegram.ui.Components.x9 x9Var = this.f23599w;
        if (x9Var != null) {
            x9Var.setTranslationX(f7);
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
        if (this.H) {
            this.d.setTextColor(i10);
        } else {
            this.f23593c.setTextColor(i10);
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String formatName;
        org.telegram.ui.Components.i9 i9Var = this.f23600x;
        i9Var.p(tLObject);
        this.f23599w.e(tLObject, i9Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        if (z10) {
            formatName = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            formatName = ContactsController.formatName(tLObject);
        }
        if (z10 && ((TLRPC.User) tLObject).f20016id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            formatName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (this.H) {
            w1 w1Var = this.d;
            w1Var.setText(Emoji.replaceEmoji(formatName, w1Var.getPaint().getFontMetricsInt(), false));
            return;
        }
        this.f23593c.setText(formatName);
    }

    public z1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(i10, 17, context, f6Var, false);
    }

    public z1(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f23592b = f6Var;
        this.f23601y = i10;
        this.H = z10;
        boolean z11 = true;
        if (z10) {
            w1 w1Var = new w1(this, context, 0);
            this.d = w1Var;
            NotificationCenter.listenEmojiLoading(w1Var);
            w1Var.setEllipsizeByGradient(true);
            w1Var.setRightPadding(AndroidUtilities.dp(8.0f));
            w1Var.getDrawable().o(true, false, false);
            w1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.j6.f20770j5 : org.telegram.ui.ActionBar.j6.G6, f6Var)));
            w1Var.setTextSize(AndroidUtilities.dp(16.0f));
            if (i10 == 7) {
                w1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                w1Var.setGravity(19);
                addView(w1Var, w7.x5.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setRightPadding(AndroidUtilities.dp(i11));
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z12 = LocaleController.isRTL;
                    addView(w1Var, w7.x5.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i10 == 7 ? i12 + 39 : i12;
                    boolean z13 = LocaleController.isRTL;
                    addView(w1Var, w7.x5.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i11 : (i11 - 17) + i12, 0.0f, z13 ? (i11 - 17) + i12 : i11, 0.0f));
                }
            }
            this.f23594e = w1Var;
        } else {
            x1 x1Var = new x1(this, context, 0);
            this.f23593c = x1Var;
            NotificationCenter.listenEmojiLoading(x1Var);
            x1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.j6.f20770j5 : org.telegram.ui.ActionBar.j6.G6, f6Var)));
            x1Var.setTextSize(1, 16.0f);
            x1Var.setLines(1);
            x1Var.setMaxLines(1);
            x1Var.setSingleLine(true);
            x1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i10 == 7) {
                x1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                x1Var.setGravity(19);
                addView(x1Var, w7.x5.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                x1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                x1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z14 = LocaleController.isRTL;
                    addView(x1Var, w7.x5.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = LocaleController.isRTL;
                    addView(x1Var, w7.x5.d(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i11 : (i11 - 17) + i13, 0.0f, z15 ? (i11 - 17) + i13 : i11, 0.0f));
                }
            }
            this.f23594e = x1Var;
        }
        TextView textView = new TextView(context);
        this.f23595f = textView;
        textView.setTag(Integer.valueOf((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.j6.f20826m5 : org.telegram.ui.ActionBar.j6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f7 = i11;
        addView(textView, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f));
        if (a()) {
            mp mpVar = new mp(context, 21, f6Var);
            this.f23597r = mpVar;
            this.h = mpVar;
            mpVar.setDrawUnchecked(true);
            mpVar.a(true, false);
            mpVar.setDrawBackgroundAsArc(10);
            this.E = 21;
            float f10 = 21;
            boolean z16 = LocaleController.isRTL;
            addView(mpVar, w7.x5.d(21, f10, (z16 ? 5 : 3) | 48, z16 ? 0 : i11, 16.0f, z16 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, f6Var, z11);
            this.f23596n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.E = 18;
            if (i10 == 5) {
                float f11 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, w7.x5.d(18, f11, (z17 ? 5 : 3) | 16, z17 ? 0 : i11, 0.0f, z17 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, w7.x5.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, w7.x5.d(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f12 = 18;
                boolean z18 = LocaleController.isRTL;
                addView(checkBoxSquare, w7.x5.d(18, f12, (z18 ? 5 : 3) | 48, z18 ? 0 : i11, 16.0f, z18 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            y1 y1Var = new y1(this, context, R.drawable.msg_folders_groups);
            this.v = y1Var;
            addView(y1Var, w7.x5.i(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            y1 y1Var2 = new y1(this, context, 0);
            this.v = y1Var2;
            addView(y1Var2, w7.x5.i(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.f23600x = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
            this.f23599w = x9Var;
            x9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(x9Var, w7.x5.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
