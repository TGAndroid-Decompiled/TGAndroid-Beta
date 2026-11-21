package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public abstract class s0 {
    public static final LongSparseArray f39424a = new LongSparseArray();
    public static final LongSparseArray f39425b = new LongSparseArray();

    public static TL_aicompose.AiComposeTone a(int i7, TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (inputAiComposeTone == null) {
            return null;
        }
        ArrayList arrayList = org.telegram.messenger.mp.u1(i7).T1().f23639b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneID) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.inputAiComposeToneID) inputAiComposeTone).f28645id == ((TL_aicompose.TL_aiComposeTone) aiComposeTone).f28644id) {
                return aiComposeTone;
            }
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSlug) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && TextUtils.equals(((TL_aicompose.inputAiComposeToneSlug) inputAiComposeTone).slug, ((TL_aicompose.TL_aiComposeTone) aiComposeTone).slug)) {
                return aiComposeTone;
            }
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeToneDefault) && TextUtils.equals(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone, ((TL_aicompose.TL_aiComposeToneDefault) aiComposeTone).tone)) {
                return aiComposeTone;
            }
        }
        return null;
    }

    public static r0 b(int i7, long j3) {
        String str;
        r0 r0Var;
        r0 r0Var2;
        String str2;
        String str3;
        if (j3 == 0) {
            return null;
        }
        int i10 = 0;
        if (!org.telegram.messenger.n5.C(j3)) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
            d02.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) d02.f26663r1.f(j3);
            if (inputaicomposestyle != null) {
                ?? obj = new Object();
                if (TextUtils.isEmpty(inputaicomposestyle.to_lang)) {
                    str2 = null;
                } else {
                    str2 = inputaicomposestyle.to_lang;
                }
                obj.f39031c = str2;
                TL_aicompose.InputAiComposeTone d = d(inputaicomposestyle.tone);
                obj.d = d;
                obj.f39030b = inputaicomposestyle.emojify;
                if (obj.f39031c == null) {
                    i10 = 1;
                }
                obj.f39033f = i10;
                TL_aicompose.AiComposeTone a10 = a(i7, d);
                if (a10 != null && !TextUtils.isEmpty(a10.title)) {
                    str3 = a10.title;
                } else {
                    str3 = null;
                }
                String str4 = obj.f39031c;
                if (str4 != null) {
                    String L0 = b31.L0(b31.P0(str4, null, null));
                    if (str3 != null) {
                        L0 = a8.p0.E(str3, " ", L0);
                    }
                    obj.f39032e = L0;
                } else {
                    if (str3 == null) {
                        str3 = org.telegram.messenger.gd.N0(2131754963, null);
                    }
                    obj.f39032e = str3;
                }
                if (obj.f39030b) {
                    obj.f39032e = a8.p0.s(new StringBuilder(), obj.f39032e, " + Emoji");
                }
                return obj;
            }
        }
        LongSparseArray longSparseArray = f39424a;
        long j10 = (8 * j3) + i7;
        LongSparseArray longSparseArray2 = f39425b;
        if (longSparseArray2.get(j10) != null) {
            r0Var2 = (r0) longSparseArray.get(j10);
        } else {
            String string = org.telegram.messenger.t0.f26941b.getSharedPreferences("anim_ai_always", 0).getString(c(i7, j3), null);
            if (string != null) {
                try {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 2));
                    ?? obj2 = new Object();
                    serializedData.readInt32(false);
                    obj2.f39033f = serializedData.readInt32(false);
                    obj2.f39029a = serializedData.readBool(false);
                    obj2.f39030b = serializedData.readBool(false);
                    if (serializedData.readBool(false)) {
                        str = serializedData.readString(false);
                    } else {
                        str = null;
                    }
                    obj2.f39031c = str;
                    obj2.f39032e = serializedData.readString(false);
                    if (serializedData.readBool(false)) {
                        obj2.d = TL_aicompose.InputAiComposeTone.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    }
                    serializedData.cleanup();
                    r0Var = obj2;
                } catch (Throwable unused) {
                }
                longSparseArray.put(j10, r0Var);
                longSparseArray2.put(j10, Boolean.TRUE);
                r0Var2 = r0Var;
            }
            r0Var = null;
            longSparseArray.put(j10, r0Var);
            longSparseArray2.put(j10, Boolean.TRUE);
            r0Var2 = r0Var;
        }
        if (r0Var2 == null) {
            return null;
        }
        if (!r0Var2.f39029a && !org.telegram.messenger.n5.C(j3)) {
            return null;
        }
        return r0Var2;
    }

    public static String c(int i7, long j3) {
        return i7 + "_" + j3;
    }

    public static TL_aicompose.InputAiComposeTone d(TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && TextUtils.isEmpty(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone)) || (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
            return null;
        }
        return inputAiComposeTone;
    }

    public static void e(int i7, final long j3, r0 r0Var) {
        boolean z10;
        r0 r0Var2;
        boolean z11;
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        final TL_aicompose.inputAiComposeStyle inputaicomposestyle2;
        String str;
        if (j3 != 0) {
            boolean z12 = true;
            if (r0Var != null && (r0Var.f39029a || org.telegram.messenger.n5.C(j3))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                r0Var2 = r0Var;
            } else {
                r0Var2 = null;
            }
            LongSparseArray longSparseArray = f39424a;
            LongSparseArray longSparseArray2 = f39425b;
            long j10 = (8 * j3) + i7;
            if (r0Var2 != null || longSparseArray2.get(j10) == null || longSparseArray.get(j10) != null) {
                longSparseArray.put(j10, r0Var2);
                longSparseArray2.put(j10, Boolean.TRUE);
                if (r0Var2 == null) {
                    org.telegram.messenger.t0.f26941b.getSharedPreferences("anim_ai_always", 0).edit().remove(c(i7, j3)).apply();
                } else {
                    SerializedData serializedData = new SerializedData();
                    serializedData.writeInt32(1);
                    serializedData.writeInt32(r0Var2.f39033f);
                    serializedData.writeBool(r0Var2.f39029a);
                    serializedData.writeBool(r0Var2.f39030b);
                    if (r0Var2.f39031c != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    serializedData.writeBool(z11);
                    String str2 = r0Var2.f39031c;
                    if (str2 != null) {
                        serializedData.writeString(str2);
                    }
                    String str3 = r0Var2.f39032e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    serializedData.writeString(str3);
                    TL_aicompose.InputAiComposeTone d = d(r0Var2.d);
                    if (d == null) {
                        z12 = false;
                    }
                    serializedData.writeBool(z12);
                    if (d != null) {
                        d.serializeToStream(serializedData);
                    }
                    org.telegram.messenger.t0.f26941b.getSharedPreferences("anim_ai_always", 0).edit().putString(c(i7, j3), Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                    serializedData.cleanup();
                }
            }
            if (!org.telegram.messenger.n5.C(j3)) {
                final org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
                if (r0Var != null && !z10) {
                    inputaicomposestyle = new TL_aicompose.inputAiComposeStyle();
                    inputaicomposestyle.tone = d(r0Var.d);
                    if (TextUtils.isEmpty(r0Var.f39031c)) {
                        str = null;
                    } else {
                        str = r0Var.f39031c;
                    }
                    inputaicomposestyle.to_lang = str;
                    inputaicomposestyle.emojify = r0Var.f39030b;
                } else {
                    inputaicomposestyle = null;
                }
                if (!org.telegram.messenger.n5.C(j3)) {
                    TLRPC.InputPeer l1 = d02.getMessagesController().l1(j3);
                    d02.k();
                    final TL_aicompose.inputAiComposeStyle inputaicomposestyle3 = (TL_aicompose.inputAiComposeStyle) d02.f26663r1.f(j3);
                    if (org.telegram.messenger.ri.B0(inputaicomposestyle)) {
                        inputaicomposestyle2 = null;
                    } else {
                        inputaicomposestyle2 = inputaicomposestyle;
                    }
                    if (!org.telegram.messenger.ri.j(inputaicomposestyle3, inputaicomposestyle2)) {
                        d02.H1(j3, inputaicomposestyle2);
                        TL_aicompose.setChatStyle setchatstyle = new TL_aicompose.setChatStyle();
                        setchatstyle.peer = l1;
                        setchatstyle.style = inputaicomposestyle2;
                        d02.getConnectionsManager().sendRequestTyped(setchatstyle, new d3.b(1), new org.telegram.messenger.q10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                TLRPC.Bool bool = (TLRPC.Bool) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                if (tL_error != null) {
                                    a8.d("aicompose.setChatStyle failed: " + tL_error.text);
                                    ri riVar = ri.this;
                                    riVar.k();
                                    a0.h hVar = riVar.f26663r1;
                                    long j11 = j3;
                                    if (ri.j((TL_aicompose.inputAiComposeStyle) hVar.f(j11), inputaicomposestyle2)) {
                                        riVar.H1(j11, inputaicomposestyle3);
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
