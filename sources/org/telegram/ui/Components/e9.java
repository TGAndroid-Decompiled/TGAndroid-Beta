package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class e9 extends Drawable {
    public static final int[][] C = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public Drawable B;
    public final TextPaint f27951a;
    public boolean f27952b;
    public boolean f27953c;
    public int d;
    public int f27954e;
    public k20 f27955f;
    public boolean f27956g;
    public StaticLayout h;
    public float f27957i;
    public float f27958j;
    public float f27959k;
    public boolean f27960l;
    public boolean f27961m;
    public int f27962n;
    public float f27963o;
    public float f27964p;
    public final StringBuilder f27965q;
    public int f27966r;
    public int f27967s;
    public int f27968t;
    public int f27969u;
    public LinearGradient v;
    public boolean f27970w;
    public boolean f27971x;
    public int f27972y;
    public final org.telegram.ui.ActionBar.c6 f27973z;

    public e9() {
        this((org.telegram.ui.ActionBar.c6) null);
    }

    public static void a(String str, String str2, String str3, StringBuilder sb2) {
        sb2.setLength(0);
        if (str3 != null) {
            sb2.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb2.append(v(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb2.append("\u200c");
            sb2.append(v(str2));
        } else if (str != null && str.length() > 0) {
            for (int length = str.length() - 1; length >= 0; length--) {
                if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                    int length2 = sb2.length();
                    sb2.append("\u200c");
                    sb2.append(v(str.substring(length2)));
                    return;
                }
            }
        }
    }

    public static int d(long j10) {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23280p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.g6.f23280p8.length);
    }

    public static int f(int i10) {
        float[] M0 = org.telegram.ui.ActionBar.g6.M0(5);
        Color.colorToHSV(i10, M0);
        int i11 = (int) M0[0];
        if (i11 >= 345 || i11 < 29) {
            return 0;
        }
        if (i11 < 67) {
            return 1;
        }
        if (i11 < 140) {
            return 3;
        }
        if (i11 < 199) {
            return 4;
        }
        if (i11 < 234) {
            return 5;
        }
        if (i11 < 301) {
            return 2;
        }
        return 6;
    }

    public static String v(String str) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        if (parseEmojis != null && !parseEmojis.isEmpty() && parseEmojis.get(0).start == 0) {
            return str.substring(0, parseEmojis.get(0).end);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        if (this.f27956g) {
            int i10 = this.d;
            int i11 = 0;
            org.telegram.ui.ActionBar.e6 k9 = org.telegram.ui.ActionBar.g6.I.k(false);
            org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
            if (k9 != null) {
                i11 = k9.f22904c;
            }
            return org.telegram.ui.ActionBar.g6.B(f6Var, i11, i10);
        }
        return this.d;
    }

    public final int c() {
        if (this.f27956g) {
            int i10 = this.f27954e;
            int i11 = 0;
            org.telegram.ui.ActionBar.e6 k9 = org.telegram.ui.ActionBar.g6.I.k(false);
            org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
            if (k9 != null) {
                i11 = k9.f22904c;
            }
            return org.telegram.ui.ActionBar.g6.B(f6Var, i11, i10);
        }
        return this.f27954e;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr;
        Drawable drawable;
        k20 k20Var;
        int i10;
        int i11;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        int i12 = org.telegram.ui.ActionBar.g6.J7;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27973z;
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), this.f27972y);
        TextPaint textPaint = this.f27951a;
        textPaint.setColor(k9);
        Paint paint = org.telegram.ui.ActionBar.g6.f23289q0;
        if (this.f27953c && (k20Var = this.f27955f) != null) {
            k20Var.b(bounds.left, bounds.top, i10 + width, i11 + width);
            paint = this.f27955f.f29893c;
        } else if (this.f27952b) {
            int k10 = i0.a.k(b(), this.f27972y);
            int k11 = i0.a.k(c(), this.f27972y);
            if (this.v == null || this.f27967s != bounds.height() || this.f27968t != k10 || this.f27969u != k11) {
                int height = bounds.height();
                this.f27967s = height;
                this.f27968t = k10;
                this.f27969u = k11;
                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, k10, k11, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.v);
            paint.setAlpha(this.f27972y);
        } else {
            paint.setShader(null);
            paint.setColor(i0.a.k(b(), this.f27972y));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.f27970w) {
            if (this.f27971x) {
                canvas.save();
                float f9 = width / 2.0f;
                canvas.rotate(-45.0f, f9, f9);
            }
            if (this.f27966r > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = width;
                rectF.set(0.0f, 0.0f, f10, f10);
                float f11 = this.f27966r;
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                float f12 = width / 2.0f;
                canvas.drawCircle(f12, f12, f12, paint);
            }
            if (this.f27971x) {
                canvas.restore();
            }
        }
        int i13 = this.f27962n;
        if (i13 == 2) {
            if (this.f27963o != 0.0f) {
                int i14 = org.telegram.ui.ActionBar.g6.M7;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), this.f27972y));
                float f13 = width / 2.0f;
                canvas.drawCircle(f13, f13, this.f27963o * f13, paint);
                if (org.telegram.ui.ActionBar.g6.C1) {
                    xi0 xi0Var = org.telegram.ui.ActionBar.g6.f23360u1;
                    xi0Var.W = true;
                    xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i14, true), "Arrow1");
                    org.telegram.ui.ActionBar.g6.f23360u1.O(org.telegram.ui.ActionBar.g6.w0(null, i14, true), "Arrow2");
                    org.telegram.ui.ActionBar.g6.f23360u1.m();
                    org.telegram.ui.ActionBar.g6.C1 = false;
                }
            } else if (!org.telegram.ui.ActionBar.g6.C1) {
                xi0 xi0Var2 = org.telegram.ui.ActionBar.g6.f23360u1;
                xi0Var2.W = true;
                xi0Var2.O(this.d, "Arrow1");
                org.telegram.ui.ActionBar.g6.f23360u1.O(this.d, "Arrow2");
                org.telegram.ui.ActionBar.g6.f23360u1.m();
                org.telegram.ui.ActionBar.g6.C1 = true;
            }
            xi0 xi0Var3 = org.telegram.ui.ActionBar.g6.f23360u1;
            int i15 = xi0Var3.f34732b;
            int i16 = xi0Var3.f34734c;
            int i17 = (width - i15) / 2;
            int i18 = (width - i16) / 2;
            canvas.save();
            org.telegram.ui.ActionBar.g6.f23360u1.setBounds(i17, i18, i15 + i17, i16 + i18);
            org.telegram.ui.ActionBar.g6.f23360u1.draw(canvas);
            canvas.restore();
        } else if (i13 == 0 && this.B == null) {
            if (this.f27961m && (drawable = (drawableArr = org.telegram.ui.ActionBar.g6.f23305r0)[1]) != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawableArr[1].getIntrinsicHeight();
                if (this.f27960l) {
                    float f14 = intrinsicWidth;
                    float f15 = this.f27964p;
                    intrinsicHeight = (int) (intrinsicHeight * f15);
                    intrinsicWidth = (int) (f14 * f15);
                } else if (intrinsicWidth > width - AndroidUtilities.dp(6.0f) || intrinsicHeight > width - AndroidUtilities.dp(6.0f)) {
                    float dp = width / AndroidUtilities.dp(50.0f);
                    intrinsicWidth = (int) (intrinsicWidth * dp);
                    intrinsicHeight = (int) (intrinsicHeight * dp);
                }
                int i19 = (width - intrinsicWidth) / 2;
                int i20 = (width - intrinsicHeight) / 2;
                drawableArr[1].setBounds(i19, i20, intrinsicWidth + i19, intrinsicHeight + i20);
                drawableArr[1].draw(canvas);
            } else {
                if (this.A) {
                    this.A = false;
                    StringBuilder sb2 = this.f27965q;
                    if (sb2.length() > 0) {
                        CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                        StaticLayout staticLayout = this.h;
                        if (staticLayout == null || !TextUtils.equals(replaceEmoji, staticLayout.getText())) {
                            try {
                                StaticLayout staticLayout2 = new StaticLayout(replaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                this.h = staticLayout2;
                                if (staticLayout2.getLineCount() > 0) {
                                    this.f27959k = this.h.getLineLeft(0);
                                    this.f27957i = this.h.getLineWidth(0);
                                    this.f27958j = this.h.getLineBottom(0);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    } else {
                        this.h = null;
                    }
                }
                if (this.h != null) {
                    float f16 = width;
                    float dp2 = f16 / AndroidUtilities.dp(50.0f);
                    float f17 = f16 / 2.0f;
                    canvas.scale(dp2, dp2, f17, f17);
                    canvas.translate(((f16 - this.f27957i) / 2.0f) - this.f27959k, (f16 - this.f27958j) / 2.0f);
                    this.h.draw(canvas);
                }
            }
        } else {
            Drawable drawable2 = this.B;
            if (drawable2 == null) {
                if (i13 == 1) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[0];
                } else if (i13 == 4) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[2];
                } else if (i13 == 5) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[3];
                } else if (i13 == 6) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[4];
                } else if (i13 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[5];
                } else if (i13 == 8) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[6];
                } else if (i13 == 9) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[7];
                } else if (i13 == 10) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[8];
                } else if (i13 == 3) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[10];
                } else if (i13 == 12) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[11];
                } else if (i13 == 14) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[12];
                } else if (i13 == 15) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[13];
                } else if (i13 == 16) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[14];
                } else if (i13 == 19) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[15];
                } else if (i13 == 18) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[16];
                } else if (i13 == 20) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[17];
                } else if (i13 == 21) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[18];
                } else if (i13 == 22) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[19];
                } else if (i13 == 23) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[21];
                } else if (i13 == 24) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[20];
                } else if (i13 == 25) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[22];
                } else if (i13 == 26) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[23];
                } else if (i13 == 27) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[24];
                } else {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23305r0[9];
                }
            }
            if (drawable2 != null) {
                int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * this.f27964p);
                int intrinsicHeight2 = (int) (drawable2.getIntrinsicHeight() * this.f27964p);
                int i21 = (width - intrinsicWidth2) / 2;
                int i22 = (width - intrinsicHeight2) / 2;
                drawable2.setBounds(i21, i22, intrinsicWidth2 + i21, intrinsicHeight2 + i22);
                int i23 = this.f27972y;
                if (i23 != 255) {
                    drawable2.setAlpha(i23);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                } else {
                    drawable2.draw(canvas);
                }
            }
        }
        canvas.restore();
    }

    public final void g(int i10) {
        this.f27962n = i10;
        boolean z10 = false;
        this.f27971x = false;
        this.f27953c = false;
        this.f27952b = false;
        if (i10 == 13) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false);
            this.f27954e = w02;
            this.d = w02;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.f27973z;
            if (i10 == 2) {
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N7, c6Var);
                this.f27954e = v02;
                this.d = v02;
            } else if (i10 != 27 && i10 != 12 && i10 != 1 && i10 != 14) {
                if (i10 == 20) {
                    this.f27971x = true;
                    this.f27952b = true;
                    this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hk, c6Var);
                    this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ik, c6Var);
                } else if (i10 == 3) {
                    this.f27952b = true;
                    this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(5L)], c6Var);
                    this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(5L)], c6Var);
                } else if (i10 == 25) {
                    this.f27952b = true;
                    this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(2L)], c6Var);
                    this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(2L)], c6Var);
                } else if (i10 == 26) {
                    this.f27952b = true;
                    this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(1L)], c6Var);
                    this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(1L)], c6Var);
                } else if (i10 == 4) {
                    this.f27952b = true;
                    this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(5L)], c6Var);
                    this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(5L)], c6Var);
                } else if (i10 == 5) {
                    this.f27952b = true;
                    this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(4L)], c6Var);
                    this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(4L)], c6Var);
                } else if (i10 != 6 && i10 != 23) {
                    if (i10 != 7 && i10 != 24) {
                        if (i10 == 8) {
                            this.f27952b = true;
                            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(0L)], c6Var);
                            this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(0L)], c6Var);
                        } else if (i10 == 9) {
                            this.f27952b = true;
                            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(6L)], c6Var);
                            this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(6L)], c6Var);
                        } else if (i10 == 10) {
                            this.f27952b = true;
                            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(5L)], c6Var);
                            this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(5L)], c6Var);
                        } else if (i10 == 17) {
                            this.f27952b = true;
                            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(5L)], c6Var);
                            this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(5L)], c6Var);
                        } else if (i10 == 21) {
                            this.f27953c = true;
                            if (this.f27955f == null) {
                                this.f27955f = new k20();
                            }
                            this.f27955f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i10 == 22) {
                            this.f27953c = true;
                            if (this.f27955f == null) {
                                this.f27955f = new k20();
                            }
                            this.f27955f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f27952b = true;
                            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(4L)], c6Var);
                            this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(4L)], c6Var);
                        }
                    } else {
                        this.f27952b = true;
                        this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(1L)], c6Var);
                        this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(1L)], c6Var);
                    }
                } else {
                    this.f27952b = true;
                    this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(3L)], c6Var);
                    this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(3L)], c6Var);
                }
            } else {
                this.f27952b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.K7, c6Var);
                this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L7, c6Var);
            }
        }
        int i11 = this.f27962n;
        if (i11 != 2 && i11 != 1 && i11 != 20 && i11 != 21 && i11 != 27 && i11 != 12 && i11 != 14) {
            z10 = true;
        }
        this.f27956g = z10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        this.f27952b = false;
        this.f27953c = false;
        this.f27954e = i10;
        this.d = i10;
        this.f27956g = false;
    }

    public final void i(int i10, int i11) {
        this.f27952b = true;
        this.f27953c = false;
        this.d = i10;
        this.f27954e = i11;
        this.f27956g = false;
    }

    public final void j(int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            m(i10, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            k(i10, (TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(i10, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void k(int i10, TLRPC.Chat chat) {
        Integer num;
        if (chat != null) {
            long j10 = chat.f22392id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(ChatObject.getColorId(chat));
            } else {
                num = null;
            }
            o(j10, str, null, num, ChatObject.getPeerColorForAvatar(i10, chat));
        }
    }

    public final void l(int i10, TLRPC.ChatInvite chatInvite) {
        Integer num;
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            if (chat != null && chat.color != null) {
                num = Integer.valueOf(ChatObject.getColorId(chat));
            } else {
                num = null;
            }
            o(0L, str, null, num, ChatObject.getPeerColorForAvatar(i10, chatInvite.chat));
        }
    }

    public final void m(int i10, TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j10 = user.f22539id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(UserObject.getColorId(user));
            } else {
                num = null;
            }
            o(j10, str, str2, num, UserObject.getPeerColorForAvatar(i10, user));
            this.f27961m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j10, String str, String str2) {
        o(j10, str, str2, null, null);
    }

    public final void o(long j10, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        boolean z10 = true;
        this.A = true;
        this.f27952b = true;
        this.f27953c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.f27954e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.g6.f23280p8[e(j10)];
            org.telegram.ui.ActionBar.c6 c6Var = this.f27973z;
            this.d = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(j10)], c6Var);
        }
        if (j10 != 5) {
            z10 = false;
        }
        this.f27956g = z10;
        this.f27962n = 0;
        this.f27961m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f27965q);
    }

    public final void p(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(UserConfig.selectedAccount, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void q(TLRPC.Chat chat) {
        k(UserConfig.selectedAccount, chat);
    }

    public final void r(TLRPC.User user) {
        m(UserConfig.selectedAccount, user);
    }

    public final void s(int i10) {
        MessagesController.PeerColors peerColors;
        k20 k20Var = this.f27955f;
        if (k20Var != null) {
            this.f27952b = false;
            this.f27953c = true;
        } else {
            this.f27952b = true;
            this.f27953c = false;
        }
        int[][] iArr = C;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27973z;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            if (messagesController != null && (peerColors = messagesController.peerColors) != null && peerColors.getColor(i10) != null) {
                int color1 = messagesController.peerColors.getColor(i10).getColor1();
                if (this.f27955f != null) {
                    int[] iArr2 = iArr[f(color1)];
                    this.f27955f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[f(color1)], c6Var);
                this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[f(color1)], c6Var);
            } else if (this.f27955f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f27955f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j10 = i10;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(j10)], c6Var);
                this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(j10)], c6Var);
            }
        } else if (k20Var != null) {
            int[] iArr4 = iArr[e(i10)];
            this.f27955f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j11 = i10;
            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[e(j11)], c6Var);
            this.f27954e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23296q8[e(j11)], c6Var);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27972y = i10;
    }

    public final void t() {
        this.f27960l = true;
    }

    public final void u(int i10) {
        this.f27951a.setTextSize(i10);
    }

    public e9(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.c6) null);
        this.f27960l = false;
        if (user != null) {
            o(user.f22539id, user.first_name, user.last_name, null, null);
            this.f27961m = UserObject.isDeleted(user);
        }
    }

    public e9(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.c6) null);
        this.f27960l = false;
        q(chat);
    }

    public e9(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f27964p = 1.0f;
        this.f27965q = new StringBuilder(5);
        this.f27966r = -1;
        this.f27970w = true;
        this.f27971x = false;
        this.f27972y = 255;
        this.f27973z = c6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f27951a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
