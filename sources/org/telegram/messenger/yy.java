package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class yy {
    public int A;
    public int B;
    public int C;
    public Object D;
    public cj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.rm J;
    public cw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public lj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String f28211a;
    public String f28212b;
    public TLRPC.MessageMedia f28213c;
    public TLRPC.TL_photo d;
    public f20 f28214e;
    public TLRPC.User f28215f;
    public TLRPC.TL_document f28216g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f28217i;
    public sh.f f28218j;
    public int f28219k;
    public TLRPC.TL_messageMediaToDo f28220l;
    public TLRPC.TL_messageMediaInvoice f28221m;
    public TLRPC.TL_messageMediaWebPage f28222n;
    public TLRPC.PhotoSize f28223o;
    public long f28224p;
    public String f28225q;
    public gj f28226r;
    public gj f28227s;
    public TLRPC.WebPage f28228t;
    public boolean f28229u;
    public gj v;
    public ArrayList f28230w;
    public TLRPC.ReplyMarkup f28231x;
    public HashMap f28232y;
    public boolean f28233z;

    public static yy a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static yy b(String str, long j3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, cj cjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i7, i10, 0, null, cjVar, z12, false);
    }

    public static yy c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, f20 f20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, gj gjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, int i11, Object obj, cj cjVar, boolean z12, boolean z13) {
        ?? obj2 = new Object();
        obj2.f28211a = str;
        obj2.f28212b = str2;
        obj2.f28213c = messageMedia;
        obj2.d = tL_photo;
        obj2.f28214e = f20Var;
        obj2.f28215f = user;
        obj2.f28216g = tL_document;
        obj2.h = tL_game;
        obj2.f28217i = tL_messageMediaPoll;
        obj2.f28221m = tL_messageMediaInvoice;
        obj2.f28224p = j3;
        obj2.f28225q = str3;
        obj2.f28226r = gjVar;
        obj2.f28227s = gjVar2;
        obj2.f28228t = webPage;
        obj2.f28229u = z10;
        obj2.v = gjVar3;
        obj2.f28230w = arrayList;
        obj2.f28231x = replyMarkup;
        obj2.f28232y = hashMap;
        obj2.f28233z = z11;
        obj2.A = i7;
        obj2.B = i10;
        obj2.C = i11;
        obj2.D = obj;
        obj2.E = cjVar;
        obj2.F = z12;
        obj2.G = z13;
        return obj2;
    }

    public static yy d(TLRPC.MessageMedia messageMedia, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, 0, 0, null, null, false, false);
    }

    public static yy e(TLRPC.TL_document tL_document, f20 f20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, f20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, null, hashMap, z10, i7, i10, i11, obj, null, false, z11);
    }

    public static yy f(TLRPC.TL_document tL_document, f20 f20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, cj cjVar, boolean z11) {
        return c(null, str2, null, null, f20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i7, i10, i11, obj, cjVar, z11, false);
    }

    public static yy g(TLRPC.User user, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, i10, 0, null, null, false, false);
    }
}
