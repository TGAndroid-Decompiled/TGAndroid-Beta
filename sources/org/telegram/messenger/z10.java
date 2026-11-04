package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class z10 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.t5 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public gi.sb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public ug.g0 W;
    public byte f26703a;
    public byte f26704b;
    public float f26705c;
    public float d;
    public float f26706e;
    public float f26707f;
    public float f26708g;
    public float h;
    public float f26709i;
    public String f26710j;
    public ArrayList f26711k;
    public int f26712l;
    public int f26713m;
    public tg.b0 f26714n;
    public String f26715o;
    public int f26716p;
    public int f26717q;
    public int f26718r;
    public float f26719s;
    public String f26720t;
    public re f26721u;
    public float v;
    public float f26722w;
    public float f26723x;
    public float f26724y;
    public float f26725z;

    public z10() {
        this.f26710j = "";
        this.f26711k = new ArrayList();
        this.f26720t = "";
        this.v = 1.0f;
    }

    public final z10 a() {
        z10 z10Var = new z10();
        z10Var.f26703a = this.f26703a;
        z10Var.f26704b = this.f26704b;
        z10Var.f26705c = this.f26705c;
        z10Var.d = this.d;
        z10Var.f26706e = this.f26706e;
        z10Var.f26707f = this.f26707f;
        z10Var.f26708g = this.f26708g;
        z10Var.f26709i = this.f26709i;
        z10Var.f26710j = this.f26710j;
        if (this.f26711k != null) {
            ArrayList arrayList = new ArrayList();
            z10Var.f26711k = arrayList;
            arrayList.addAll(this.f26711k);
        }
        z10Var.f26712l = this.f26712l;
        z10Var.f26713m = this.f26713m;
        z10Var.f26714n = this.f26714n;
        z10Var.f26715o = this.f26715o;
        z10Var.f26716p = this.f26716p;
        z10Var.f26717q = this.f26717q;
        z10Var.f26718r = this.f26718r;
        z10Var.f26719s = this.f26719s;
        z10Var.v = this.v;
        z10Var.f26722w = this.f26722w;
        z10Var.f26723x = this.f26723x;
        z10Var.f26724y = this.f26724y;
        z10Var.f26725z = this.f26725z;
        z10Var.B = this.B;
        z10Var.C = this.C;
        z10Var.D = this.D;
        z10Var.E = this.E;
        z10Var.F = this.F;
        z10Var.G = this.G;
        z10Var.I = this.I;
        z10Var.J = this.J;
        z10Var.L = this.L;
        z10Var.M = this.M;
        z10Var.N = this.N;
        z10Var.P = this.P;
        z10Var.U = this.U;
        z10Var.V = this.V;
        z10Var.Q = this.Q;
        z10Var.T = this.T;
        z10Var.R = this.R;
        z10Var.S = this.S;
        z10Var.W = this.W;
        z10Var.O = this.O;
        return z10Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.f26703a);
        abstractSerializedData.writeByte(this.f26704b);
        abstractSerializedData.writeFloat(this.f26705c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f26706e);
        abstractSerializedData.writeFloat(this.f26707f);
        abstractSerializedData.writeFloat(this.f26708g);
        abstractSerializedData.writeString(this.f26710j);
        abstractSerializedData.writeInt32(this.f26711k.size());
        for (int i3 = 0; i3 < this.f26711k.size(); i3++) {
            ((y10) this.f26711k.get(i3)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f26712l);
        abstractSerializedData.writeInt32(this.f26713m);
        abstractSerializedData.writeInt32(this.f26717q);
        abstractSerializedData.writeInt32(this.f26718r);
        abstractSerializedData.writeInt32(this.f26716p);
        tg.b0 b0Var = this.f26714n;
        if (b0Var == null) {
            str = this.f26715o;
            if (str == null) {
                str = "";
            }
        } else {
            str = b0Var.f55128a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f26722w);
        abstractSerializedData.writeFloat(this.f26723x);
        abstractSerializedData.writeFloat(this.f26724y);
        abstractSerializedData.writeFloat(this.f26725z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f26703a;
        if (b10 == 3) {
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia.provider == null) {
                messageMedia.provider = "";
            }
            if (messageMedia.venue_id == null) {
                messageMedia.venue_id = "";
            }
            if (messageMedia.venue_type == null) {
                messageMedia.venue_type = "";
            }
            messageMedia.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia2 = this.N;
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaVenue) && ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji != null) {
                abstractSerializedData.writeInt32(-559038737);
                abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.N).emoji);
                return;
            }
            abstractSerializedData.writeInt32(1450380236);
        } else if (b10 == 7) {
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            this.W.serializeToStream(abstractSerializedData);
        } else if (b10 == 4) {
            this.M.serializeToStream(abstractSerializedData);
        } else if (b10 == 5) {
            abstractSerializedData.writeInt64(this.Q);
            abstractSerializedData.writeInt64(this.R);
            abstractSerializedData.writeInt64(this.S);
            abstractSerializedData.writeInt64(this.T);
        } else if (b10 == 2) {
            abstractSerializedData.writeString(this.f26720t);
            re reVar = this.f26721u;
            if (reVar != null) {
                reVar.serializeToStream(abstractSerializedData);
            } else {
                abstractSerializedData.writeInt32(1450380236);
            }
        } else if (b10 == 8) {
            if (this.O == null) {
                abstractSerializedData.writeInt32(-559038737);
                return;
            }
            abstractSerializedData.writeInt32(132805945);
            this.O.serializeToStream(abstractSerializedData);
        }
    }

    public z10(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        tg.b0 b0Var;
        this.f26710j = "";
        this.f26711k = new ArrayList();
        this.f26720t = "";
        this.v = 1.0f;
        this.f26703a = abstractSerializedData.readByte(z11);
        this.f26704b = abstractSerializedData.readByte(z11);
        this.f26705c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f26706e = abstractSerializedData.readFloat(z11);
        this.f26707f = abstractSerializedData.readFloat(z11);
        this.f26708g = abstractSerializedData.readFloat(z11);
        this.f26710j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i3 = 0; i3 < readInt32; i3++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f26711k.add(tL_messageEntityCustomEmoji);
        }
        this.f26712l = abstractSerializedData.readInt32(z11);
        this.f26713m = abstractSerializedData.readInt32(z11);
        this.f26717q = abstractSerializedData.readInt32(z11);
        this.f26718r = abstractSerializedData.readInt32(z11);
        this.f26716p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f26715o = readString;
        tg.b0 b0Var2 = tg.b0.f55124e;
        ug.g0 g0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c2 = tg.b0.c();
            for (int i10 = 0; i10 < c2.size(); i10++) {
                b0Var = (tg.b0) c2.get(i10);
                if (b0Var != null && TextUtils.equals(readString, b0Var.f55128a)) {
                    break;
                }
            }
        }
        b0Var = null;
        this.f26714n = b0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f26722w = abstractSerializedData.readFloat(z11);
        this.f26723x = abstractSerializedData.readFloat(z11);
        this.f26724y = abstractSerializedData.readFloat(z11);
        this.f26725z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f26703a;
        if (b10 == 3) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            this.N = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z11) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z11);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
            }
        } else if (b10 == 7) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            int readInt323 = abstractSerializedData.readInt32(z11);
            if (-625858389 != readInt323) {
                int i11 = ug.g0.f56007j;
            } else {
                g0Var = new ug.g0();
            }
            this.W = (ug.g0) TLObject.TLdeserialize(ug.g0.class, g0Var, abstractSerializedData, readInt323, z11);
        } else if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
        } else if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z11);
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
        } else if (b10 == 2) {
            this.f26720t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                re reVar = new re();
                this.f26721u = reVar;
                reVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f13582a = abstractSerializedData.readDouble(false);
            tLObject.f13583b = abstractSerializedData.readDouble(false);
            tLObject.f13584c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
