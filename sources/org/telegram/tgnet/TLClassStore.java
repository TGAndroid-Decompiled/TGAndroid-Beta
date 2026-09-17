package org.telegram.tgnet;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public class TLClassStore {
    static TLClassStore store;
    private SparseArray<TLObjectFactory> classStore;

    public interface TLObjectFactory {
        TLObject create();
    }

    public TLClassStore() {
        SparseArray<TLObjectFactory> sparseArray = new SparseArray<>();
        this.classStore = sparseArray;
        sparseArray.put(-994444869, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1930838368, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(-1848883596, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(467867529, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(541931640, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(917541342, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(-1438109059, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(528568095, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1431655930, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1431655929, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1431655928, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1431655927, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1450380236, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1299050149, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1957577280, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(826001400, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(2027216577, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(1918567619, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(-1877614335, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
        this.classStore.put(-484987010, new TLObjectFactory() {
            @Override
            public final TLObject create() {
                switch (r1) {
                    case 0:
                        return new TLRPC.TL_error();
                    case 1:
                        return new TLRPC.TL_updatesTooLong();
                    case 2:
                        return new TLRPC.TL_decryptedMessageService();
                    case 3:
                        return new TLRPC.TL_decryptedMessage();
                    case 4:
                        return new TLRPC.TL_decryptedMessageLayer();
                    case 5:
                        return new TLRPC.TL_decryptedMessage_layer45();
                    case 6:
                        return new TLRPC.TL_decryptedMessageService_layer8();
                    case 7:
                        return new TLRPC.TL_decryptedMessage_layer8();
                    case 8:
                        return new TLRPC.TL_message_secret();
                    case 9:
                        return new TLRPC.TL_message_secret_layer72();
                    case 10:
                        return new TLRPC.TL_message_secret_old();
                    case 11:
                        return new TLRPC.TL_messageEncryptedAction();
                    case 12:
                        return new TLRPC.TL_null();
                    case 13:
                        return new TLRPC.TL_updateShortChatMessage();
                    case 14:
                        return new TLRPC.TL_updates();
                    case 15:
                        return new TLRPC.TL_updateShortMessage();
                    case 16:
                        return new TLRPC.TL_updateShort();
                    case 17:
                        return new TLRPC.TL_updatesCombined();
                    default:
                        return new TLRPC.TL_updateShortSentMessage();
                }
            }
        });
    }

    public static TLClassStore Instance() {
        if (store == null) {
            store = new TLClassStore();
        }
        return store;
    }

    public TLObject TLdeserialize(NativeByteBuffer nativeByteBuffer, int i10, boolean z10) {
        TLObjectFactory tLObjectFactory = this.classStore.get(i10);
        if (tLObjectFactory != null) {
            TLObject create = tLObjectFactory.create();
            create.readParams(nativeByteBuffer, z10);
            return create;
        }
        return null;
    }
}
