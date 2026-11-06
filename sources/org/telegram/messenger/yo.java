package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yo {
    public final long f26673a;
    public boolean f26676e;
    public final qp h;
    public final ArrayList f26674b = new ArrayList();
    public boolean f26675c = true;
    public boolean d = false;
    public int f26677f = -1;
    public int f26678g = -1;

    public yo(qp qpVar, long j3) {
        this.h = qpVar;
        this.f26673a = j3;
    }

    public final void a(final int i7, final int i10) {
        if (!this.f26676e && i10 > 0 && i7 >= 0) {
            if (i10 != this.f26678g || i7 != this.f26677f) {
                this.f26676e = true;
                this.f26677f = i7;
                this.f26678g = i10;
                long j3 = this.f26673a;
                int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                qp qpVar = this.h;
                if (i11 >= 0) {
                    TLRPC.User a22 = qpVar.a2(Long.valueOf(j3));
                    if (a22 == null) {
                        this.f26676e = false;
                        return;
                    }
                    TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                    tL_photos_getUserPhotos.offset = i7;
                    tL_photos_getUserPhotos.limit = i10;
                    tL_photos_getUserPhotos.max_id = 0L;
                    tL_photos_getUserPhotos.user_id = qpVar.q1(a22);
                    qpVar.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) {
                        public final yo f26495b;

                        {
                            this.f26495b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    if (tL_error == null) {
                                        TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                        yo yoVar = this.f26495b;
                                        yoVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                        g0.h3(new l2.a0(yoVar, photos_photos, i7, i10, 5));
                                        return;
                                    }
                                    return;
                                default:
                                    if (tL_error == null) {
                                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                        yo yoVar2 = this.f26495b;
                                        yoVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                        g0.h3(new l2.a0(yoVar2, messages_messages, i7, i10, 6));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
                tL_messages_search.add_offset = i7;
                tL_messages_search.limit = i10;
                tL_messages_search.offset_id = 0;
                tL_messages_search.f27063q = "";
                tL_messages_search.peer = qpVar.j1(j3);
                qpVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) {
                    public final yo f26495b;

                    {
                        this.f26495b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                    yo yoVar = this.f26495b;
                                    yoVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                    g0.h3(new l2.a0(yoVar, photos_photos, i7, i10, 5));
                                    return;
                                }
                                return;
                            default:
                                if (tL_error == null) {
                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                    yo yoVar2 = this.f26495b;
                                    yoVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                    g0.h3(new l2.a0(yoVar2, messages_messages, i7, i10, 6));
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b(int i7, boolean z9) {
        ArrayList arrayList = this.f26674b;
        int i10 = 0;
        if (arrayList.isEmpty()) {
            a(0, 80);
            return;
        }
        if (i7 < 0) {
            i7 += arrayList.size();
        }
        if (i7 >= arrayList.size()) {
            i7 -= arrayList.size();
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) == null) {
                    if (z9) {
                        while (arrayList.get(i7) != null) {
                            i7++;
                            if (i7 >= arrayList.size()) {
                                i7 = 0;
                            }
                        }
                        while (i10 <= 80) {
                            int i12 = i7 + i10;
                            if (i12 >= arrayList.size() || arrayList.get(i12) != null) {
                                break;
                            }
                            i10++;
                        }
                        if (i10 > 0) {
                            a(i7, i10);
                            return;
                        }
                        return;
                    }
                    while (arrayList.get(i7) != null) {
                        i7--;
                        if (i7 < 0) {
                            i7 = arrayList.size() - 1;
                        }
                    }
                    while (i10 <= 80) {
                        int i13 = i7 - i10;
                        if (i13 < 0 || arrayList.get(i13) != null) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 > 0) {
                        a(i7 - i10, i10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f26674b;
            if (i7 < arrayList.size()) {
                arrayList.add(0, (TLRPC.Photo) arrayList.remove(i7));
                g();
                this.h.getNotificationCenter().k(qs.f24976e3, this);
            }
        }
    }

    public final void d(int i7, int i10, TLRPC.photos_Photos photos_photos) {
        boolean z9;
        TLRPC.Photo photo;
        boolean z10 = this.d;
        this.f26676e = false;
        this.d = true;
        this.f26675c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.f26674b;
        if (max == arrayList.size() && i7 + i10 <= arrayList.size()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            int i11 = 0;
            while (true) {
                if (i11 >= photos_photos.photos.size()) {
                    break;
                }
                int i12 = i7 + i11;
                if (arrayList.get(i12) != null && ((TLRPC.Photo) arrayList.get(i12)).f26976id != photos_photos.photos.get(i11).f26976id) {
                    z9 = true;
                    break;
                }
                i11++;
            }
        }
        if (z9) {
            arrayList.clear();
            for (int i13 = 0; i13 < photos_photos.count; i13++) {
                int i14 = i13 - i7;
                if (i14 >= 0 && i14 < photos_photos.photos.size()) {
                    photo = photos_photos.photos.get(i14);
                } else {
                    photo = null;
                }
                arrayList.add(photo);
            }
        } else {
            for (int i15 = 0; i15 < photos_photos.photos.size(); i15++) {
                arrayList.set(i7 + i15, photos_photos.photos.get(i15));
            }
        }
        g();
        this.h.getNotificationCenter().k(qs.f24976e3, this);
        if (!z10 && i7 == 0 && i10 < arrayList.size() && arrayList.size() - i10 > 80) {
            a(arrayList.size() - 80, 80);
        }
    }

    public final void e(long j3) {
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f26674b;
            if (i7 >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i7);
            if (photo != null && photo.f26976id == j3) {
                arrayList.remove(i7);
                i7--;
                z9 = true;
            }
            i7++;
        }
        if (z9) {
            g();
            this.h.getNotificationCenter().k(qs.f24976e3, this);
        }
    }

    public final void f() {
        this.f26674b.clear();
        this.f26677f = -1;
        this.f26678g = -1;
        this.f26675c = true;
        g();
    }

    public final void g() {
        this.h.getMessagesStorage().f26688a.c(new wo(this, 1));
    }
}
