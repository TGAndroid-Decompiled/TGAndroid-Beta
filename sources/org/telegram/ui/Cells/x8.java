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
import org.telegram.ui.Components.e90;
public class x8 extends FrameLayout {
    public final ih.s f22552a;
    public final w8 f22553b;
    public final w8 f22554c;
    public final ImageView d;
    public boolean e;
    public boolean f22555f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 f22556n;

    public x8(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this(23, context, f6Var, z4, false);
    }

    public final void b(Drawable drawable, String str) {
        int dp;
        boolean z4;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22553b.getLayoutParams();
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
            z4 = true;
        } else {
            z4 = false;
        }
        imageView.setFocusable(z4);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, this.f22556n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp2 = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i10 = AndroidUtilities.dp(48.0f);
        }
        int i11 = dp2 + i10;
        boolean z10 = LocaleController.isRTL;
        ih.s sVar = this.f22552a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).rightMargin = i11;
        }
        sVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.f22552a.setText(charSequence);
        this.f22553b.setText(charSequence2);
        this.f22554c.setVisibility(8);
        this.e = z4;
        setWillNotDraw(!z4);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f22552a.setText(charSequence);
        this.f22553b.setText(str);
        w8 w8Var = this.f22554c;
        w8Var.setVisibility(0);
        w8Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.f19941gc;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22556n;
        int a2 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        ih.s sVar = this.f22552a;
        sVar.setLinkTextColor(a2);
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        sVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        w8 w8Var = this.f22553b;
        w8Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.j6.f20273z6;
        w8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.f22554c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        w8Var.invalidate();
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22552a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        if (this.e) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f22556n;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20000k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20000k0;
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
        CharSequence text = this.f22552a.getText();
        CharSequence text2 = this.f22553b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb = new StringBuilder();
            if (this.f22555f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb.append((Object) charSequence);
            sb.append(": ");
            if (!this.f22555f) {
                text = text2;
            }
            sb.append((Object) text);
            accessibilityNodeInfo.setText(sb.toString());
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
        boolean z4;
        w8 w8Var = this.f22553b;
        ClickableSpan b10 = w8Var.b(((int) motionEvent.getX()) - w8Var.getLeft(), ((int) motionEvent.getY()) - w8Var.getTop());
        boolean z10 = false;
        if (b10 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            ih.s sVar = this.f22552a;
            if (sVar.a(((int) motionEvent.getX()) - sVar.getLeft(), ((int) motionEvent.getY()) - sVar.getTop()) != null) {
                z10 = true;
            }
            z4 = z10;
        }
        if (z4) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z4) {
        this.f22555f = z4;
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

    public x8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.f22556n = f6Var;
        boolean z11 = z4 || z10;
        this.h = z11;
        ih.s sVar = new ih.s(context, f6Var, true);
        this.f22552a = sVar;
        sVar.setOnLinkLongPressListener(new e90(this) {
            public final x8 f22478b;

            {
                this.f22478b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f22478b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.f22552a);
                            return;
                        }
                        return;
                    case 1:
                        x8 x8Var2 = this.f22478b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.f22553b);
                            return;
                        }
                        return;
                    default:
                        x8 x8Var3 = this.f22478b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.f22553b);
                            return;
                        }
                        return;
                }
            }
        });
        sVar.setTextSize(1, 16.0f);
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z4) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            sVar.setLines(1);
            sVar.setMaxLines(1);
            sVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        sVar.setEllipsize(truncateAt);
        sVar.setImportantForAccessibility(2);
        sVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f10 = i10 - 6;
        addView(sVar, k7.b6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f10, 6.0f, f10, z4 ? 27.0f : 0.0f));
        w8 w8Var = new w8(this, context, f6Var, 0);
        this.f22553b = w8Var;
        w8Var.setOnLinkLongPressListener(new e90(this) {
            public final x8 f22478b;

            {
                this.f22478b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f22478b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.f22552a);
                            return;
                        }
                        return;
                    case 1:
                        x8 x8Var2 = this.f22478b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.f22553b);
                            return;
                        }
                        return;
                    default:
                        x8 x8Var3 = this.f22478b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.f22553b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            w8Var.setLines(1);
            w8Var.setSingleLine(true);
        }
        w8Var.setTextSize(1, 13.0f);
        w8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w8Var.setImportantForAccessibility(2);
        w8Var.setEllipsize(truncateAt);
        w8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z4) {
            float f11 = i10;
            addView(w8Var, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i10;
            addView(w8Var, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        w8 w8Var2 = new w8(this, context, f6Var, 1);
        this.f22554c = w8Var2;
        w8Var2.setOnLinkLongPressListener(new e90(this) {
            public final x8 f22478b;

            {
                this.f22478b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        x8 x8Var = this.f22478b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.f22552a);
                            return;
                        }
                        return;
                    case 1:
                        x8 x8Var2 = this.f22478b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.f22553b);
                            return;
                        }
                        return;
                    default:
                        x8 x8Var3 = this.f22478b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.f22553b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z11;
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            w8Var2.setLines(1);
            w8Var2.setSingleLine(true);
        }
        w8Var2.setTextSize(1, 13.0f);
        w8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        w8Var2.setImportantForAccessibility(2);
        w8Var2.setEllipsize(truncateAt);
        w8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z4) {
            float f13 = i10;
            addView(w8Var2, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i10;
            addView(w8Var2, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
