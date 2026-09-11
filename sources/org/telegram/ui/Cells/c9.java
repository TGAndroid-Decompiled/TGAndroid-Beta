package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.c90;
public class c9 extends FrameLayout {
    public final wh.p f21704a;
    public final b9 f21705b;
    public final b9 f21706c;
    public final ImageView d;
    public boolean f21707e;
    public boolean f21708f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 f21709n;

    public c9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(23, context, f6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int dp;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21705b.getLayoutParams();
        if (!LocaleController.isRTL && drawable != null) {
            dp = AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(23.0f);
        }
        marginLayoutParams.rightMargin = dp;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i10 = 0;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setFocusable(z10);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, this.f21709n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp2 = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i10 = AndroidUtilities.dp(48.0f);
        }
        int i11 = dp2 + i10;
        boolean z11 = LocaleController.isRTL;
        wh.p pVar = this.f21704a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).rightMargin = i11;
        }
        pVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f21704a.setText(charSequence);
        this.f21705b.setText(charSequence2);
        this.f21706c.setVisibility(8);
        this.f21707e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f21704a.setText(charSequence);
        this.f21705b.setText(str);
        b9 b9Var = this.f21706c;
        b9Var.setVisibility(0);
        b9Var.setText(str2);
        this.f21707e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21709n;
        int a2 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        wh.p pVar = this.f21704a;
        pVar.setLinkTextColor(a2);
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        pVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        b9 b9Var = this.f21705b;
        b9Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.j6.f21061z6;
        b9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.f21706c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        b9Var.invalidate();
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f21704a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        if (this.f21707e) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f21709n;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
            }
            Paint paint2 = paint;
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f21704a.getText();
        CharSequence text2 = this.f21705b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f21708f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f21708f) {
                text = text2;
            }
            sb2.append((Object) text);
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.h) {
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.f21707e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        b9 b9Var = this.f21705b;
        ClickableSpan b10 = b9Var.b(((int) motionEvent.getX()) - b9Var.getLeft(), ((int) motionEvent.getY()) - b9Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            wh.p pVar = this.f21704a;
            if (pVar.a(((int) motionEvent.getX()) - pVar.getLeft(), ((int) motionEvent.getY()) - pVar.getTop()) != null) {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z10) {
        this.f21708f = z10;
    }

    public void setImage(Drawable drawable) {
        b(drawable, null);
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.d;
        imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            imageView.setClickable(false);
        }
    }

    public c9(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.f21709n = f6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        wh.p pVar = new wh.p(context, f6Var, true);
        this.f21704a = pVar;
        pVar.setOnLinkLongPressListener(new c90(this) {
            public final c9 f21619b;

            {
                this.f21619b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        c9 c9Var = this.f21619b;
                        c9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                c9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(c9Var.f21704a);
                            return;
                        }
                        return;
                    case 1:
                        c9 c9Var2 = this.f21619b;
                        if (clickableSpan != null) {
                            try {
                                c9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(c9Var2.f21705b);
                            return;
                        }
                        return;
                    default:
                        c9 c9Var3 = this.f21619b;
                        if (clickableSpan != null) {
                            try {
                                c9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(c9Var3.f21705b);
                            return;
                        }
                        return;
                }
            }
        });
        pVar.setTextSize(1, 16.0f);
        pVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            pVar.setLines(1);
            pVar.setMaxLines(1);
            pVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pVar.setEllipsize(truncateAt);
        pVar.setImportantForAccessibility(2);
        pVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f7 = i10 - 6;
        addView(pVar, w7.x5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        b9 b9Var = new b9(this, context, f6Var, 0);
        this.f21705b = b9Var;
        b9Var.setOnLinkLongPressListener(new c90(this) {
            public final c9 f21619b;

            {
                this.f21619b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        c9 c9Var = this.f21619b;
                        c9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                c9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(c9Var.f21704a);
                            return;
                        }
                        return;
                    case 1:
                        c9 c9Var2 = this.f21619b;
                        if (clickableSpan != null) {
                            try {
                                c9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(c9Var2.f21705b);
                            return;
                        }
                        return;
                    default:
                        c9 c9Var3 = this.f21619b;
                        if (clickableSpan != null) {
                            try {
                                c9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(c9Var3.f21705b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            b9Var.setLines(1);
            b9Var.setSingleLine(true);
        }
        b9Var.setTextSize(1, 13.0f);
        b9Var.setGravity(LocaleController.isRTL ? 5 : 3);
        b9Var.setImportantForAccessibility(2);
        b9Var.setEllipsize(truncateAt);
        b9Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(b9Var, w7.x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(b9Var, w7.x5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        b9 b9Var2 = new b9(this, context, f6Var, 1);
        this.f21706c = b9Var2;
        b9Var2.setOnLinkLongPressListener(new c90(this) {
            public final c9 f21619b;

            {
                this.f21619b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        c9 c9Var = this.f21619b;
                        c9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                c9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(c9Var.f21704a);
                            return;
                        }
                        return;
                    case 1:
                        c9 c9Var2 = this.f21619b;
                        if (clickableSpan != null) {
                            try {
                                c9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(c9Var2.f21705b);
                            return;
                        }
                        return;
                    default:
                        c9 c9Var3 = this.f21619b;
                        if (clickableSpan != null) {
                            try {
                                c9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(c9Var3.f21705b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            b9Var2.setLines(1);
            b9Var2.setSingleLine(true);
        }
        b9Var2.setTextSize(1, 13.0f);
        b9Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        b9Var2.setImportantForAccessibility(2);
        b9Var2.setEllipsize(truncateAt);
        b9Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(b9Var2, w7.x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(b9Var2, w7.x5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
