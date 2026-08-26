package org.telegram.ui.Adapters;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class DialogsAdapter$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final int f$1;

    public DialogsAdapter$$ExternalSyntheticLambda0(MessagesController messagesController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$1 = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.$r8$classId) {
            case 0:
                Long lValueOf = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                MessagesController messagesController = this.f$0;
                TLRPC.User user = messagesController.getUser(lValueOf);
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i7 = this.f$1;
                if (user == null) {
                    i = 0;
                } else if (user.self) {
                    i = i7 + 50000;
                } else {
                    TLRPC.UserStatus userStatus = user.status;
                    if (userStatus != null) {
                        i = userStatus.expires;
                    } else {
                        i = 0;
                    }
                }
                if (user2 == null) {
                    i2 = 0;
                } else if (user2.self) {
                    i2 = i7 + 50000;
                } else {
                    TLRPC.UserStatus userStatus2 = user2.status;
                    if (userStatus2 != null) {
                        i2 = userStatus2.expires;
                    } else {
                        i2 = 0;
                    }
                }
                if (i > 0 && i2 > 0) {
                    if (i <= i2) {
                        if (i < i2) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i < 0 && i2 < 0) {
                    if (i <= i2) {
                        if (i < i2) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i >= 0 || i2 <= 0) && (i != 0 || i2 == 0)) {
                    return (i2 < 0 || i != 0) ? 1 : 0;
                }
                return -1;
            case 1:
                Long lValueOf2 = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                MessagesController messagesController2 = this.f$0;
                TLRPC.User user3 = messagesController2.getUser(lValueOf2);
                TLRPC.User user4 = messagesController2.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i8 = this.f$1;
                if (user3 == null) {
                    i3 = 0;
                } else if (user3.self) {
                    i3 = i8 + 50000;
                } else {
                    TLRPC.UserStatus userStatus3 = user3.status;
                    if (userStatus3 != null) {
                        i3 = userStatus3.expires;
                    } else {
                        i3 = 0;
                    }
                }
                if (user4 == null) {
                    i4 = 0;
                } else if (user4.self) {
                    i4 = i8 + 50000;
                } else {
                    TLRPC.UserStatus userStatus4 = user4.status;
                    if (userStatus4 != null) {
                        i4 = userStatus4.expires;
                    } else {
                        i4 = 0;
                    }
                }
                if (i3 > 0 && i4 > 0) {
                    if (i3 <= i4) {
                        if (i3 < i4) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i3 < 0 && i4 < 0) {
                    if (i3 <= i4) {
                        if (i3 < i4) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i3 >= 0 || i4 <= 0) && (i3 != 0 || i4 == 0)) {
                    return ((i4 >= 0 || i3 <= 0) && (i4 != 0 || i3 == 0)) ? 0 : 1;
                }
                return -1;
            default:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                boolean z = tLObject2 instanceof TLRPC.TL_contact;
                MessagesController messagesController3 = this.f$0;
                TLRPC.User user5 = z ? messagesController3.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User user6 = tLObject instanceof TLRPC.TL_contact ? messagesController3.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                int i9 = this.f$1;
                if (user5 == null) {
                    i5 = 0;
                } else if (user5.self) {
                    i5 = i9 + 50000;
                } else {
                    TLRPC.UserStatus userStatus5 = user5.status;
                    if (userStatus5 != null) {
                        i5 = userStatus5.expires;
                    } else {
                        i5 = 0;
                    }
                }
                if (user6 == null) {
                    i6 = 0;
                } else if (user6.self) {
                    i6 = i9 + 50000;
                } else {
                    TLRPC.UserStatus userStatus6 = user6.status;
                    if (userStatus6 != null) {
                        i6 = userStatus6.expires;
                    } else {
                        i6 = 0;
                    }
                }
                if (i5 > 0 && i6 > 0) {
                    if (i5 <= i6) {
                        if (i5 < i6) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i5 < 0 && i6 < 0) {
                    if (i5 <= i6) {
                        if (i5 < i6) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i5 >= 0 || i6 <= 0) && (i5 != 0 || i6 == 0)) {
                    return (i6 < 0 || i5 != 0) ? 1 : 0;
                }
                return -1;
        }
    }
}
