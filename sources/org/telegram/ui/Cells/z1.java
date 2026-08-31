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
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pr;
public final class z1 extends FrameLayout {
    public final int B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public View F;
    public View G;
    public int f24470a;
    public final org.telegram.ui.ActionBar.g6 f24471b;
    public final x1 f24472c;
    public final w1 d;
    public final View f24473e;
    public final TextView f24474f;
    public final View h;
    public final CheckBoxSquare f24475n;
    public final np f24476r;
    public View f24477s;
    public final y1 v;
    public final org.telegram.ui.Components.p9 f24478w;
    public final org.telegram.ui.Components.z8 f24479x;
    public final int f24480y;

    public z1(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public final boolean a() {
        int i10 = this.f24480y;
        if (i10 != 4 && i10 != 8 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        np npVar = this.f24476r;
        if (npVar != null) {
            return npVar.f29606a.f24809q;
        }
        return this.f24475n.h;
    }

    public final void c(boolean z4, boolean z10) {
        np npVar = this.f24476r;
        if (npVar != null) {
            npVar.a(z4, z10);
        } else {
            this.f24475n.a(z4, z10);
        }
    }

    public final void d(org.telegram.ui.a aVar, org.telegram.messenger.video.g gVar) {
        int i10;
        if (aVar == null) {
            View view = this.F;
            if (view != null) {
                removeView(view);
                this.F = null;
            }
        } else {
            if (this.F == null) {
                View view2 = new View(getContext());
                this.F = view2;
                view2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, this.f24471b), 2, -1));
                addView(this.F, k7.c6.e(-1, -1, 119));
            }
            this.F.setOnClickListener(aVar);
        }
        if (gVar == null) {
            View view3 = this.G;
            if (view3 != null) {
                removeView(view3);
                this.G = null;
                return;
            }
            return;
        }
        if (this.G == null) {
            View view4 = new View(getContext());
            this.G = view4;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(view4, k7.c6.e(56, -1, i10));
        }
        this.G.setOnClickListener(gVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z4, boolean z10, boolean z11) {
        if (this.E) {
            w1 w1Var = this.d;
            w1Var.c(Emoji.replaceEmoji(charSequence, w1Var.getPaint().getFontMetricsInt(), false), z11, true);
        } else {
            this.f24472c.setText(charSequence);
        }
        np npVar = this.f24476r;
        if (npVar != null) {
            npVar.a(z4, z11);
        } else {
            this.f24475n.a(z4, z11);
        }
        this.f24474f.setText(str);
        this.C = z10;
        setWillNotDraw(!z10);
    }

