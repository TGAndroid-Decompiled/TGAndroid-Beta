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
public class j9 extends Drawable {
    public static final int[][] C = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public Drawable B;
    public final TextPaint f27639a;
    public boolean f27640b;
    public boolean f27641c;
    public int d;
    public int f27642e;
    public f30 f27643f;
    public boolean f27644g;
    public StaticLayout h;
    public float f27645i;
    public float f27646j;
    public float f27647k;
    public boolean f27648l;
    public boolean f27649m;
    public int f27650n;
    public float f27651o;
    public float f27652p;
    public final StringBuilder f27653q;
    public int f27654r;
    public int f27655s;
    public int f27656t;
    public int f27657u;
    public LinearGradient v;
    public boolean f27658w;
    public boolean f27659x;
    public int f27660y;
    public final org.telegram.ui.ActionBar.e6 f27661z;

    public j9() {
        this((org.telegram.ui.ActionBar.e6) null);
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

    public static int d(long j3) {
        return org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21019p8[e(j3)], false);
    }

    public static int e(long j3) {
        return (int) Math.abs(j3 % org.telegram.ui.ActionBar.i6.f21019p8.length);
    }

    public static int f(int i10) {
        float[] N0 = org.telegram.ui.ActionBar.i6.N0(5);
        Color.colorToHSV(i10, N0);
        int i11 = (int) N0[0];
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
        if (this.f27644g) {
            int i10 = this.d;
            int i11 = 0;
            org.telegram.ui.ActionBar.g6 k10 = org.telegram.ui.ActionBar.i6.I.k(false);
            org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
            if (k10 != null) {
                i11 = k10.f20655c;
            }
            return org.telegram.ui.ActionBar.i6.B(h6Var, i11, i10);
        }
        return this.d;
    }

