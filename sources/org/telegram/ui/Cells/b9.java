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
import org.telegram.ui.Components.w90;
public class b9 extends FrameLayout {
    public final wh.n f22062a;
    public final a9 f22063b;
    public final a9 f22064c;
    public final ImageView d;
    public boolean e;
    public boolean f22065f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.d6 f22066n;

    public b9(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this(23, context, d6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int dp;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22063b.getLayoutParams();
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
            imageView.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, this.f22066n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp2 = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i10 = AndroidUtilities.dp(48.0f);
        }
        int i11 = dp2 + i10;
        boolean z11 = LocaleController.isRTL;
        wh.n nVar = this.f22062a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) nVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) nVar.getLayoutParams()).rightMargin = i11;
        }
        nVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f22062a.setText(charSequence);
        this.f22063b.setText(charSequence2);
        this.f22064c.setVisibility(8);
        this.e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f22062a.setText(charSequence);
        this.f22063b.setText(str);
        a9 a9Var = this.f22064c;
        a9Var.setVisibility(0);
        a9Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.f21052gc;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22066n;
        int a2 = a(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        wh.n nVar = this.f22062a;
        nVar.setLinkTextColor(a2);
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        nVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        a9 a9Var = this.f22063b;
        a9Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.h6.f21398z6;
        a9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.f22064c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        a9Var.invalidate();
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22062a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        if (this.e) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f22066n;
            if (d6Var != null) {
                paint = d6Var.n("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.h6.f21114k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f21114k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f22062a.getText();
        CharSequence text2 = this.f22063b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f22065f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f22065f) {
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
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        a9 a9Var = this.f22063b;
        ClickableSpan b10 = a9Var.b(((int) motionEvent.getX()) - a9Var.getLeft(), ((int) motionEvent.getY()) - a9Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            wh.n nVar = this.f22062a;
            if (nVar.a(((int) motionEvent.getX()) - nVar.getLeft(), ((int) motionEvent.getY()) - nVar.getTop()) != null) {
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
        this.f22065f = z10;
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

    public b9(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        this.f22066n = d6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        wh.n nVar = new wh.n(context, d6Var, true);
        this.f22062a = nVar;
        nVar.setOnLinkLongPressListener(new w90(this) {
            public final b9 f23883b;

            {
                this.f23883b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        b9 b9Var = this.f23883b;
                        b9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                b9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(b9Var.f22062a);
                            return;
                        }
                        return;
                    case 1:
                        b9 b9Var2 = this.f23883b;
                        if (clickableSpan != null) {
                            try {
                                b9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(b9Var2.f22063b);
                            return;
                        }
                        return;
                    default:
                        b9 b9Var3 = this.f23883b;
                        if (clickableSpan != null) {
                            try {
                                b9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(b9Var3.f22063b);
                            return;
                        }
                        return;
                }
            }
        });
        nVar.setTextSize(1, 16.0f);
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            nVar.setLines(1);
            nVar.setMaxLines(1);
            nVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        nVar.setEllipsize(truncateAt);
        nVar.setImportantForAccessibility(2);
        nVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f7 = i10 - 6;
        addView(nVar, w7.z5.a(-2.0f, f7, 6.0f, f7, z10 ? 27.0f : 0.0f, -2, LocaleController.isRTL ? 5 : 3));
        a9 a9Var = new a9(this, context, d6Var, 0);
        this.f22063b = a9Var;
        a9Var.setOnLinkLongPressListener(new w90(this) {
            public final b9 f23883b;

            {
                this.f23883b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        b9 b9Var = this.f23883b;
                        b9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                b9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(b9Var.f22062a);
                            return;
                        }
                        return;
                    case 1:
                        b9 b9Var2 = this.f23883b;
                        if (clickableSpan != null) {
                            try {
                                b9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(b9Var2.f22063b);
                            return;
                        }
                        return;
                    default:
                        b9 b9Var3 = this.f23883b;
                        if (clickableSpan != null) {
                            try {
                                b9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(b9Var3.f22063b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            a9Var.setLines(1);
            a9Var.setSingleLine(true);
        }
        a9Var.setTextSize(1, 13.0f);
        a9Var.setGravity(LocaleController.isRTL ? 5 : 3);
        a9Var.setImportantForAccessibility(2);
        a9Var.setEllipsize(truncateAt);
        a9Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(a9Var, w7.z5.a(-2.0f, f10, 32.0f, f10, 4.0f, -1, (LocaleController.isRTL ? 5 : 3) | 80));
        } else {
            float f11 = i10;
            addView(a9Var, w7.z5.a(-2.0f, f11, 32.0f, f11, 4.0f, -1, LocaleController.isRTL ? 5 : 3));
        }
        a9 a9Var2 = new a9(this, context, d6Var, 1);
        this.f22064c = a9Var2;
        a9Var2.setOnLinkLongPressListener(new w90(this) {
            public final b9 f23883b;

            {
                this.f23883b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        b9 b9Var = this.f23883b;
                        b9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                b9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(b9Var.f22062a);
                            return;
                        }
                        return;
                    case 1:
                        b9 b9Var2 = this.f23883b;
                        if (clickableSpan != null) {
                            try {
                                b9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(b9Var2.f22063b);
                            return;
                        }
                        return;
                    default:
                        b9 b9Var3 = this.f23883b;
                        if (clickableSpan != null) {
                            try {
                                b9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(b9Var3.f22063b);
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
            a9Var2.setLines(1);
            a9Var2.setSingleLine(true);
        }
        a9Var2.setTextSize(1, 13.0f);
        a9Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        a9Var2.setImportantForAccessibility(2);
        a9Var2.setEllipsize(truncateAt);
        a9Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(a9Var2, w7.z5.a(-2.0f, f12, 32.0f, f12, 4.0f, -1, (LocaleController.isRTL ? 5 : 3) | 80));
        } else {
            float f13 = i10;
            addView(a9Var2, w7.z5.a(-2.0f, f13, 32.0f, f13, 4.0f, -1, LocaleController.isRTL ? 5 : 3));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
