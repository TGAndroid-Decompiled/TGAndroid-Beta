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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
public final class z1 extends FrameLayout {
    public final int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public View E;
    public View F;
    public int f26009a;
    public final org.telegram.ui.ActionBar.b6 f26010b;
    public final x1 f26011c;
    public final w1 d;
    public final View f26012e;
    public final TextView f26013f;
    public final View h;
    public final CheckBoxSquare f26014n;
    public final dp f26015r;
    public View f26016s;
    public final y1 v;
    public final org.telegram.ui.Components.o9 f26017w;
    public final org.telegram.ui.Components.z8 f26018x;
    public final int f26019y;

    public z1(Context context, int i9) {
        this(i9, 17, context, null, false);
    }

    public final boolean a() {
        int i9 = this.f26019y;
        if (i9 != 4 && i9 != 8 && i9 != 6 && i9 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        dp dpVar = this.f26015r;
        if (dpVar != null) {
            return dpVar.f27781a.f26313q;
        }
        return this.f26014n.h;
    }

    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.f26015r;
        if (dpVar != null) {
            dpVar.a(z10, z11);
        } else {
            this.f26014n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, mh.k3 k3Var) {
        int i9;
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
                view2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, this.f26010b), 2, -1));
                addView(this.E, g7.e6.e(-1, -1, 119));
            }
            this.E.setOnClickListener(aVar);
        }
        if (k3Var == null) {
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
                i9 = 5;
            } else {
                i9 = 3;
            }
            addView(view4, g7.e6.e(56, -1, i9));
        }
        this.F.setOnClickListener(k3Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.D) {
            w1 w1Var = this.d;
            w1Var.c(Emoji.replaceEmoji(charSequence, w1Var.getPaint().getFontMetricsInt(), false), z12, true);
        } else {
            this.f26011c.setText(charSequence);
        }
        dp dpVar = this.f26015r;
        if (dpVar != null) {
            dpVar.a(z10, z12);
        } else {
            this.f26014n.a(z10, z12);
        }
        this.f26013f.setText(str);
        this.B = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f10;
        float left;
        View view = this.f26012e;
        if (this.f26016s == null) {
            return;
        }
        try {
            f10 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f10 = 0.0f;
        }
        if (LocaleController.isRTL) {
            left = (view.getRight() - f10) - AndroidUtilities.dp(20.0f);
        } else {
            left = view.getLeft() + f10 + AndroidUtilities.dp(4.0f);
        }
        this.f26016s.setTranslationX(left);
    }

    public final void g() {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.D;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26010b;
        int i13 = this.f26019y;
        if (z10) {
            if (i13 != 1 && i13 != 5) {
                i12 = org.telegram.ui.ActionBar.f6.G6;
            } else {
                i12 = org.telegram.ui.ActionBar.f6.f23108j5;
            }
            this.d.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        } else {
            if (i13 != 1 && i13 != 5) {
                i9 = org.telegram.ui.ActionBar.f6.G6;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23108j5;
            }
            int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
            x1 x1Var = this.f26011c;
            x1Var.setTextColor(v02);
            if (i13 != 1 && i13 != 5) {
                i10 = org.telegram.ui.ActionBar.f6.J6;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.f23126k5;
            }
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        }
        if (i13 != 1 && i13 != 5) {
            i11 = org.telegram.ui.ActionBar.f6.I6;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.f23161m5;
        }
        this.f26013f.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
    }

    public org.telegram.ui.Components.j6 getAnimatedTextView() {
        return this.d;
    }

    public dp getCheckBoxRound() {
        return this.f26015r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f26011c;
    }

    public TextView getValueTextView() {
        return this.f26013f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint;
        float f11;
        if (this.B) {
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f10) + ((int) Math.abs(this.f26012e.getTranslationX()));
            if (this.f26019y == 7) {
                dp += AndroidUtilities.dp(39.0f);
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.f26010b;
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                f11 = 0.0f;
            } else {
                f11 = dp;
            }
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
        w1 w1Var = this.d;
        if (w1Var != null) {
            accessibilityNodeInfo.setText(w1Var.getText());
        } else {
            x1 x1Var = this.f26011c;
            if (x1Var != null) {
                accessibilityNodeInfo.setText(x1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int size = View.MeasureSpec.getSize(i9);
        View view = this.h;
        int i11 = this.A;
        View view2 = this.f26012e;
        TextView textView = this.f26013f;
        int i12 = this.f26019y;
        if (i12 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), Integer.MIN_VALUE));
            float f11 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
            setMeasuredDimension(AndroidUtilities.dp(29.0f) + view2.getMeasuredWidth(), AndroidUtilities.dp(50.0f));
        } else if (this.C) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f) + (this.B ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 34.0f;
            }
            int dp = measuredWidth - AndroidUtilities.dp(f10);
            if (this.D) {
                dp += (int) this.d.getRightPadding();
            }
            if (i12 == 7) {
                dp -= AndroidUtilities.dp(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                dp -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i13 = dp / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            y1 y1Var = this.v;
            if (y1Var != null) {
                y1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = ll.D(11.0f, y1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(ll.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(ll.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.o9 o9Var = this.f26017w;
            if (o9Var != null) {
                o9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
            }
            float f12 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12), 1073741824));
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
        View view5 = this.f26016s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f10;
        if (bool == null) {
            View view = this.f26016s;
            if (view != null) {
                removeView(view);
                this.f26016s = null;
                return;
            }
            return;
        }
        if (this.f26016s == null) {
            this.f26016s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.f26010b), PorterDuff.Mode.MULTIPLY));
            this.f26016s.setBackground(mutate);
            addView(this.f26016s, g7.e6.e(16, 16, 16));
        }
        f();
        this.f26016s.animate().cancel();
        ViewPropertyAnimator animate = this.f26016s.animate();
        if (bool.booleanValue()) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(gr.h).start();
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f26012e.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        this.f26013f.setAlpha(f11);
        if (z10) {
            f12 = 1.0f;
        }
        this.h.setAlpha(f12);
    }

    public void setIcon(int i9) {
        this.f26015r.setIcon(i9);
    }

    public void setMultiline(boolean z10) {
        if (this.D) {
            return;
        }
        this.C = z10;
        View view = this.f26012e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.C;
        x1 x1Var = this.f26011c;
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
        this.B = z10;
    }

    public void setPad(int i9) {
        int i10;
        int i11 = i9 * 40;
        if (LocaleController.isRTL) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int dp = AndroidUtilities.dp(i11 * i10);
        View view = this.h;
        if (view != null) {
            view.setTranslationX(dp);
        }
        float f10 = dp;
        this.f26012e.setTranslationX(f10);
        org.telegram.ui.Components.o9 o9Var = this.f26017w;
        if (o9Var != null) {
            o9Var.setTranslationX(f10);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setTranslationX(f10);
        }
        View view3 = this.F;
        if (view3 != null) {
            view3.setTranslationX(f10);
        }
    }

    public void setTextColor(int i9) {
        if (this.D) {
            this.d.setTextColor(i9);
        } else {
            this.f26011c.setTextColor(i9);
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String formatName;
        org.telegram.ui.Components.z8 z8Var = this.f26018x;
        z8Var.p(tLObject);
        this.f26017w.e(tLObject, z8Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        if (z10) {
            formatName = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            formatName = ContactsController.formatName(tLObject);
        }
        if (z10 && ((TLRPC.User) tLObject).f22527id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            formatName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (this.D) {
            w1 w1Var = this.d;
            w1Var.setText(Emoji.replaceEmoji(formatName, w1Var.getPaint().getFontMetricsInt(), false));
            return;
        }
        this.f26011c.setText(formatName);
    }

    public z1(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this(i9, 17, context, b6Var, false);
    }

    public z1(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f26010b = b6Var;
        this.f26019y = i9;
        this.D = z10;
        boolean z11 = true;
        if (z10) {
            w1 w1Var = new w1(this, context, 0);
            this.d = w1Var;
            NotificationCenter.listenEmojiLoading(w1Var);
            w1Var.setEllipsizeByGradient(true);
            w1Var.setRightPadding(AndroidUtilities.dp(8.0f));
            w1Var.getDrawable().o(true, false, false);
            w1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.f23108j5 : org.telegram.ui.ActionBar.f6.G6, b6Var)));
            w1Var.setTextSize(AndroidUtilities.dp(16.0f));
            if (i9 == 7) {
                w1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i9 == 3) {
                w1Var.setGravity(19);
                addView(w1Var, g7.e6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setRightPadding(AndroidUtilities.dp(i10));
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i9 == 2) {
                    boolean z12 = LocaleController.isRTL;
                    addView(w1Var, g7.e6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i11 = a() ? 56 : 46;
                    i11 = i9 == 7 ? i11 + 39 : i11;
                    boolean z13 = LocaleController.isRTL;
                    addView(w1Var, g7.e6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i10 : (i10 - 17) + i11, 0.0f, z13 ? (i10 - 17) + i11 : i10, 0.0f));
                }
            }
            this.f26012e = w1Var;
        } else {
            x1 x1Var = new x1(this, context, 0);
            this.f26011c = x1Var;
            NotificationCenter.listenEmojiLoading(x1Var);
            x1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.f23108j5 : org.telegram.ui.ActionBar.f6.G6, b6Var)));
            x1Var.setTextSize(1, 16.0f);
            x1Var.setLines(1);
            x1Var.setMaxLines(1);
            x1Var.setSingleLine(true);
            x1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i9 == 7) {
                x1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i9 == 3) {
                x1Var.setGravity(19);
                addView(x1Var, g7.e6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                x1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                x1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i9 == 2) {
                    boolean z14 = LocaleController.isRTL;
                    addView(x1Var, g7.e6.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i9 == 7 ? i12 + 39 : i12;
                    int i13 = a() ? -2 : -1;
                    boolean z15 = LocaleController.isRTL;
                    addView(x1Var, g7.e6.d(i13, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i10 : (i10 - 17) + i12, 0.0f, z15 ? (i10 - 17) + i12 : i10, 0.0f));
                }
            }
            this.f26012e = x1Var;
        }
        TextView textView = new TextView(context);
        this.f26013f = textView;
        textView.setTag(Integer.valueOf((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.f23161m5 : org.telegram.ui.ActionBar.f6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f10 = i10;
        addView(textView, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            dp dpVar = new dp(context, 21, b6Var);
            this.f26015r = dpVar;
            this.h = dpVar;
            dpVar.setDrawUnchecked(true);
            dpVar.a(true, false);
            dpVar.setDrawBackgroundAsArc(10);
            this.A = 21;
            float f11 = 21;
            boolean z16 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(21, f11, (z16 ? 5 : 3) | 48, z16 ? 0 : i10, 16.0f, z16 ? i10 : 0, 0.0f));
        } else {
            if (i9 != 1 && i9 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, b6Var, z11);
            this.f26014n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.A = 18;
            if (i9 == 5) {
                float f12 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, g7.e6.d(18, f12, (z17 ? 5 : 3) | 16, z17 ? 0 : i10, 0.0f, z17 ? i10 : 0, 0.0f));
            } else if (i9 == 3) {
                addView(checkBoxSquare, g7.e6.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i9 == 2) {
                addView(checkBoxSquare, g7.e6.d(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z18 = LocaleController.isRTL;
                addView(checkBoxSquare, g7.e6.d(18, f13, (z18 ? 5 : 3) | 48, z18 ? 0 : i10, 16.0f, z18 ? i10 : 0, 0.0f));
            }
        }
        if (i9 == 6) {
            y1 y1Var = new y1(this, context, R.drawable.msg_folders_groups);
            this.v = y1Var;
            addView(y1Var, g7.e6.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i9 == 8) {
            y1 y1Var2 = new y1(this, context, 0);
            this.v = y1Var2;
            addView(y1Var2, g7.e6.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i9 == 7) {
            this.f26018x = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            this.f26017w = o9Var;
            o9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(o9Var, g7.e6.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