    public final int c() {
        if (this.f27644g) {
            int i10 = this.f27642e;
            int i11 = 0;
            org.telegram.ui.ActionBar.g6 k10 = org.telegram.ui.ActionBar.i6.I.k(false);
            org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
            if (k10 != null) {
                i11 = k10.f20655c;
            }
            return org.telegram.ui.ActionBar.i6.B(h6Var, i11, i10);
        }
        return this.f27642e;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr;
        Drawable drawable;
        f30 f30Var;
        int i10;
        int i11;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        int i12 = org.telegram.ui.ActionBar.i6.J7;
        org.telegram.ui.ActionBar.e6 e6Var = this.f27661z;
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), this.f27660y);
        TextPaint textPaint = this.f27639a;
        textPaint.setColor(k10);
        Paint paint = org.telegram.ui.ActionBar.i6.f21031q0;
        if (this.f27641c && (f30Var = this.f27643f) != null) {
            f30Var.b(bounds.left, bounds.top, i10 + width, i11 + width);
            paint = this.f27643f.f26225c;
        } else if (this.f27640b) {
            int k11 = i0.a.k(b(), this.f27660y);
            int k12 = i0.a.k(c(), this.f27660y);
            if (this.v == null || this.f27655s != bounds.height() || this.f27656t != k11 || this.f27657u != k12) {
                int height = bounds.height();
                this.f27655s = height;
                this.f27656t = k11;
                this.f27657u = k12;
                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, k11, k12, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.v);
            paint.setAlpha(this.f27660y);
        } else {
            paint.setShader(null);
            paint.setColor(i0.a.k(b(), this.f27660y));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.f27658w) {
            if (this.f27659x) {
                canvas.save();
                float f7 = width / 2.0f;
                canvas.rotate(-45.0f, f7, f7);
            }
            if (this.f27654r > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = width;
                rectF.set(0.0f, 0.0f, f10, f10);
                float f11 = this.f27654r;
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                float f12 = width / 2.0f;
                canvas.drawCircle(f12, f12, f12, paint);
            }
            if (this.f27659x) {
                canvas.restore();
            }
        }
        int i13 = this.f27650n;
        if (i13 == 2) {
            if (this.f27651o != 0.0f) {
                int i14 = org.telegram.ui.ActionBar.i6.M7;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), this.f27660y));
                float f13 = width / 2.0f;
                canvas.drawCircle(f13, f13, this.f27651o * f13, paint);
                if (org.telegram.ui.ActionBar.i6.C1) {
                    ck0 ck0Var = org.telegram.ui.ActionBar.i6.f21105u1;
                    ck0Var.Z = true;
                    ck0Var.Q(org.telegram.ui.ActionBar.i6.x0(null, i14, true), "Arrow1");
                    org.telegram.ui.ActionBar.i6.f21105u1.Q(org.telegram.ui.ActionBar.i6.x0(null, i14, true), "Arrow2");
                    org.telegram.ui.ActionBar.i6.f21105u1.o();
                    org.telegram.ui.ActionBar.i6.C1 = false;
                }
            } else if (!org.telegram.ui.ActionBar.i6.C1) {
                ck0 ck0Var2 = org.telegram.ui.ActionBar.i6.f21105u1;
                ck0Var2.Z = true;
                ck0Var2.Q(this.d, "Arrow1");
                org.telegram.ui.ActionBar.i6.f21105u1.Q(this.d, "Arrow2");
                org.telegram.ui.ActionBar.i6.f21105u1.o();
                org.telegram.ui.ActionBar.i6.C1 = true;
            }
            ck0 ck0Var3 = org.telegram.ui.ActionBar.i6.f21105u1;
            int i15 = ck0Var3.f25396b;
            int i16 = ck0Var3.f25398c;
            int i17 = (width - i15) / 2;
            int i18 = (width - i16) / 2;
            canvas.save();
            org.telegram.ui.ActionBar.i6.f21105u1.setBounds(i17, i18, i15 + i17, i16 + i18);
            org.telegram.ui.ActionBar.i6.f21105u1.draw(canvas);
            canvas.restore();
        } else if (i13 == 0 && this.B == null) {
            if (this.f27649m && (drawable = (drawableArr = org.telegram.ui.ActionBar.i6.f21049r0)[1]) != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawableArr[1].getIntrinsicHeight();
                if (this.f27648l) {
                    float f14 = intrinsicWidth;
                    float f15 = this.f27652p;
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
                    StringBuilder sb2 = this.f27653q;
                    if (sb2.length() > 0) {
                        CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                        StaticLayout staticLayout = this.h;
                        if (staticLayout == null || !TextUtils.equals(replaceEmoji, staticLayout.getText())) {
                            try {
                                StaticLayout staticLayout2 = new StaticLayout(replaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                this.h = staticLayout2;
                                if (staticLayout2.getLineCount() > 0) {
                                    this.f27647k = this.h.getLineLeft(0);
                                    this.f27645i = this.h.getLineWidth(0);
                                    this.f27646j = this.h.getLineBottom(0);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
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
                    canvas.translate(((f16 - this.f27645i) / 2.0f) - this.f27647k, (f16 - this.f27646j) / 2.0f);
                    this.h.draw(canvas);
                }
            }
        } else {
            Drawable drawable2 = this.B;
            if (drawable2 == null) {
                if (i13 == 1) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[0];
                } else if (i13 == 4) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[2];
                } else if (i13 == 5) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[3];
                } else if (i13 == 6) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[4];
                } else if (i13 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[5];
                } else if (i13 == 8) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[6];
                } else if (i13 == 9) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[7];
                } else if (i13 == 10) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[8];
                } else if (i13 == 3) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[10];
                } else if (i13 == 12) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[11];
                } else if (i13 == 14) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[12];
                } else if (i13 == 15) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[13];
                } else if (i13 == 16) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[14];
                } else if (i13 == 19) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[15];
                } else if (i13 == 18) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[16];
                } else if (i13 == 20) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[17];
                } else if (i13 == 21) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[18];
                } else if (i13 == 22) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[19];
                } else if (i13 == 23) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[21];
                } else if (i13 == 24) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[20];
                } else if (i13 == 25) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[22];
                } else if (i13 == 26) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[23];
                } else if (i13 == 27) {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[24];
                } else {
                    drawable2 = org.telegram.ui.ActionBar.i6.f21049r0[9];
                }
            }
            if (drawable2 != null) {
                int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * this.f27652p);
                int intrinsicHeight2 = (int) (drawable2.getIntrinsicHeight() * this.f27652p);
                int i21 = (width - intrinsicWidth2) / 2;
                int i22 = (width - intrinsicHeight2) / 2;
                drawable2.setBounds(i21, i22, intrinsicWidth2 + i21, intrinsicHeight2 + i22);
                int i23 = this.f27660y;
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
        this.f27650n = i10;
        boolean z10 = false;
        this.f27659x = false;
        this.f27641c = false;
        this.f27640b = false;
        if (i10 == 13) {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.P9, false);
            this.f27642e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.f27661z;
            if (i10 == 2) {
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.N7, e6Var);
                this.f27642e = w02;
                this.d = w02;
            } else if (i10 != 27 && i10 != 12 && i10 != 1 && i10 != 14) {
                if (i10 == 20) {
                    this.f27659x = true;
                    this.f27640b = true;
                    this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.hk, e6Var);
                    this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ik, e6Var);
                } else if (i10 == 3) {
                    this.f27640b = true;
                    this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(5L)], e6Var);
                    this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(5L)], e6Var);
                } else if (i10 == 25) {
                    this.f27640b = true;
                    this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(2L)], e6Var);
                    this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(2L)], e6Var);
                } else if (i10 == 26) {
                    this.f27640b = true;
                    this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(1L)], e6Var);
                    this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(1L)], e6Var);
                } else if (i10 == 4) {
                    this.f27640b = true;
                    this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(5L)], e6Var);
                    this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(5L)], e6Var);
                } else if (i10 == 5) {
                    this.f27640b = true;
                    this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(4L)], e6Var);
                    this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(4L)], e6Var);
                } else if (i10 != 6 && i10 != 23) {
                    if (i10 != 7 && i10 != 24) {
                        if (i10 == 8) {
                            this.f27640b = true;
                            this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(0L)], e6Var);
                            this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(0L)], e6Var);
                        } else if (i10 == 9) {
                            this.f27640b = true;
                            this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(6L)], e6Var);
                            this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(6L)], e6Var);
                        } else if (i10 == 10) {
                            this.f27640b = true;
                            this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(5L)], e6Var);
                            this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(5L)], e6Var);
                        } else if (i10 == 17) {
                            this.f27640b = true;
                            this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(5L)], e6Var);
                            this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(5L)], e6Var);
                        } else if (i10 == 21) {
                            this.f27641c = true;
                            if (this.f27643f == null) {
                                this.f27643f = new f30();
                            }
                            this.f27643f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i10 == 22) {
                            this.f27641c = true;
                            if (this.f27643f == null) {
                                this.f27643f = new f30();
                            }
                            this.f27643f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f27640b = true;
                            this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(4L)], e6Var);
                            this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(4L)], e6Var);
                        }
                    } else {
                        this.f27640b = true;
                        this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(1L)], e6Var);
                        this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(1L)], e6Var);
                    }
                } else {
                    this.f27640b = true;
                    this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(3L)], e6Var);
                    this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(3L)], e6Var);
                }
            } else {
                this.f27640b = true;
                this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.K7, e6Var);
                this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L7, e6Var);
            }
        }
        int i11 = this.f27650n;
        if (i11 != 2 && i11 != 1 && i11 != 20 && i11 != 21 && i11 != 27 && i11 != 12 && i11 != 14) {
            z10 = true;
        }
        this.f27644g = z10;
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
        this.f27640b = false;
        this.f27641c = false;
        this.f27642e = i10;
        this.d = i10;
        this.f27644g = false;
    }

    public final void i(int i10, int i11) {
        this.f27640b = true;
        this.f27641c = false;
        this.d = i10;
        this.f27642e = i11;
        this.f27644g = false;
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
            long j3 = chat.f20038id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(ChatObject.getColorId(chat));
            } else {
                num = null;
            }
            o(j3, str, null, num, ChatObject.getPeerColorForAvatar(i10, chat));
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
            long j3 = user.f20185id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(UserObject.getColorId(user));
            } else {
                num = null;
            }
            o(j3, str, str2, num, UserObject.getPeerColorForAvatar(i10, user));
            this.f27649m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j3, String str, String str2) {
        o(j3, str, str2, null, null);
    }

    public final void o(long j3, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        boolean z10 = true;
        this.A = true;
        this.f27640b = true;
        this.f27641c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.f27642e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.i6.f21019p8[e(j3)];
            org.telegram.ui.ActionBar.e6 e6Var = this.f27661z;
            this.d = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
            this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(j3)], e6Var);
        }
        if (j3 != 5) {
            z10 = false;
        }
        this.f27644g = z10;
        this.f27650n = 0;
        this.f27649m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f27653q);
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
        f30 f30Var = this.f27643f;
        if (f30Var != null) {
            this.f27640b = false;
            this.f27641c = true;
        } else {
            this.f27640b = true;
            this.f27641c = false;
        }
        int[][] iArr = C;
        org.telegram.ui.ActionBar.e6 e6Var = this.f27661z;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            if (messagesController != null && (peerColors = messagesController.peerColors) != null && peerColors.getColor(i10) != null) {
                int color1 = messagesController.peerColors.getColor(i10).getColor1();
                if (this.f27643f != null) {
                    int[] iArr2 = iArr[f(color1)];
                    this.f27643f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[f(color1)], e6Var);
                this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[f(color1)], e6Var);
            } else if (this.f27643f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f27643f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j3 = i10;
                this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(j3)], e6Var);
                this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(j3)], e6Var);
            }
        } else if (f30Var != null) {
            int[] iArr4 = iArr[e(i10)];
            this.f27643f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j10 = i10;
            this.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21019p8[e(j10)], e6Var);
            this.f27642e = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21038q8[e(j10)], e6Var);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27660y = i10;
    }

    public final void t() {
        this.f27648l = true;
    }

    public final void u(int i10) {
        this.f27639a.setTextSize(i10);
    }

    public j9(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.e6) null);
        this.f27648l = false;
        if (user != null) {
            o(user.f20185id, user.first_name, user.last_name, null, null);
            this.f27649m = UserObject.isDeleted(user);
        }
    }

    public j9(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.e6) null);
        this.f27648l = false;
        q(chat);
    }

    public j9(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f27652p = 1.0f;
        this.f27653q = new StringBuilder(5);
        this.f27654r = -1;
        this.f27658w = true;
        this.f27659x = false;
        this.f27660y = 255;
        this.f27661z = e6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f27639a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
