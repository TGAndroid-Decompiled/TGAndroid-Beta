package org.telegram.ui.Components;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class j9 extends Drawable {
    public static final int[][] L = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public Drawable K;
    public final TextPaint f29530a;
    public boolean f29531b;
    public boolean f29532c;
    public int d;
    public int e;
    public z20 f29533f;
    public boolean f29534g;
    public StaticLayout h;
    public float f29535i;
    public float f29536j;
    public float f29537k;
    public boolean f29538l;
    public boolean f29539m;
    public int f29540n;
    public float f29541o;
    public float f29542p;
    public final StringBuilder f29543q;
    public int f29544r;
    public int f29545s;
    public int f29546t;
    public int f29547u;
    public LinearGradient v;
    public boolean f29548w;
    public boolean f29549x;
    public int f29550y;
    public final org.telegram.ui.ActionBar.u6 f29551z;

    public j9() {
        this((org.telegram.ui.ActionBar.u6) null);
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
        return org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23582p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.y6.f23582p8.length);
    }

    public static int f(int i10) {
        float[] O0 = org.telegram.ui.ActionBar.y6.O0(5);
        Color.colorToHSV(i10, O0);
        int i11 = (int) O0[0];
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
        if (this.f29534g) {
            int i10 = this.d;
            int i11 = 0;
            org.telegram.ui.ActionBar.w6 k10 = org.telegram.ui.ActionBar.y6.I.k(false);
            org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
            if (k10 != null) {
                i11 = k10.f23217c;
            }
            return org.telegram.ui.ActionBar.y6.B(x6Var, i11, i10);
        }
        return this.d;
    }

    public final int c() {
        if (this.f29534g) {
            int i10 = this.e;
            int i11 = 0;
            org.telegram.ui.ActionBar.w6 k10 = org.telegram.ui.ActionBar.y6.I.k(false);
            org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
            if (k10 != null) {
                i11 = k10.f23217c;
            }
            return org.telegram.ui.ActionBar.y6.B(x6Var, i11, i10);
        }
        return this.e;
    }

    @Override
    public final void draw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j9.draw(android.graphics.Canvas):void");
    }

    public final void g(int i10) {
        boolean z10;
        this.f29540n = i10;
        boolean z11 = false;
        this.f29549x = false;
        this.f29532c = false;
        this.f29531b = false;
        if (i10 == 13) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P9, false);
            this.e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.f29551z;
            if (i10 == 2) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.N7, u6Var);
                this.e = w02;
                this.d = w02;
            } else if (i10 != 27 && i10 != 12 && i10 != 1 && i10 != 14) {
                if (i10 == 20) {
                    this.f29549x = true;
                    this.f29531b = true;
                    this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.hk, u6Var);
                    this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ik, u6Var);
                } else if (i10 == 3) {
                    this.f29531b = true;
                    this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(5L)], u6Var);
                    this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(5L)], u6Var);
                } else if (i10 == 25) {
                    this.f29531b = true;
                    this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(2L)], u6Var);
                    this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(2L)], u6Var);
                } else if (i10 == 26) {
                    this.f29531b = true;
                    this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(1L)], u6Var);
                    this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(1L)], u6Var);
                } else if (i10 == 4) {
                    this.f29531b = true;
                    this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(5L)], u6Var);
                    this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(5L)], u6Var);
                } else if (i10 == 5) {
                    this.f29531b = true;
                    this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(4L)], u6Var);
                    this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(4L)], u6Var);
                } else if (i10 != 6 && i10 != 23) {
                    if (i10 != 7 && i10 != 24) {
                        if (i10 == 8) {
                            this.f29531b = true;
                            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(0L)], u6Var);
                            this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(0L)], u6Var);
                        } else if (i10 == 9) {
                            this.f29531b = true;
                            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(6L)], u6Var);
                            this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(6L)], u6Var);
                        } else if (i10 == 10) {
                            this.f29531b = true;
                            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(5L)], u6Var);
                            this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(5L)], u6Var);
                        } else if (i10 == 17) {
                            this.f29531b = true;
                            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(5L)], u6Var);
                            this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(5L)], u6Var);
                        } else if (i10 == 21) {
                            this.f29532c = true;
                            if (this.f29533f == null) {
                                this.f29533f = new z20();
                            }
                            this.f29533f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i10 == 22) {
                            this.f29532c = true;
                            if (this.f29533f == null) {
                                this.f29533f = new z20();
                            }
                            this.f29533f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f29531b = true;
                            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(4L)], u6Var);
                            this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(4L)], u6Var);
                        }
                    } else {
                        this.f29531b = true;
                        this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(1L)], u6Var);
                        this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(1L)], u6Var);
                    }
                } else {
                    this.f29531b = true;
                    this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(3L)], u6Var);
                    this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(3L)], u6Var);
                }
            } else {
                this.f29531b = true;
                this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.K7, u6Var);
                this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.L7, u6Var);
            }
        }
        int i11 = this.f29540n;
        if (i11 != 2 && i11 != 1 && i11 != 20 && i11 != 21 && i11 != 27 && i11 != 12 && i11 != 14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29534g = z10;
        if (i11 == 13 || i11 == 2 || i11 == 27 || i11 == 12 || i11 == 1 || i11 == 14 || i11 == 20) {
            z11 = true;
        }
        this.G = z11;
        this.H = this.d;
        this.I = this.e;
        this.J = org.telegram.ui.ActionBar.f7.f22628b;
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
        this.f29531b = false;
        this.f29532c = false;
        this.e = i10;
        this.d = i10;
        this.f29534g = false;
    }

    public final void i(int i10, int i11) {
        this.f29531b = true;
        this.f29532c = false;
        this.d = i10;
        this.e = i11;
        this.f29534g = false;
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
            long j10 = chat.f22027id;
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
            long j10 = user.f22176id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(UserObject.getColorId(user));
            } else {
                num = null;
            }
            o(j10, str, str2, num, UserObject.getPeerColorForAvatar(i10, user));
            this.f29539m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j10, String str, String str2) {
        o(j10, str, str2, null, null);
    }

    public final void o(long j10, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        boolean z10 = true;
        this.A = true;
        this.f29531b = true;
        this.f29532c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.y6.f23582p8[e(j10)];
            org.telegram.ui.ActionBar.u6 u6Var = this.f29551z;
            this.d = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(j10)], u6Var);
            this.C = e(j10);
            this.D = this.d;
            this.E = this.e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.f7.f22628b;
        }
        if (j10 != 5) {
            z10 = false;
        }
        this.f29534g = z10;
        this.f29540n = 0;
        this.f29539m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f29543q);
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
        z20 z20Var = this.f29533f;
        if (z20Var != null) {
            this.f29531b = false;
            this.f29532c = true;
        } else {
            this.f29531b = true;
            this.f29532c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.u6 u6Var = this.f29551z;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            if (messagesController != null && (peerColors = messagesController.peerColors) != null && peerColors.getColor(i10) != null) {
                int color1 = messagesController.peerColors.getColor(i10).getColor1();
                if (this.f29533f != null) {
                    int[] iArr2 = iArr[f(color1)];
                    this.f29533f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[f(color1)], u6Var);
                this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[f(color1)], u6Var);
            } else if (this.f29533f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f29533f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j10 = i10;
                this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(j10)], u6Var);
                this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(j10)], u6Var);
            }
        } else if (z20Var != null) {
            int[] iArr4 = iArr[e(i10)];
            this.f29533f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j11 = i10;
            this.d = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p8[e(j11)], u6Var);
            this.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23599q8[e(j11)], u6Var);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29550y = i10;
    }

    public final void t() {
        this.f29538l = true;
    }

    public final void u(int i10) {
        this.f29530a.setTextSize(i10);
    }

    public j9(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.u6) null);
        this.f29538l = false;
        if (user != null) {
            o(user.f22176id, user.first_name, user.last_name, null, null);
            this.f29539m = UserObject.isDeleted(user);
        }
    }

    public j9(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.u6) null);
        this.f29538l = false;
        q(chat);
    }

    public j9(org.telegram.ui.ActionBar.u6 u6Var) {
        this.f29542p = 1.0f;
        this.f29543q = new StringBuilder(5);
        this.f29544r = -1;
        this.f29548w = true;
        this.f29549x = false;
        this.f29550y = 255;
        this.f29551z = u6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f29530a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
