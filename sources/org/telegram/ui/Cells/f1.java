package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.zb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.iz;
public abstract class f1 {
    public static float A(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 * f11) * f12);
    }

    public static int B(int i3, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicHeight() / i3);
    }

    public static int C(int i3, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicWidth() / i3);
    }

    public static String D(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        return "FAILED";
                    }
                    throw null;
                }
                return "PENDING";
            }
            return "CANCELLED";
        }
        return "PAID";
    }

    public static void E(p2.g gVar, p2.g gVar2) {
        if (gVar != gVar2) {
            if (gVar2 != null) {
                gVar2.e(null);
            }
            if (gVar != null) {
                gVar.b(null);
            }
        }
    }

    public static String F(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return "null";
                    }
                    return "FROSTED_FILTERED";
                }
                return "FROSTED_GLASS";
            }
            return "GLASS";
        }
        return "BLURRED";
    }

    public static boolean a(zi ziVar) {
        if (ziVar != null && zi.B0(ziVar.f26868k) == 1271266957) {
            return true;
        }
        return false;
    }

    public static void b(RecyclerView recyclerView) {
        recyclerView.C0();
        u4.o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof u4.b0) {
            ((u4.b0) layoutManager).h1(0, 0);
        } else {
            recyclerView.v0(0);
        }
    }

    public static float c(RecyclerView recyclerView) {
        int i3 = gt0.m0;
        u4.o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        View m10 = layoutManager.m(0);
        if (m10 == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - u4.o0.z(m10)) + ((ViewGroup.MarginLayoutParams) ((u4.p0) m10.getLayoutParams())).topMargin);
    }

    public static boolean d(int i3) {
        if (i3 != 0) {
            if (i3 != 3 && i3 != 4) {
                return false;
            }
            return true;
        }
        throw null;
    }

    public static int e(int i3) {
        int[] d = o1.g.d(126);
        if (i3 >= 0 && i3 < d.length) {
            return d[i3];
        }
        return 0;
    }

    public static String f(int i3) {
        switch (i3) {
            case 1:
                return "Blues";
            case 2:
                return "Classic Rock";
            case 3:
                return "Country";
            case 4:
                return "Dance";
            case 5:
                return "Disco";
            case 6:
                return "Funk";
            case 7:
                return "Grunge";
            case 8:
                return "Hip-Hop";
            case 9:
                return "Jazz";
            case 10:
                return "Metal";
            case 11:
                return "New Age";
            case 12:
                return "Oldies";
            case 13:
                return "Other";
            case 14:
                return "Pop";
            case 15:
                return "R&B";
            case 16:
                return "Rap";
            case 17:
                return "Reggae";
            case 18:
                return "Rock";
            case 19:
                return "Techno";
            case 20:
                return "Industrial";
            case 21:
                return "Alternative";
            case 22:
                return "Ska";
            case 23:
                return "Death Metal";
            case 24:
                return "Pranks";
            case 25:
                return "Soundtrack";
            case 26:
                return "Euro-Techno";
            case 27:
                return "Ambient";
            case 28:
                return "Trip-Hop";
            case 29:
                return "Vocal";
            case 30:
                return "Jazz+Funk";
            case 31:
                return "Fusion";
            case 32:
                return "Trance";
            case 33:
                return "Classical";
            case 34:
                return "Instrumental";
            case 35:
                return "Acid";
            case 36:
                return "House";
            case 37:
                return "Game";
            case 38:
                return "Sound Clip";
            case 39:
                return "Gospel";
            case 40:
                return "Noise";
            case 41:
                return "AlternRock";
            case 42:
                return "Bass";
            case 43:
                return "Soul";
            case 44:
                return "Punk";
            case 45:
                return "Space";
            case 46:
                return "Meditative";
            case 47:
                return "Instrumental Pop";
            case 48:
                return "Instrumental Rock";
            case 49:
                return "Ethnic";
            case 50:
                return "Gothic";
            case 51:
                return "Darkwave";
            case 52:
                return "Techno-Industrial";
            case 53:
                return "Electronic";
            case 54:
                return "Pop-Folk";
            case 55:
                return "Eurodance";
            case 56:
                return "Dream";
            case 57:
                return "Southern Rock";
            case 58:
                return "Comedy";
            case 59:
                return "Cult";
            case 60:
                return "Gangsta";
            case 61:
                return "Top 40";
            case 62:
                return "Christian Rap";
            case 63:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case 66:
                return "Cabaret";
            case 67:
                return "New Wave";
            case 68:
                return "Psychadelic";
            case 69:
                return "Rave";
            case 70:
                return "Showtunes";
            case 71:
                return "Trailer";
            case 72:
                return "Lo-Fi";
            case 73:
                return "Tribal";
            case 74:
                return "Acid Punk";
            case 75:
                return "Acid Jazz";
            case 76:
                return "Polka";
            case 77:
                return "Retro";
            case 78:
                return "Musical";
            case 79:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case 81:
                return "Folk";
            case 82:
                return "Folk-Rock";
            case 83:
                return "National Folk";
            case 84:
                return "Swing";
            case 85:
                return "Fast Fusion";
            case 86:
                return "Bebop";
            case 87:
                return "Latin";
            case 88:
                return "Revival";
            case 89:
                return "Celtic";
            case 90:
                return "Bluegrass";
            case 91:
                return "Avantgarde";
            case 92:
                return "Gothic Rock";
            case 93:
                return "Progressive Rock";
            case 94:
                return "Psychedelic Rock";
            case 95:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case 97:
                return "Big Band";
            case 98:
                return "Chorus";
            case 99:
                return "Easy Listening";
            case 100:
                return "Acoustic";
            case 101:
                return "Humour";
            case 102:
                return "Speech";
            case 103:
                return "Chanson";
            case 104:
                return "Opera";
            case 105:
                return "Chamber Music";
            case 106:
                return "Sonata";
            case 107:
                return "Symphony";
            case 108:
                return "Booty Bass";
            case 109:
                return "Primus";
            case 110:
                return "Porn Groove";
            case 111:
                return "Satire";
            case 112:
                return "Slow Jam";
            case 113:
                return "Club";
            case 114:
                return "Tango";
            case 115:
                return "Samba";
            case 116:
                return "Folklore";
            case 117:
                return "Ballad";
            case 118:
                return "Power Ballad";
            case 119:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case 121:
                return "Duet";
            case 122:
                return "Punk Rock";
            case 123:
                return "Drum Solo";
            case 124:
                return "A capella";
            case 125:
                return "Euro-House";
            case 126:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static float g(float f10, float f11, float f12) {
        return (org.telegram.messenger.g0.N(f10) * f11) + f12;
    }

    public static float h(float f10, float f11, float f12, float f13) {
        return Math.min(f13, (f10 / f11) + f12);
    }

    public static int i(int i3, int i10, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i3) + i10;
    }

    public static int j(iz izVar, int i3) {
        return izVar.c(izVar.getMeasuredWidth()) + i3;
    }

    public static Bundle k(int i3, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i3);
        return bundle;
    }

    public static Bundle l(int i3, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i3);
        return bundle;
    }

    public static TextView m(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Integer n(int i3, ArrayList arrayList, int i10, ArrayList arrayList2, int i11) {
        arrayList.add(bd.M0(i3, null));
        arrayList2.add(Integer.valueOf(i10));
        return Integer.valueOf(i11);
    }

    public static Object o(int i3, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i3);
    }

    public static Object p(HashMap hashMap, Uri uri, Uri uri2) {
        zb.p(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static String q(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String r(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static q1.h s(float f10, float f11, float f12) {
        q1.h hVar = new q1.h(f10);
        hVar.b(f11);
        hVar.a(f12);
        return hVar;
    }

    public static void t(int i3, String str, ArrayList arrayList) {
        arrayList.add(new o6(i3, str));
    }

    public static void u(int i3, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(bd.M0(i3, null));
        arrayList2.add(num);
    }

    public static void v(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.TL_error tL_error, boolean z10) {
        new fc(frameLayout, e6Var).f0(tL_error, z10);
    }

    public static void w(d2.u uVar, e3.i0 i0Var) {
        i0Var.g(new d2.v(uVar));
    }

    public static void x(String str, int i3, ArrayList arrayList, int i10, ArrayList arrayList2) {
        arrayList.add(bd.M0(i3, str));
        arrayList2.add(Integer.valueOf(i10));
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return Math.max(f13, f12 - (f10 / f11));
    }

    public static int z(int i3, int i10, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i3) + i10;
    }
}