    public final void f() {
        float f10;
        float left;
        View view = this.f24473e;
        if (this.f24477s == null) {
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
        this.f24477s.setTranslationX(left);
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4 = this.E;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24471b;
        int i14 = this.f24480y;
        if (z4) {
            if (i14 != 1 && i14 != 5) {
                i13 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f21766j5;
            }
            this.d.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        } else {
            if (i14 != 1 && i14 != 5) {
                i10 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21766j5;
            }
            int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
            x1 x1Var = this.f24472c;
            x1Var.setTextColor(v02);
            if (i14 != 1 && i14 != 5) {
                i11 = org.telegram.ui.ActionBar.k6.J6;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f21784k5;
            }
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        }
        if (i14 != 1 && i14 != 5) {
            i12 = org.telegram.ui.ActionBar.k6.I6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21820m5;
        }
        this.f24474f.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
    }

    public org.telegram.ui.Components.k6 getAnimatedTextView() {
        return this.d;
    }

    public np getCheckBoxRound() {
        return this.f24476r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.f24472c;
    }

    public TextView getValueTextView() {
        return this.f24474f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint;
        float f11;
        if (this.C) {
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f10) + ((int) Math.abs(this.f24473e.getTranslationX()));
            if (this.f24480y == 7) {
                dp += AndroidUtilities.dp(39.0f);
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.f24471b;
            if (g6Var != null) {
                paint = g6Var.F("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f21779k0;
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
            x1 x1Var = this.f24472c;
            if (x1Var != null) {
                accessibilityNodeInfo.setText(x1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        View view = this.h;
        int i12 = this.B;
        View view2 = this.f24473e;
        TextView textView = this.f24474f;
        int i13 = this.f24480y;
        if (i13 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), Integer.MIN_VALUE));
            float f11 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
            setMeasuredDimension(AndroidUtilities.dp(29.0f) + view2.getMeasuredWidth(), AndroidUtilities.dp(50.0f));
        } else if (this.D) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.C ? 1 : 0));
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (a()) {
                f10 = 60.0f;
            } else {
                f10 = 34.0f;
            }
            int dp = measuredWidth - AndroidUtilities.dp(f10);
            if (this.E) {
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
                measuredWidth2 = org.telegram.ui.b.C(11.0f, y1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(org.telegram.ui.b.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(org.telegram.ui.b.d(8.0f, (dp - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            org.telegram.ui.Components.p9 p9Var = this.f24478w;
            if (p9Var != null) {
                p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
            }
            float f12 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12), 1073741824));
        }
        View view3 = this.F;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.F.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view4 = this.G;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view5 = this.f24477s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        }
    }

    public void setCollapsed(Boolean bool) {
        float f10;
        if (bool == null) {
            View view = this.f24477s;
            if (view != null) {
                removeView(view);
                this.f24477s = null;
                return;
            }
            return;
        }
        if (this.f24477s == null) {
            this.f24477s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.f24471b), PorterDuff.Mode.MULTIPLY));
            this.f24477s.setBackground(mutate);
            addView(this.f24477s, k7.c6.e(16, 16, 16));
        }
        f();
        this.f24477s.animate().cancel();
        ViewPropertyAnimator animate = this.f24477s.animate();
        if (bool.booleanValue()) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(pr.h).start();
    }

    @Override
    public void setEnabled(boolean z4) {
        float f10;
        float f11;
        super.setEnabled(z4);
        float f12 = 0.5f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f24473e.setAlpha(f10);
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        this.f24474f.setAlpha(f11);
        if (z4) {
            f12 = 1.0f;
        }
        this.h.setAlpha(f12);
    }

    public void setIcon(int i10) {
        this.f24476r.setIcon(i10);
    }

    public void setMultiline(boolean z4) {
        if (this.E) {
            return;
        }
        this.D = z4;
        View view = this.f24473e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z10 = this.D;
        x1 x1Var = this.f24472c;
        if (z10) {
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

    public void setNeedDivider(boolean z4) {
        this.C = z4;
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
        float f10 = dp;
        this.f24473e.setTranslationX(f10);
        org.telegram.ui.Components.p9 p9Var = this.f24478w;
        if (p9Var != null) {
            p9Var.setTranslationX(f10);
        }
        View view2 = this.F;
        if (view2 != null) {
            view2.setTranslationX(f10);
        }
        View view3 = this.G;
        if (view3 != null) {
            view3.setTranslationX(f10);
        }
    }

    public void setTextColor(int i10) {
        if (this.E) {
            this.d.setTextColor(i10);
        } else {
            this.f24472c.setTextColor(i10);
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        String formatName;
        org.telegram.ui.Components.z8 z8Var = this.f24479x;
        z8Var.p(tLObject);
        this.f24478w.e(tLObject, z8Var);
        boolean z4 = tLObject instanceof TLRPC.User;
        if (z4) {
            formatName = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            formatName = ContactsController.formatName(tLObject);
        }
        if (z4 && ((TLRPC.User) tLObject).f20990id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            formatName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (this.E) {
            w1 w1Var = this.d;
            w1Var.setText(Emoji.replaceEmoji(formatName, w1Var.getPaint().getFontMetricsInt(), false));
            return;
        }
        this.f24472c.setText(formatName);
    }

    public z1(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(i10, 17, context, g6Var, false);
    }

    public z1(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f24471b = g6Var;
        this.f24480y = i10;
        this.E = z4;
        boolean z10 = true;
        if (z4) {
            w1 w1Var = new w1(this, context, 0);
            this.d = w1Var;
            NotificationCenter.listenEmojiLoading(w1Var);
            w1Var.setEllipsizeByGradient(true);
            w1Var.setRightPadding(AndroidUtilities.dp(8.0f));
            w1Var.getDrawable().o(true, false, false);
            w1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.k6.f21766j5 : org.telegram.ui.ActionBar.k6.G6, g6Var)));
            w1Var.setTextSize(AndroidUtilities.dp(16.0f));
            if (i10 == 7) {
                w1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                w1Var.setGravity(19);
                addView(w1Var, k7.c6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setRightPadding(AndroidUtilities.dp(i11));
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z11 = LocaleController.isRTL;
                    addView(w1Var, k7.c6.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 8 : 29, 0.0f, z11 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i10 == 7 ? i12 + 39 : i12;
                    boolean z12 = LocaleController.isRTL;
                    addView(w1Var, k7.c6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? i11 : (i11 - 17) + i12, 0.0f, z12 ? (i11 - 17) + i12 : i11, 0.0f));
                }
            }
            this.f24473e = w1Var;
        } else {
            x1 x1Var = new x1(this, context, 0);
            this.f24472c = x1Var;
            NotificationCenter.listenEmojiLoading(x1Var);
            x1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.k6.f21766j5 : org.telegram.ui.ActionBar.k6.G6, g6Var)));
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
                addView(x1Var, k7.c6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                x1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                x1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z13 = LocaleController.isRTL;
                    addView(x1Var, k7.c6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 8 : 29, 0.0f, z13 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z14 = LocaleController.isRTL;
                    addView(x1Var, k7.c6.d(i14, -2.0f, (z14 ? 5 : 3) | 16, z14 ? i11 : (i11 - 17) + i13, 0.0f, z14 ? (i11 - 17) + i13 : i11, 0.0f));
                }
            }
            this.f24473e = x1Var;
        }
        TextView textView = new TextView(context);
        this.f24474f = textView;
        textView.setTag(Integer.valueOf((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.k6.f21820m5 : org.telegram.ui.ActionBar.k6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f10 = i11;
        addView(textView, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            np npVar = new np(context, 21, g6Var);
            this.f24476r = npVar;
            this.h = npVar;
            npVar.setDrawUnchecked(true);
            npVar.a(true, false);
            npVar.setDrawBackgroundAsArc(10);
            this.B = 21;
            float f11 = 21;
            boolean z15 = LocaleController.isRTL;
            addView(npVar, k7.c6.d(21, f11, (z15 ? 5 : 3) | 48, z15 ? 0 : i11, 16.0f, z15 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z10 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, g6Var, z10);
            this.f24475n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.B = 18;
            if (i10 == 5) {
                float f12 = 18;
                boolean z16 = LocaleController.isRTL;
                addView(checkBoxSquare, k7.c6.d(18, f12, (z16 ? 5 : 3) | 16, z16 ? 0 : i11, 0.0f, z16 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, k7.c6.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, k7.c6.d(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, k7.c6.d(18, f13, (z17 ? 5 : 3) | 48, z17 ? 0 : i11, 16.0f, z17 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            y1 y1Var = new y1(this, context, R.drawable.msg_folders_groups);
            this.v = y1Var;
            addView(y1Var, k7.c6.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            y1 y1Var2 = new y1(this, context, 0);
            this.v = y1Var2;
            addView(y1Var2, k7.c6.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.f24479x = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            this.f24478w = p9Var;
            p9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(p9Var, k7.c6.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
