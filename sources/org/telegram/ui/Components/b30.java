package org.telegram.ui.Components;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class b30 implements Comparator {

    public final int f26903a;

    public final MessagesController f26904b;

    public final int f26905c;

    public b30(MessagesController messagesController, int i10, int i11) {
        this.f26903a = i11;
        this.f26904b = messagesController;
        this.f26905c = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f26903a) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                boolean z10 = tLObject2 instanceof TLRPC.TL_contact;
                MessagesController messagesController = this.f26904b;
                TLRPC.User user = z10 ? messagesController.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User user2 = tLObject instanceof TLRPC.TL_contact ? messagesController.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                int i16 = this.f26905c;
                if (user == null) {
                    i10 = 0;
                } else if (user.self) {
                    i10 = i16 + 50000;
                } else {
                    TLRPC.UserStatus userStatus = user.status;
                    if (userStatus != null) {
                        i10 = userStatus.expires;
                    } else {
                        i10 = 0;
                    }
                }
                if (user2 == null) {
                    i11 = 0;
                } else if (user2.self) {
                    i11 = i16 + 50000;
                } else {
                    TLRPC.UserStatus userStatus2 = user2.status;
                    if (userStatus2 != null) {
                        i11 = userStatus2.expires;
                    } else {
                        i11 = 0;
                    }
                }
                if (i10 > 0 && i11 > 0) {
                    if (i10 <= i11) {
                        if (i10 < i11) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i10 < 0 && i11 < 0) {
                    if (i10 <= i11) {
                        if (i10 < i11) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i10 >= 0 || i11 <= 0) && (i10 != 0 || i11 == 0)) {
                    return (i11 < 0 || i10 != 0) ? 1 : 0;
                }
                return -1;
            case 1:
                Long lValueOf = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                MessagesController messagesController2 = this.f26904b;
                TLRPC.User user3 = messagesController2.getUser(lValueOf);
                TLRPC.User user4 = messagesController2.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i17 = this.f26905c;
                if (user3 == null) {
                    i12 = 0;
                } else if (user3.self) {
                    i12 = i17 + 50000;
                } else {
                    TLRPC.UserStatus userStatus3 = user3.status;
                    if (userStatus3 != null) {
                        i12 = userStatus3.expires;
                    } else {
                        i12 = 0;
                    }
                }
                if (user4 == null) {
                    i13 = 0;
                } else if (user4.self) {
                    i13 = i17 + 50000;
                } else {
                    TLRPC.UserStatus userStatus4 = user4.status;
                    if (userStatus4 != null) {
                        i13 = userStatus4.expires;
                    } else {
                        i13 = 0;
                    }
                }
                if (i12 > 0 && i13 > 0) {
                    if (i12 <= i13) {
                        if (i12 < i13) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i12 < 0 && i13 < 0) {
                    if (i12 <= i13) {
                        if (i12 < i13) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i12 >= 0 || i13 <= 0) && (i12 != 0 || i13 == 0)) {
                    return ((i13 >= 0 || i12 <= 0) && (i13 != 0 || i12 == 0)) ? 0 : 1;
                }
                return -1;
            default:
                Long lValueOf2 = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                MessagesController messagesController3 = this.f26904b;
                TLRPC.User user5 = messagesController3.getUser(lValueOf2);
                TLRPC.User user6 = messagesController3.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i18 = this.f26905c;
                if (user5 == null) {
                    i14 = 0;
                } else if (user5.self) {
                    i14 = i18 + 50000;
                } else {
                    TLRPC.UserStatus userStatus5 = user5.status;
                    if (userStatus5 != null) {
                        i14 = userStatus5.expires;
                    } else {
                        i14 = 0;
                    }
                }
                if (user6 == null) {
                    i15 = 0;
                } else if (user6.self) {
                    i15 = i18 + 50000;
                } else {
                    TLRPC.UserStatus userStatus6 = user6.status;
                    if (userStatus6 != null) {
                        i15 = userStatus6.expires;
                    } else {
                        i15 = 0;
                    }
                }
                if (i14 > 0 && i15 > 0) {
                    if (i14 <= i15) {
                        if (i14 < i15) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i14 < 0 && i15 < 0) {
                    if (i14 <= i15) {
                        if (i14 < i15) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i14 >= 0 || i15 <= 0) && (i14 != 0 || i15 == 0)) {
                    return (i15 < 0 || i14 != 0) ? 1 : 0;
                }
                return -1;
        }
    }
}
