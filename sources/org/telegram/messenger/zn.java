package org.telegram.messenger;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zn implements RequestDelegate {
    public final int f28360a;
    public final c1 f28361b;
    public final Object f28362c;
    public final Object d;
    public final Object f28363e;
    public final Object f28364f;

    public zn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f28360a = i7;
        this.f28361b = c1Var;
        this.f28362c = obj;
        this.d = obj2;
        this.f28363e = obj3;
        this.f28364f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String n10;
        gj gjVar;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.EncryptedChat encryptedChat;
        byte[] bArr;
        int i7 = this.f28360a;
        String str = "";
        int i10 = 0;
        Object obj = this.f28364f;
        Object obj2 = this.f28363e;
        Object obj3 = this.d;
        Object obj4 = this.f28362c;
        c1 c1Var = this.f28361b;
        switch (i7) {
            case 0:
                final np npVar = (np) c1Var;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj4;
                final org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                if (tL_theme != null) {
                    n10 = tL_theme.title;
                } else {
                    n10 = l6Var.n();
                }
                int lastIndexOf = n10.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    n10 = n10.substring(0, lastIndexOf);
                }
                if (tLObject != null) {
                    TLRPC.Document document2 = (TLRPC.Document) tLObject;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.f28446id = document2.f28440id;
                    tL_inputDocument.file_reference = document2.file_reference;
                    if (tL_theme != null && tL_theme.creator) {
                        TL_account.updateTheme updatetheme = new TL_account.updateTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.f28505id = tL_theme.f28573id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        updatetheme.theme = tL_inputTheme;
                        updatetheme.slug = tL_theme.slug;
                        int i11 = updatetheme.flags;
                        updatetheme.title = n10;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i11 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i11 | 15;
                        }
                        updatetheme.format = "android";
                        npVar.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r4) {
                                    case 0:
                                        final np npVar2 = npVar;
                                        final org.telegram.ui.ActionBar.l6 l6Var2 = l6Var;
                                        final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                        g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z10;
                                                int i12 = r5;
                                                org.telegram.ui.ActionBar.j6 j6Var3 = j6Var2;
                                                org.telegram.ui.ActionBar.l6 l6Var3 = l6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                np npVar3 = npVar2;
                                                switch (i12) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.m6.I1(l6Var3, j6Var3, (TLRPC.TL_theme) tLObject3, npVar3.currentAccount, false);
                                                            npVar3.getNotificationCenter().k(182, l6Var3, j6Var3);
                                                            return;
                                                        }
                                                        npVar3.getNotificationCenter().k(183, l6Var3, j6Var3);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.m6.I1(l6Var3, j6Var3, (TLRPC.TL_theme) tLObject3, npVar3.currentAccount, false);
                                                            if (l6Var3 == org.telegram.ui.ActionBar.m6.J) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            npVar3.m2(l6Var3, j6Var3, z10);
                                                            npVar3.getNotificationCenter().k(182, l6Var3, j6Var3);
                                                            return;
                                                        }
                                                        npVar3.getNotificationCenter().k(183, l6Var3, j6Var3);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final np npVar3 = npVar;
                                        final org.telegram.ui.ActionBar.l6 l6Var3 = l6Var;
                                        final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                        g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                boolean z10;
                                                int i12 = r5;
                                                org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                                org.telegram.ui.ActionBar.l6 l6Var32 = l6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                np npVar32 = npVar3;
                                                switch (i12) {
                                                    case 0:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.m6.I1(l6Var32, j6Var32, (TLRPC.TL_theme) tLObject3, npVar32.currentAccount, false);
                                                            npVar32.getNotificationCenter().k(182, l6Var32, j6Var32);
                                                            return;
                                                        }
                                                        npVar32.getNotificationCenter().k(183, l6Var32, j6Var32);
                                                        return;
                                                    default:
                                                        if (tLObject3 instanceof TLRPC.TL_theme) {
                                                            org.telegram.ui.ActionBar.m6.I1(l6Var32, j6Var32, (TLRPC.TL_theme) tLObject3, npVar32.currentAccount, false);
                                                            if (l6Var32 == org.telegram.ui.ActionBar.m6.J) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            npVar32.m2(l6Var32, j6Var32, z10);
                                                            npVar32.getNotificationCenter().k(182, l6Var32, j6Var32);
                                                            return;
                                                        }
                                                        npVar32.getNotificationCenter().k(183, l6Var32, j6Var32);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.createTheme createtheme = new TL_account.createTheme();
                    createtheme.document = tL_inputDocument;
                    createtheme.flags = 4 | createtheme.flags;
                    if (tL_theme != null && !TextUtils.isEmpty(tL_theme.slug)) {
                        str = tL_theme.slug;
                    }
                    createtheme.slug = str;
                    createtheme.title = n10;
                    if (tL_inputThemeSettings != null) {
                        createtheme.settings = tL_inputThemeSettings;
                        createtheme.flags |= 8;
                    }
                    npVar.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r4) {
                                case 0:
                                    final np npVar2 = npVar;
                                    final org.telegram.ui.ActionBar.l6 l6Var2 = l6Var;
                                    final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                    g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z10;
                                            int i12 = r5;
                                            org.telegram.ui.ActionBar.j6 j6Var32 = j6Var2;
                                            org.telegram.ui.ActionBar.l6 l6Var32 = l6Var2;
                                            TLObject tLObject3 = tLObject2;
                                            np npVar32 = npVar2;
                                            switch (i12) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.m6.I1(l6Var32, j6Var32, (TLRPC.TL_theme) tLObject3, npVar32.currentAccount, false);
                                                        npVar32.getNotificationCenter().k(182, l6Var32, j6Var32);
                                                        return;
                                                    }
                                                    npVar32.getNotificationCenter().k(183, l6Var32, j6Var32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.m6.I1(l6Var32, j6Var32, (TLRPC.TL_theme) tLObject3, npVar32.currentAccount, false);
                                                        if (l6Var32 == org.telegram.ui.ActionBar.m6.J) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        npVar32.m2(l6Var32, j6Var32, z10);
                                                        npVar32.getNotificationCenter().k(182, l6Var32, j6Var32);
                                                        return;
                                                    }
                                                    npVar32.getNotificationCenter().k(183, l6Var32, j6Var32);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final np npVar3 = npVar;
                                    final org.telegram.ui.ActionBar.l6 l6Var3 = l6Var;
                                    final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                    g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z10;
                                            int i12 = r5;
                                            org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                            org.telegram.ui.ActionBar.l6 l6Var32 = l6Var3;
                                            TLObject tLObject3 = tLObject2;
                                            np npVar32 = npVar3;
                                            switch (i12) {
                                                case 0:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.m6.I1(l6Var32, j6Var32, (TLRPC.TL_theme) tLObject3, npVar32.currentAccount, false);
                                                        npVar32.getNotificationCenter().k(182, l6Var32, j6Var32);
                                                        return;
                                                    }
                                                    npVar32.getNotificationCenter().k(183, l6Var32, j6Var32);
                                                    return;
                                                default:
                                                    if (tLObject3 instanceof TLRPC.TL_theme) {
                                                        org.telegram.ui.ActionBar.m6.I1(l6Var32, j6Var32, (TLRPC.TL_theme) tLObject3, npVar32.currentAccount, false);
                                                        if (l6Var32 == org.telegram.ui.ActionBar.m6.J) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        npVar32.m2(l6Var32, j6Var32, z10);
                                                        npVar32.getNotificationCenter().k(182, l6Var32, j6Var32);
                                                        return;
                                                    }
                                                    npVar32.getNotificationCenter().k(183, l6Var32, j6Var32);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                    return;
                }
                g0.g3(new lg(npVar, l6Var, j6Var, 6));
                return;
            case 1:
                np npVar2 = (np) c1Var;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj4;
                vf.b bVar = (vf.b) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    g0.g3(new uj(npVar2, t1Var, bVar, tLObject, g2Var, bundle, 5));
                    return;
                }
                return;
            case 2:
                yv yvVar = (yv) c1Var;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error == null) {
                    g0.g3(new uj(yvVar, context, t1Var2, tLObject, bArr2, user, 8));
                    return;
                }
                yvVar.f28223f.clear();
                g0.g3(new vv(yvVar, context, t1Var2, 1));
                return;
            case 3:
                yv yvVar2 = (yv) c1Var;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                gj gjVar2 = (gj) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat c12 = yvVar2.getMessagesController().c1(Integer.valueOf(encryptedChat2.f28442id));
                    if (c12 == null) {
                        encryptedChat = encryptedChat2;
                    } else {
                        encryptedChat = c12;
                    }
                    if (encryptedChat.key_hash == null) {
                        byte[] bArr3 = encryptedChat.auth_key;
                        Typeface typeface = g0.f24018a;
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(Utilities.n(bArr3), 0, bArr4, 0, 16);
                        encryptedChat.key_hash = bArr4;
                    }
                    if (encryptedChat.key_hash.length == 16) {
                        try {
                            byte[] o4 = Utilities.o(bArr.length, encryptedChat2.auth_key);
                            byte[] bArr5 = new byte[36];
                            System.arraycopy(encryptedChat2.key_hash, 0, bArr5, 0, 16);
                            System.arraycopy(o4, 0, bArr5, 16, 20);
                            encryptedChat.key_hash = bArr5;
                            yvVar2.getMessagesStorage().V1(encryptedChat);
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    yvVar2.f28219a.remove(Integer.valueOf(encryptedChat.f28442id));
                    int i12 = encryptedChat.layer;
                    Typeface typeface2 = g0.f24018a;
                    encryptedChat.layer = (i12 & (-65536)) | 151;
                    ur messagesStorage = yvVar2.getMessagesStorage();
                    messagesStorage.f27250a.c(new aq(messagesStorage, encryptedChat, 2));
                }
                if (tL_error == null) {
                    String str2 = message.attachPath;
                    TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                            message.date = messages_sentencryptedmessage.date;
                        }
                    }
                    if (gjVar2 != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = gjVar2.f24213k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) i5.c.h(1, photo.sizes);
                                String str3 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                                photoSize.location = tL_fileEncryptedLocation;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                                gjVar = gjVar2;
                                tL_fileEncryptedLocation.volume_id = encryptedFile.f28443id;
                                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                                File file = new File(w7.z(4), p5.c.v(str3, ".jpg"));
                                yvVar2.getFileLoader().getClass();
                                file.renameTo(w7.I(photoSize));
                                fc.D().R(str3, photoSize.location.volume_id + "_" + photoSize.location.local_id, gc.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message2);
                                yvVar2.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                            } else {
                                gjVar = gjVar2;
                                if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                                    messageMedia.document = new TLRPC.TL_documentEncrypted();
                                    TLRPC.Document document3 = message2.media.document;
                                    document3.f28440id = encryptedFile.f28443id;
                                    document3.access_hash = encryptedFile.access_hash;
                                    document3.date = document.date;
                                    document3.attributes = document.attributes;
                                    document3.mime_type = document.mime_type;
                                    document3.size = encryptedFile.size;
                                    TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = decryptedMessage.media;
                                    document3.key = decryptedMessageMedia2.key;
                                    document3.iv = decryptedMessageMedia2.iv;
                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                    document3.thumbs = arrayList2;
                                    document3.dc_id = encryptedFile.dc_id;
                                    if (arrayList2.isEmpty()) {
                                        TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                        tL_photoSizeEmpty.type = "s";
                                        message2.media.document.thumbs.add(tL_photoSizeEmpty);
                                    }
                                    String str4 = message2.attachPath;
                                    if (str4 != null && str4.startsWith(w7.z(4).getAbsolutePath())) {
                                        File file2 = new File(message2.attachPath);
                                        w7 fileLoader = yvVar2.getFileLoader();
                                        TLRPC.Document document4 = message2.media.document;
                                        fileLoader.getClass();
                                        if (file2.renameTo(w7.I(document4))) {
                                            gjVar.f24272z0 = gjVar.f24268y0;
                                            gjVar.f24268y0 = false;
                                            message2.attachPath = "";
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(message2);
                                    yvVar2.getMessagesStorage().j1(arrayList3, false, true, false, 0, false, 0, 0L);
                                }
                            }
                            i10 = gjVar.o1();
                        }
                    }
                    yvVar2.getMessagesStorage().f27250a.c(new eg(yvVar2, message, messages_sentencryptedmessage, i10, 16));
                    return;
                }
                yvVar2.getMessagesStorage().N0(0, message);
                g0.g3(new sq(19, yvVar2, message));
                return;
            default:
                g0.g3(new uj((az) c1Var, tLObject, (TLRPC.InputMedia) obj4, (my) obj3, (String) obj2, (gj) obj));
                return;
        }
    }

    public zn(yv yvVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, gj gjVar, String str) {
        this.f28360a = 3;
        this.f28361b = yvVar;
        this.f28362c = decryptedMessage;
        this.d = encryptedChat;
        this.f28363e = message;
        this.f28364f = gjVar;
    }
}
