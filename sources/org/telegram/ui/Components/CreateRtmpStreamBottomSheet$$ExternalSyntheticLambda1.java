package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final CreateRtmpStreamBottomSheet f$0;
    public final ButtonWithCounterView f$1;

    public CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ButtonWithCounterView buttonWithCounterView, int i) {
        this.$r8$classId = i;
        this.f$0 = createRtmpStreamBottomSheet;
        this.f$1 = buttonWithCounterView;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = this.f$0;
                createRtmpStreamBottomSheet.getClass();
                final ButtonWithCounterView buttonWithCounterView = this.f$1;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet2 = createRtmpStreamBottomSheet;
                                createRtmpStreamBottomSheet2.getClass();
                                buttonWithCounterView.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    createRtmpStreamBottomSheet2.rtmpUrl = groupcallstreamrtmpurl.url;
                                    createRtmpStreamBottomSheet2.rtmpKey = groupcallstreamrtmpurl.key;
                                    createRtmpStreamBottomSheet2.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet2.rtmpKey);
                                    createRtmpStreamBottomSheet2.adapter.update(true);
                                }
                                break;
                            default:
                                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet3 = createRtmpStreamBottomSheet;
                                createRtmpStreamBottomSheet3.getClass();
                                buttonWithCounterView.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null && (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    createRtmpStreamBottomSheet3.rtmpUrl = groupcallstreamrtmpurl2.url;
                                    createRtmpStreamBottomSheet3.rtmpKey = groupcallstreamrtmpurl2.key;
                                    createRtmpStreamBottomSheet3.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet3.rtmpKey);
                                    createRtmpStreamBottomSheet3.adapter.update(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet2 = this.f$0;
                createRtmpStreamBottomSheet2.getClass();
                final ButtonWithCounterView buttonWithCounterView2 = this.f$1;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet3 = createRtmpStreamBottomSheet2;
                                createRtmpStreamBottomSheet3.getClass();
                                buttonWithCounterView2.setLoading(false);
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    createRtmpStreamBottomSheet3.rtmpUrl = groupcallstreamrtmpurl.url;
                                    createRtmpStreamBottomSheet3.rtmpKey = groupcallstreamrtmpurl.key;
                                    createRtmpStreamBottomSheet3.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet3.rtmpKey);
                                    createRtmpStreamBottomSheet3.adapter.update(true);
                                }
                                break;
                            default:
                                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet4 = createRtmpStreamBottomSheet2;
                                createRtmpStreamBottomSheet4.getClass();
                                buttonWithCounterView2.setLoading(false);
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null && (tLObject3 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject3;
                                    createRtmpStreamBottomSheet4.rtmpUrl = groupcallstreamrtmpurl2.url;
                                    createRtmpStreamBottomSheet4.rtmpKey = groupcallstreamrtmpurl2.key;
                                    createRtmpStreamBottomSheet4.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet4.rtmpKey);
                                    createRtmpStreamBottomSheet4.adapter.update(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
