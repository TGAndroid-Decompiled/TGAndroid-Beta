package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda7;

public final class EmojiView$$ExternalSyntheticLambda18 implements IBlur3Capture {
    public final int $r8$classId;
    public final Object f$0;

    public EmojiView$$ExternalSyntheticLambda18(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        ChatAttachAlert.AttachAlertLayout attachAlertLayout;
        EmojiView$$ExternalSyntheticLambda18 emojiView$$ExternalSyntheticLambda18;
        switch (this.$r8$classId) {
            case 0:
                IBlur3Capture[] iBlur3CaptureArr = (IBlur3Capture[]) this.f$0;
                for (int i = 0; i < 3; i++) {
                    IBlur3Capture iBlur3Capture = iBlur3CaptureArr[i];
                    if (iBlur3Capture != null) {
                        iBlur3Capture.capture(canvas, rectF);
                    }
                }
                break;
            case 1:
                ((ChannelAdminLogActivity.AnonymousClass5) this.f$0).drawList(canvas, rectF);
                break;
            case 2:
                int i2 = 0;
                while (true) {
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                    if (i2 >= 2) {
                        chatAttachAlert.getClass();
                    } else {
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout2 = i2 == 0 ? chatAttachAlert.currentAttachLayout : chatAttachAlert.nextAttachLayout;
                        if (attachAlertLayout2 != null && attachAlertLayout2.iBlur3Capture != null && attachAlertLayout2.getVisibility() == 0) {
                            Blur3Utils.captureRelativeParent(attachAlertLayout2.iBlur3Capture, canvas, rectF, attachAlertLayout2.iBlur3CaptureView, chatAttachAlert.getContainerView(), (int) (((i2 == 0 && (attachAlertLayout = chatAttachAlert.nextAttachLayout) != null && attachAlertLayout.getVisibility() == 0) ? (1.0f - chatAttachAlert.nextAttachLayout.getAlpha()) * attachAlertLayout2.getAlpha() : attachAlertLayout2.getAlpha()) * 255.0f));
                        }
                        i2++;
                    }
                    break;
                }
                break;
            case 3:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.f$0;
                for (SharedMediaLayout.MediaPage mediaPage : sharedMediaLayout.mediaPages) {
                    ViewGroupPartRenderer viewGroupPartRenderer = mediaPage.iBlur3Capture;
                    if (viewGroupPartRenderer != null) {
                        viewGroupPartRenderer.capture(canvas, rectF);
                    }
                }
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = sharedMediaLayout.giftsContainer;
                if (anonymousClass13 != null && (emojiView$$ExternalSyntheticLambda18 = anonymousClass13.iBlur3Capture) != null) {
                    emojiView$$ExternalSyntheticLambda18.capture(canvas, rectF);
                    break;
                }
                break;
            case 4:
                ProfileGiftsContainer profileGiftsContainer = (ProfileGiftsContainer) this.f$0;
                for (View view : profileGiftsContainer.viewPager.getViewPages()) {
                    if (view instanceof ProfileGiftsContainer.Page) {
                        ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) view;
                        if (page.iBlur3Capture == null) {
                            ViewGroup viewGroup = profileGiftsContainer.iBlur3CaptureParent;
                            ProfileGiftsContainer.Page.AnonymousClass1 anonymousClass1 = page.listView;
                            Objects.requireNonNull(anonymousClass1);
                            page.iBlur3Capture = new ViewGroupPartRenderer(anonymousClass1, viewGroup, new TopicsFragment$$ExternalSyntheticLambda7(anonymousClass1, 7));
                        }
                        page.iBlur3Capture.capture(canvas, rectF);
                    }
                }
                break;
            case 5:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f$0;
                RecyclerListView recyclerListView = premiumPreviewFragment.listView;
                Blur3Utils.captureRelativeParent(recyclerListView, canvas, rectF, recyclerListView, premiumPreviewFragment.contentView, 255);
                break;
            default:
                SelectAudioAlert selectAudioAlert = (SelectAudioAlert) this.f$0;
                ViewGroup containerView = selectAudioAlert.getContainerView();
                RecyclerListView recyclerListView2 = selectAudioAlert.recyclerListView;
                Blur3Utils.captureRelativeParent(recyclerListView2, canvas, rectF, recyclerListView2, containerView, 255);
                break;
        }
    }

    @Override
    public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
        switch (this.$r8$classId) {
            case 0:
                blur3HashImpl.unsupported = true;
                break;
            case 1:
                blur3HashImpl.unsupported = true;
                break;
            case 2:
                blur3HashImpl.unsupported = true;
                break;
            case 3:
                blur3HashImpl.unsupported = true;
                break;
            case 4:
                blur3HashImpl.unsupported = true;
                break;
            case 5:
                blur3HashImpl.unsupported = true;
                break;
            default:
                blur3HashImpl.unsupported = true;
                break;
        }
    }
}
