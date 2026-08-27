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
import org.telegram.ui.Components.o80;

public class v8 extends FrameLayout {

    public final eh.s f25814a;

    public final u8 f25815b;

    public final u8 f25816c;
    public final ImageView d;

    public boolean f25817e;

    public boolean f25818f;
    public final boolean h;

    public final org.telegram.ui.ActionBar.c6 f25819n;

    public v8(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this(23, context, c6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.f25815b.getLayoutParams()).rightMargin = (LocaleController.isRTL || drawable == null) ? AndroidUtilities.dp(23.0f) : AndroidUtilities.dp(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, this.f25819n)));
            imageView.setImportantForAccessibility(1);
        }
        int iDp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        boolean z10 = LocaleController.isRTL;
        eh.s sVar = this.f25814a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).leftMargin = iDp;
        } else {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).rightMargin = iDp;
        }
        sVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f25814a.setText(charSequence);
        this.f25815b.setText(charSequence2);
        this.f25816c.setVisibility(8);
        this.f25817e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f25814a.setText(charSequence);
        this.f25815b.setText(str);
        u8 u8Var = this.f25816c;
        u8Var.setVisibility(0);
        u8Var.setText(str2);
        this.f25817e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25819n;
        int iA = a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        eh.s sVar = this.f25814a;
        sVar.setLinkTextColor(iA);
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        sVar.invalidate();
        int iA2 = a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        u8 u8Var = this.f25815b;
        u8Var.setLinkTextColor(iA2);
        int i11 = org.telegram.ui.ActionBar.g6.f23441z6;
        u8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f25816c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        u8Var.invalidate();
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f25814a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f25817e) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f25819n;
            Paint paintN = c6Var != null ? c6Var.N("paintDivider") : org.telegram.ui.ActionBar.g6.f23175k0;
            if (paintN == null) {
                paintN = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, paintN);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f25814a.getText();
        CharSequence text2 = this.f25815b.getText();
        if (TextUtils.isEmpty(text) || TextUtils.isEmpty(text2)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) (this.f25818f ? text2 : text));
        sb2.append(": ");
        if (!this.f25818f) {
            text = text2;
        }
        sb2.append((Object) text);
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.h) {
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.f25817e ? 1 : 0), 1073741824);
        }
        super.onMeasure(iMakeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x8 = (int) motionEvent.getX();
        u8 u8Var = this.f25815b;
        boolean z10 = u8Var.b(x8 - u8Var.getLeft(), ((int) motionEvent.getY()) - u8Var.getTop()) != null;
        if (!z10) {
            int x10 = (int) motionEvent.getX();
            eh.s sVar = this.f25814a;
            z10 = sVar.a(x10 - sVar.getLeft(), ((int) motionEvent.getY()) - sVar.getTop()) != null;
        }
        if (z10) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z10) {
        this.f25818f = z10;
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

    public v8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f25819n = c6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        eh.s sVar = new eh.s(context, c6Var, true);
        this.f25814a = sVar;
        final int i11 = 0;
        sVar.setOnLinkLongPressListener(new o80(this) {

            public final v8 f25684b;

            {
                this.f25684b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        v8 v8Var = this.f25684b;
                        v8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                v8Var.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(v8Var.f25814a);
                        }
                        break;
                    case 1:
                        v8 v8Var2 = this.f25684b;
                        if (clickableSpan != null) {
                            try {
                                v8Var2.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(v8Var2.f25815b);
                        }
                        break;
                    default:
                        v8 v8Var3 = this.f25684b;
                        if (clickableSpan != null) {
                            try {
                                v8Var3.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(v8Var3.f25815b);
                        }
                        break;
                }
            }
        });
        sVar.setTextSize(1, 16.0f);
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
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
        addView(sVar, h7.z5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f10, 6.0f, f10, z10 ? 27.0f : 0.0f));
        u8 u8Var = new u8(this, context, c6Var, 0);
        this.f25815b = u8Var;
        final int i12 = 1;
        u8Var.setOnLinkLongPressListener(new o80(this) {

            public final v8 f25684b;

            {
                this.f25684b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        v8 v8Var = this.f25684b;
                        v8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                v8Var.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(v8Var.f25814a);
                        }
                        break;
                    case 1:
                        v8 v8Var2 = this.f25684b;
                        if (clickableSpan != null) {
                            try {
                                v8Var2.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(v8Var2.f25815b);
                        }
                        break;
                    default:
                        v8 v8Var3 = this.f25684b;
                        if (clickableSpan != null) {
                            try {
                                v8Var3.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(v8Var3.f25815b);
                        }
                        break;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            u8Var.setLines(1);
            u8Var.setSingleLine(true);
        }
        u8Var.setTextSize(1, 13.0f);
        u8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        u8Var.setImportantForAccessibility(2);
        u8Var.setEllipsize(truncateAt);
        u8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f11 = i10;
            addView(u8Var, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i10;
            addView(u8Var, h7.z5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        u8 u8Var2 = new u8(this, context, c6Var, 1);
        this.f25816c = u8Var2;
        final int i13 = 2;
        u8Var2.setOnLinkLongPressListener(new o80(this) {

            public final v8 f25684b;

            {
                this.f25684b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
                    case 0:
                        v8 v8Var = this.f25684b;
                        v8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                v8Var.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(v8Var.f25814a);
                        }
                        break;
                    case 1:
                        v8 v8Var2 = this.f25684b;
                        if (clickableSpan != null) {
                            try {
                                v8Var2.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(v8Var2.f25815b);
                        }
                        break;
                    default:
                        v8 v8Var3 = this.f25684b;
                        if (clickableSpan != null) {
                            try {
                                v8Var3.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(v8Var3.f25815b);
                        }
                        break;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            u8Var2.setLines(1);
            u8Var2.setSingleLine(true);
        }
        u8Var2.setTextSize(1, 13.0f);
        u8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        u8Var2.setImportantForAccessibility(2);
        u8Var2.setEllipsize(truncateAt);
        u8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f13 = i10;
            addView(u8Var2, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i10;
            addView(u8Var2, h7.z5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, h7.z5.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
