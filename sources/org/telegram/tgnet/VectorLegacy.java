package org.telegram.tgnet;

import java.util.ArrayList;
import java.util.Iterator;

public class VectorLegacy {
    private VectorLegacy() {
    }

    public static ArrayList<Long> deserialize_IntAsLong(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Integer> arrayListDeserializeInt = Vector.deserializeInt(inputSerializedData, z);
        ArrayList<Long> arrayList = new ArrayList<>(arrayListDeserializeInt.size());
        Iterator<Integer> it = arrayListDeserializeInt.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().intValue()));
        }
        return arrayList;
    }

    public static void serialize_LongAsInt(OutputSerializedData outputSerializedData, ArrayList<Long> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf((int) it.next().longValue()));
        }
        Vector.serializeInt(outputSerializedData, arrayList2);
    }

    public static ArrayList<TLRPC.Peer> deserialize_IntUserIdAsPeer(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Integer> arrayListDeserializeInt = Vector.deserializeInt(inputSerializedData, z);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(arrayListDeserializeInt.size());
        Iterator<Integer> it = arrayListDeserializeInt.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = iIntValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static void serialize_PeerAsIntUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            outputSerializedData.writeInt32((int) arrayList.get(i).user_id);
        }
    }

    public static ArrayList<TLRPC.Peer> deserialize_LongUserIdAsPeer(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Long> arrayListDeserializeLong = Vector.deserializeLong(inputSerializedData, z);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(arrayListDeserializeLong.size());
        Iterator<Long> it = arrayListDeserializeLong.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = jLongValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static void serialize_PeerAsLongUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            outputSerializedData.writeInt64(arrayList.get(i).user_id);
        }
    }
}
