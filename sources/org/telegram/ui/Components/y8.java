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

public class y8 extends Drawable {
    public static final int[][] C = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public Drawable B;

    public final TextPaint f34845a;

    public boolean f34846b;

    public boolean f34847c;
    public int d;

    public int f34848e;

    public c20 f34849f;

    public boolean f34850g;
    public StaticLayout h;

    public float f34851i;

    public float f34852j;

    public float f34853k;

    public boolean f34854l;

    public boolean f34855m;

    public int f34856n;

    public float f34857o;

    public float f34858p;

    public final StringBuilder f34859q;

    public int f34860r;

    public int f34861s;

    public int f34862t;

    public int f34863u;
    public LinearGradient v;

    public boolean f34864w;

    public boolean f34865x;

    public int f34866y;

    public final org.telegram.ui.ActionBar.c6 f34867z;

    public y8() {
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
            int iLastIndexOf = str2.lastIndexOf(32);
            if (iLastIndexOf >= 0) {
                str2 = str2.substring(iLastIndexOf + 1);
            }
            sb2.append("\u200c");
            sb2.append(v(str2));
            return;
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                int length2 = sb2.length();
                sb2.append("\u200c");
                sb2.append(v(str.substring(length2)));
                return;
            }
        }
    }

    public static int d(long j10) {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23270p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % ((long) org.telegram.ui.ActionBar.g6.f23270p8.length));
    }

    public static int f(int i10) {
        float[] fArrM0 = org.telegram.ui.ActionBar.g6.M0(5);
        Color.colorToHSV(i10, fArrM0);
        int i11 = (int) fArrM0[0];
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
        return i11 < 301 ? 2 : 6;
    }

    public static String v(String str) {
        ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str);
        return (emojis == null || emojis.isEmpty() || emojis.get(0).start != 0) ? str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1))) : str.substring(0, emojis.get(0).end);
    }

    public final int b() {
        if (!this.f34850g) {
            return this.d;
        }
        int i10 = this.d;
        org.telegram.ui.ActionBar.e6 e6VarK = org.telegram.ui.ActionBar.g6.I.k(false);
        return org.telegram.ui.ActionBar.g6.B(org.telegram.ui.ActionBar.g6.I, e6VarK != null ? e6VarK.f22885c : 0, i10);
    }

    public final int c() {
        if (!this.f34850g) {
            return this.f34848e;
        }
        int i10 = this.f34848e;
        org.telegram.ui.ActionBar.e6 e6VarK = org.telegram.ui.ActionBar.g6.I.k(false);
        return org.telegram.ui.ActionBar.g6.B(org.telegram.ui.ActionBar.g6.I, e6VarK != null ? e6VarK.f22885c : 0, i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr;
        Drawable drawable;
        c20 c20Var;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int iWidth = bounds.width();
        int i10 = org.telegram.ui.ActionBar.g6.J7;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34867z;
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.f34866y);
        TextPaint textPaint = this.f34845a;
        textPaint.setColor(iK);
        Paint paint = org.telegram.ui.ActionBar.g6.f23278q0;
        if (this.f34847c && (c20Var = this.f34849f) != null) {
            int i11 = bounds.left;
            int i12 = bounds.top;
            c20Var.b(i11, i12, i11 + iWidth, i12 + iWidth);
            paint = this.f34849f.f27292c;
        } else if (this.f34846b) {
            int iK2 = i0.b.k(b(), this.f34866y);
            int iK3 = i0.b.k(c(), this.f34866y);
            if (this.v == null || this.f34861s != bounds.height() || this.f34862t != iK2 || this.f34863u != iK3) {
                int iHeight = bounds.height();
                this.f34861s = iHeight;
                this.f34862t = iK2;
                this.f34863u = iK3;
                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, iHeight, iK2, iK3, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.v);
            paint.setAlpha(this.f34866y);
        } else {
            paint.setShader(null);
            paint.setColor(i0.b.k(b(), this.f34866y));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.f34864w) {
            if (this.f34865x) {
                canvas.save();
                float f10 = iWidth / 2.0f;
                canvas.rotate(-45.0f, f10, f10);
            }
            if (this.f34860r > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = iWidth;
                rectF.set(0.0f, 0.0f, f11, f11);
                float f12 = this.f34860r;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                float f13 = iWidth / 2.0f;
                canvas.drawCircle(f13, f13, f13, paint);
            }
            if (this.f34865x) {
                canvas.restore();
            }
        }
        int i13 = this.f34856n;
        if (i13 == 2) {
            if (this.f34857o != 0.0f) {
                int i14 = org.telegram.ui.ActionBar.g6.M7;
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), this.f34866y));
                float f14 = iWidth / 2.0f;
                canvas.drawCircle(f14, f14, this.f34857o * f14, paint);
                if (org.telegram.ui.ActionBar.g6.C1) {
                    oi0 oi0Var = org.telegram.ui.ActionBar.g6.f23352u1;
                    oi0Var.W = true;
                    oi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i14, true), "Arrow1");
                    org.telegram.ui.ActionBar.g6.f23352u1.O(org.telegram.ui.ActionBar.g6.w0(null, i14, true), "Arrow2");
                    org.telegram.ui.ActionBar.g6.f23352u1.m();
                    org.telegram.ui.ActionBar.g6.C1 = false;
                }
            } else if (!org.telegram.ui.ActionBar.g6.C1) {
                oi0 oi0Var2 = org.telegram.ui.ActionBar.g6.f23352u1;
                oi0Var2.W = true;
                oi0Var2.O(this.d, "Arrow1");
                org.telegram.ui.ActionBar.g6.f23352u1.O(this.d, "Arrow2");
                org.telegram.ui.ActionBar.g6.f23352u1.m();
                org.telegram.ui.ActionBar.g6.C1 = true;
            }
            oi0 oi0Var3 = org.telegram.ui.ActionBar.g6.f23352u1;
            int i15 = oi0Var3.f31307b;
            int i16 = oi0Var3.f31309c;
            int i17 = (iWidth - i15) / 2;
            int i18 = (iWidth - i16) / 2;
            canvas.save();
            org.telegram.ui.ActionBar.g6.f23352u1.setBounds(i17, i18, i15 + i17, i16 + i18);
            org.telegram.ui.ActionBar.g6.f23352u1.draw(canvas);
            canvas.restore();
        } else if (i13 != 0 || this.B != null) {
            Drawable drawable2 = this.B;
            if (drawable2 == null) {
                if (i13 == 1) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[0];
                } else if (i13 == 4) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[2];
                } else if (i13 == 5) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[3];
                } else if (i13 == 6) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[4];
                } else if (i13 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[5];
                } else if (i13 == 8) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[6];
                } else if (i13 == 9) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[7];
                } else if (i13 == 10) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[8];
                } else if (i13 == 3) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[10];
                } else if (i13 == 12) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[11];
                } else if (i13 == 14) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[12];
                } else if (i13 == 15) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[13];
                } else if (i13 == 16) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[14];
                } else if (i13 == 19) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[15];
                } else if (i13 == 18) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[16];
                } else if (i13 == 20) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[17];
                } else if (i13 == 21) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[18];
                } else if (i13 == 22) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[19];
                } else if (i13 == 23) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[21];
                } else if (i13 == 24) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[20];
                } else if (i13 == 25) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[22];
                } else if (i13 == 26) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23295r0[23];
                } else {
                    drawable2 = i13 == 27 ? org.telegram.ui.ActionBar.g6.f23295r0[24] : org.telegram.ui.ActionBar.g6.f23295r0[9];
                }
            }
            if (drawable2 != null) {
                int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.f34858p);
                int intrinsicHeight = (int) (drawable2.getIntrinsicHeight() * this.f34858p);
                int i19 = (iWidth - intrinsicWidth) / 2;
                int i20 = (iWidth - intrinsicHeight) / 2;
                drawable2.setBounds(i19, i20, intrinsicWidth + i19, intrinsicHeight + i20);
                int i21 = this.f34866y;
                if (i21 != 255) {
                    drawable2.setAlpha(i21);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                } else {
                    drawable2.draw(canvas);
                }
            }
        } else if (!this.f34855m || (drawable = (drawableArr = org.telegram.ui.ActionBar.g6.f23295r0)[1]) == null) {
            if (this.A) {
                this.A = false;
                StringBuilder sb2 = this.f34859q;
                if (sb2.length() > 0) {
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(sb2.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                    StaticLayout staticLayout = this.h;
                    if (staticLayout == null || !TextUtils.equals(charSequenceReplaceEmoji, staticLayout.getText())) {
                        try {
                            StaticLayout staticLayout2 = new StaticLayout(charSequenceReplaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.h = staticLayout2;
                            if (staticLayout2.getLineCount() > 0) {
                                this.f34853k = this.h.getLineLeft(0);
                                this.f34851i = this.h.getLineWidth(0);
                                this.f34852j = this.h.getLineBottom(0);
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                } else {
                    this.h = null;
                }
            }
            if (this.h != null) {
                float f15 = iWidth;
                float fDp = f15 / AndroidUtilities.dp(50.0f);
                float f16 = f15 / 2.0f;
                canvas.scale(fDp, fDp, f16, f16);
                canvas.translate(((f15 - this.f34851i) / 2.0f) - this.f34853k, (f15 - this.f34852j) / 2.0f);
                this.h.draw(canvas);
            }
        } else {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight();
            if (this.f34854l) {
                float f17 = intrinsicWidth2;
                float f18 = this.f34858p;
                intrinsicHeight2 = (int) (intrinsicHeight2 * f18);
                intrinsicWidth2 = (int) (f17 * f18);
            } else if (intrinsicWidth2 > iWidth - AndroidUtilities.dp(6.0f) || intrinsicHeight2 > iWidth - AndroidUtilities.dp(6.0f)) {
                float fDp2 = iWidth / AndroidUtilities.dp(50.0f);
                intrinsicWidth2 = (int) (intrinsicWidth2 * fDp2);
                intrinsicHeight2 = (int) (intrinsicHeight2 * fDp2);
            }
            int i22 = (iWidth - intrinsicWidth2) / 2;
            int i23 = (iWidth - intrinsicHeight2) / 2;
            drawableArr[1].setBounds(i22, i23, intrinsicWidth2 + i22, intrinsicHeight2 + i23);
            drawableArr[1].draw(canvas);
        }
        canvas.restore();
    }

    public final void g(int i10) {
        this.f34856n = i10;
        boolean z10 = false;
        this.f34865x = false;
        this.f34847c = false;
        this.f34846b = false;
        if (i10 == 13) {
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false);
            this.f34848e = iW0;
            this.d = iW0;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.f34867z;
            if (i10 == 2) {
                int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N7, c6Var);
                this.f34848e = iV0;
                this.d = iV0;
            } else if (i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.K7, c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L7, c6Var);
            } else if (i10 == 20) {
                this.f34865x = true;
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hk, c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ik, c6Var);
            } else if (i10 == 3) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(5L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(5L)], c6Var);
            } else if (i10 == 25) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(2L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(2L)], c6Var);
            } else if (i10 == 26) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(1L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(1L)], c6Var);
            } else if (i10 == 4) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(5L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(5L)], c6Var);
            } else if (i10 == 5) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(4L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(4L)], c6Var);
            } else if (i10 == 6 || i10 == 23) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(3L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(3L)], c6Var);
            } else if (i10 == 7 || i10 == 24) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(1L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(1L)], c6Var);
            } else if (i10 == 8) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(0L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(0L)], c6Var);
            } else if (i10 == 9) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(6L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(6L)], c6Var);
            } else if (i10 == 10 || i10 == 17) {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(5L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(5L)], c6Var);
            } else if (i10 == 21) {
                this.f34847c = true;
                if (this.f34849f == null) {
                    this.f34849f = new c20();
                }
                this.f34849f.d(-8160001, -5217281, -36183, -1938945);
            } else if (i10 == 22) {
                this.f34847c = true;
                if (this.f34849f == null) {
                    this.f34849f = new c20();
                }
                this.f34849f.d(-11694593, -13910017, -14622003, -15801871);
            } else {
                this.f34846b = true;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(4L)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(4L)], c6Var);
            }
        }
        int i11 = this.f34856n;
        if (i11 != 2 && i11 != 1 && i11 != 20 && i11 != 21 && i11 != 27 && i11 != 12 && i11 != 14) {
            z10 = true;
        }
        this.f34850g = z10;
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
        this.f34846b = false;
        this.f34847c = false;
        this.f34848e = i10;
        this.d = i10;
        this.f34850g = false;
    }

    public final void i(int i10, int i11) {
        this.f34846b = true;
        this.f34847c = false;
        this.d = i10;
        this.f34848e = i11;
        this.f34850g = false;
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
        if (chat != null) {
            o(chat.f22380id, chat.title, null, chat.color != null ? Integer.valueOf(ChatObject.getColorId(chat)) : null, ChatObject.getPeerColorForAvatar(i10, chat));
        }
    }

    public final void l(int i10, TLRPC.ChatInvite chatInvite) {
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            o(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(chat)), ChatObject.getPeerColorForAvatar(i10, chatInvite.chat));
        }
    }

    public final void m(int i10, TLRPC.User user) {
        if (user != null) {
            o(user.f22527id, user.first_name, user.last_name, user.color != null ? Integer.valueOf(UserObject.getColorId(user)) : null, UserObject.getPeerColorForAvatar(i10, user));
            this.f34855m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j10, String str, String str2) {
        o(j10, str, str2, null, null);
    }

    public final void o(long j10, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        this.A = true;
        this.f34846b = true;
        this.f34847c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.f34848e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.g6.f23270p8[e(j10)];
            org.telegram.ui.ActionBar.c6 c6Var = this.f34867z;
            this.d = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(j10)], c6Var);
        }
        this.f34850g = j10 == 5;
        this.f34856n = 0;
        this.f34855m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f34859q);
    }

    public final void p(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
            return;
        }
        if (tLObject instanceof TLRPC.Chat) {
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
        c20 c20Var = this.f34849f;
        if (c20Var != null) {
            this.f34846b = false;
            this.f34847c = true;
        } else {
            this.f34846b = true;
            this.f34847c = false;
        }
        int[][] iArr = C;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34867z;
        if (i10 < 14) {
            if (c20Var != null) {
                int[] iArr2 = iArr[e(i10)];
                this.f34849f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                return;
            } else {
                long j10 = i10;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(j10)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(j10)], c6Var);
                return;
            }
        }
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (messagesController == null || (peerColors = messagesController.peerColors) == null || peerColors.getColor(i10) == null) {
            if (this.f34849f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f34849f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                return;
            } else {
                long j11 = i10;
                this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[e(j11)], c6Var);
                this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[e(j11)], c6Var);
                return;
            }
        }
        int color1 = messagesController.peerColors.getColor(i10).getColor1();
        if (this.f34849f != null) {
            int[] iArr4 = iArr[f(color1)];
            this.f34849f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            this.d = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[f(color1)], c6Var);
            this.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[f(color1)], c6Var);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f34866y = i10;
    }

    public final void t() {
        this.f34854l = true;
    }

    public final void u(int i10) {
        this.f34845a.setTextSize(i10);
    }

    public y8(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.c6) null);
        this.f34854l = false;
        if (user != null) {
            o(user.f22527id, user.first_name, user.last_name, null, null);
            this.f34855m = UserObject.isDeleted(user);
        }
    }

    public y8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.c6) null);
        this.f34854l = false;
        q(chat);
    }

    public y8(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34858p = 1.0f;
        this.f34859q = new StringBuilder(5);
        this.f34860r = -1;
        this.f34864w = true;
        this.f34865x = false;
        this.f34866y = 255;
        this.f34867z = c6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f34845a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
