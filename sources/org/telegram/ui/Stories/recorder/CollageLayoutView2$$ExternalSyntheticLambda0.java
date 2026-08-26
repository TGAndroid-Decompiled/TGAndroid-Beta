package org.telegram.ui.Stories.recorder;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionPhotoDrawable;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;

public final class CollageLayoutView2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CollageLayoutView2 f$0;

    public CollageLayoutView2$$ExternalSyntheticLambda0(CollageLayoutView2 collageLayoutView2, int i) {
        this.$r8$classId = i;
        this.f$0 = collageLayoutView2;
    }

    @Override
    public final void run() {
        VideoScreenPreview.AnonymousClass3 anonymousClass3;
        long j;
        VideoScreenPreview.AnonymousClass3 anonymousClass4;
        boolean z;
        float f;
        CollageLayout collageLayout;
        VideoScreenPreview.AnonymousClass3 anonymousClass5;
        switch (this.$r8$classId) {
            case 0:
                CollageLayoutView2 collageLayoutView2 = this.f$0;
                if (!collageLayoutView2.reorderingTouch && !collageLayoutView2.preview) {
                    CollageLayoutView2.Part part = collageLayoutView2.longPressedPart;
                    if (part != null && (anonymousClass3 = part.videoPlayer) != null) {
                        anonymousClass3.setVolume(0.0f);
                    }
                    CollageLayoutView2.Part part2 = collageLayoutView2.pressedPart;
                    collageLayoutView2.longPressedPart = part2;
                    if (part2 != null && part2.content != null) {
                        Runnable runnable = collageLayoutView2.cancelGestures;
                        if (runnable != null) {
                            runnable.run();
                        }
                        CollageLayoutView2.Part part3 = collageLayoutView2.longPressedPart;
                        VideoScreenPreview.AnonymousClass3 anonymousClass6 = part3.videoPlayer;
                        if (anonymousClass6 != null) {
                            anonymousClass6.setVolume(part3.content.videoVolume);
                        }
                        FrameLayout frameLayout = new FrameLayout(collageLayoutView2.getContext());
                        ImageView imageView = new ImageView(collageLayoutView2.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(collageLayoutView2.getContext());
                        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(collageLayoutView2.containerView, collageLayoutView2.resourcesProvider, collageLayoutView2);
                        if (collageLayoutView2.longPressedPart.content.isVideo) {
                            SliderView sliderView = new SliderView(collageLayoutView2.getContext(), 0);
                            sliderView.minVolume = 0.0f;
                            sliderView.maxVolume = 1.5f;
                            sliderView.setValue(collageLayoutView2.longPressedPart.content.videoVolume);
                            sliderView.onValueChange = new VoIPFragment$$ExternalSyntheticLambda7(collageLayoutView2, 12);
                            sliderView.fixWidth = AndroidUtilities.dp(220.0f);
                            itemOptionsMakeOptions.addView(sliderView);
                            itemOptionsMakeOptions.addSpaceGap$1();
                        }
                        itemOptionsMakeOptions.fixedWidthDp = 220;
                        itemOptionsMakeOptions.add(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new CollageLayoutView2$$ExternalSyntheticLambda0(collageLayoutView2, 4), false);
                        itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new CollageLayoutView2$$ExternalSyntheticLambda0(collageLayoutView2, 5), true);
                        itemOptionsMakeOptions.addSpaceGap$1();
                        itemOptionsMakeOptions.addView(frameLayout, LayoutHelper.createLinear(220, -2));
                        itemOptionsMakeOptions.dismissListener = new VoIPFragment$$ExternalSyntheticLambda31(6);
                        itemOptionsMakeOptions.gravity = 1;
                        itemOptionsMakeOptions.allowCenter = true;
                        itemOptionsMakeOptions.blur = true;
                        itemOptionsMakeOptions.blurForMenu = false;
                        int iDp = AndroidUtilities.dp(12.0f);
                        int iDp2 = AndroidUtilities.dp(10.0f);
                        itemOptionsMakeOptions.scrimViewRoundRadius = iDp;
                        itemOptionsMakeOptions.scrimViewPadding = iDp2;
                        itemOptionsMakeOptions.dismissListener = new CollageLayoutView2$$ExternalSyntheticLambda0(collageLayoutView2, 6);
                        itemOptionsMakeOptions.show();
                        try {
                            collageLayoutView2.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                this.f$0.invalidate();
                break;
            case 2:
                CollageLayoutView2 collageLayoutView3 = this.f$0;
                if (collageLayoutView3.reordering) {
                    collageLayoutView3.reordering = false;
                    collageLayoutView3.invalidate();
                }
                break;
            case 3:
                CollageLayoutView2 collageLayoutView4 = this.f$0;
                long position = collageLayoutView4.getPosition();
                CollageLayoutView2.Part mainPart = collageLayoutView4.getMainPart();
                if (mainPart == null) {
                    j = 0;
                } else {
                    StoryEntry storyEntry = mainPart.content;
                    j = storyEntry.videoOffset + ((long) (storyEntry.videoLeft * storyEntry.duration));
                }
                for (int i = 0; i < collageLayoutView4.parts.size(); i++) {
                    CollageLayoutView2.Part part4 = (CollageLayoutView2.Part) collageLayoutView4.parts.get(i);
                    if (part4.content != null && (anonymousClass4 = part4.videoPlayer) != null) {
                        long duration = anonymousClass4.getDuration();
                        long jClamp = Utilities.clamp((position + j) - part4.content.videoOffset, duration, 0L);
                        if (!collageLayoutView4.preview || collageLayoutView4.playing) {
                            float f2 = jClamp;
                            StoryEntry storyEntry2 = part4.content;
                            float f3 = duration;
                            if (f2 <= storyEntry2.videoLeft * f3 || f2 >= storyEntry2.videoRight * f3) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        StoryEntry storyEntry3 = part4.content;
                        float f4 = duration;
                        long jClamp2 = Utilities.clamp(jClamp, (long) (storyEntry3.videoRight * f4), (long) (storyEntry3.videoLeft * f4));
                        if (part4.videoPlayer.isPlaying() != z) {
                            if (z) {
                                part4.videoPlayer.play();
                            } else {
                                part4.videoPlayer.pause();
                            }
                        }
                        VideoScreenPreview.AnonymousClass3 anonymousClass7 = part4.videoPlayer;
                        if (collageLayoutView4.isMuted) {
                            f = 0.0f;
                        } else {
                            StoryEntry storyEntry4 = part4.content;
                            if (storyEntry4.muted || !collageLayoutView4.preview) {
                                f = 0.0f;
                            } else {
                                f = storyEntry4.videoVolume;
                            }
                        }
                        anonymousClass7.setVolume(f);
                        if (Math.abs((part4.pendingSeek >= 0 ? part4.pendingSeek : part4.videoPlayer.getCurrentPosition()) - jClamp2) > 450 && part4.pendingSeek < 0) {
                            VideoScreenPreview.AnonymousClass3 anonymousClass8 = part4.videoPlayer;
                            part4.pendingSeek = jClamp2;
                            anonymousClass8.seekTo(jClamp2, collageLayoutView4.fastSeek, new VoIPFragment$12$$ExternalSyntheticLambda0(part4, 1));
                        }
                    }
                }
                TimelineView timelineView = collageLayoutView4.timelineView;
                if (timelineView != null) {
                    timelineView.setProgress(position);
                }
                PreviewView previewView = collageLayoutView4.previewView;
                if (previewView != null) {
                    previewView.updateAudioPlayer(true);
                    collageLayoutView4.previewView.updateRoundPlayer(true);
                }
                if (collageLayoutView4.preview && collageLayoutView4.playing) {
                    AndroidUtilities.runOnUIThread(collageLayoutView4.syncRunnable, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    break;
                }
                break;
            case 4:
                CollageLayoutView2 collageLayoutView5 = this.f$0;
                CollageLayoutView2.Part part5 = collageLayoutView5.longPressedPart;
                if (part5 != null) {
                    part5.setContent(null);
                    collageLayoutView5.updatePartsState();
                    collageLayoutView5.invalidate();
                    Runnable runnable2 = collageLayoutView5.onResetState;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    break;
                }
                break;
            case 5:
                CollageLayoutView2 collageLayoutView6 = this.f$0;
                CollageLayoutView2.Part part6 = collageLayoutView6.longPressedPart;
                if (part6 != null && collageLayoutView6.parts.indexOf(part6) >= 0) {
                    CollageLayout collageLayout2 = collageLayoutView6.currentLayout;
                    int iIndexOf = collageLayout2.parts.indexOf(part6.part);
                    if (iIndexOf >= 0) {
                        ArrayList arrayList = collageLayout2.parts;
                        if (iIndexOf >= arrayList.size()) {
                            collageLayout = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            arrayList2.remove(iIndexOf);
                            StringBuilder sb = new StringBuilder();
                            int i2 = 0;
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                CollageLayout.Part part7 = (CollageLayout.Part) arrayList2.get(i3);
                                if (part7.y != i2) {
                                    sb.append("/");
                                    i2 = part7.y;
                                }
                                sb.append(".");
                            }
                            collageLayout = new CollageLayout(sb.toString());
                        }
                    } else {
                        collageLayout = null;
                    }
                    if (collageLayout.parts.size() <= 1) {
                        collageLayoutView6.clear$2();
                        collageLayoutView6.invalidate();
                    }
                    collageLayoutView6.setLayout(collageLayout);
                    collageLayoutView6.reordering = true;
                    collageLayoutView6.updatePartsState();
                    collageLayoutView6.invalidate();
                    Runnable runnable3 = collageLayoutView6.onResetState;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.collageListView.setVisible(false, true);
                    if (collageLayout.parts.size() > 1) {
                        CollageLayoutButton collageLayoutButton = storyRecorder.collageButton;
                        storyRecorder.lastCollageLayout = collageLayout;
                        collageLayoutButton.setIcon(new MotionPhotoDrawable(collageLayout, false), true);
                        storyRecorder.collageButton.setSelected(true, true);
                    } else {
                        storyRecorder.collageButton.setSelected(false, true);
                    }
                    storyRecorder.updateActionBarButtons(true);
                    StoryRecorder.AnonymousClass19 anonymousClass19 = storyRecorder.galleryListView;
                    if (anonymousClass19 != null) {
                        anonymousClass19.setMultipleOnClick(storyRecorder.collageLayoutView.hasLayout());
                        storyRecorder.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - storyRecorder.collageLayoutView.getFilledCount()));
                    }
                }
                break;
            default:
                CollageLayoutView2.Part part8 = this.f$0.longPressedPart;
                if (part8 != null && (anonymousClass5 = part8.videoPlayer) != null) {
                    anonymousClass5.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
