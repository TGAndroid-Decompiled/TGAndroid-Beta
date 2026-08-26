package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.DebugRecordingCanvas;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;

public class DebugRecordingCanvasReplayFragment extends BaseFragment {
    private FrameLayout contentView;
    private int currentFrame;
    private final DebugRecordingCanvas debugRecordingCanvas;
    private final Choreographer.FrameCallback frameCallback;
    private int framesCount;
    private boolean isPlaying;
    private ImageButton playButton;
    private View replayView;
    private SeekBarView seekBarView;

    public DebugRecordingCanvasReplayFragment(DebugRecordingCanvas debugRecordingCanvas) {
        super(null);
        this.currentFrame = 0;
        this.isPlaying = false;
        this.frameCallback = new Choreographer.FrameCallback() {
            @Override
            public void doFrame(long j) {
                if (DebugRecordingCanvasReplayFragment.this.isPlaying) {
                    DebugRecordingCanvasReplayFragment.access$108(DebugRecordingCanvasReplayFragment.this);
                    if (DebugRecordingCanvasReplayFragment.this.currentFrame > DebugRecordingCanvasReplayFragment.this.framesCount) {
                        DebugRecordingCanvasReplayFragment.this.currentFrame = 0;
                        DebugRecordingCanvasReplayFragment.this.isPlaying = false;
                    }
                    DebugRecordingCanvasReplayFragment.this.seekBarView.setProgress(DebugRecordingCanvasReplayFragment.this.currentFrame / DebugRecordingCanvasReplayFragment.this.framesCount);
                    DebugRecordingCanvasReplayFragment.this.replayView.invalidate();
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        };
        throw null;
    }

    public static int access$108(DebugRecordingCanvasReplayFragment debugRecordingCanvasReplayFragment) {
        int i = debugRecordingCanvasReplayFragment.currentFrame;
        debugRecordingCanvasReplayFragment.currentFrame = i + 1;
        return i;
    }

    public static DebugRecordingCanvas access$500(DebugRecordingCanvasReplayFragment debugRecordingCanvasReplayFragment) {
        debugRecordingCanvasReplayFragment.getClass();
        return null;
    }

    public void lambda$createView$0(View view) {
        togglePlayback();
    }

    private void startPlayback() {
        this.isPlaying = true;
        this.currentFrame = 0;
        updatePlayButtonIcon();
        Choreographer.getInstance().postFrameCallback(this.frameCallback);
    }

    public void stopPlayback() {
        this.isPlaying = false;
        Choreographer.getInstance().removeFrameCallback(this.frameCallback);
        updatePlayButtonIcon();
    }

    private void togglePlayback() {
        if (this.isPlaying) {
            stopPlayback();
        } else {
            startPlayback();
        }
    }

    private void updatePlayButtonIcon() {
        ImageButton imageButton = this.playButton;
        if (imageButton == null) {
            return;
        }
        imageButton.setImageResource(this.isPlaying ? 17301539 : 17301540);
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentView = frameLayout;
        this.fragmentView = frameLayout;
        View view = new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                Trace.beginSection("render_" + DebugRecordingCanvasReplayFragment.this.currentFrame + "_" + DebugRecordingCanvasReplayFragment.this.framesCount);
                super.onDraw(canvas);
                if (!DebugRecordingCanvasReplayFragment.this.isPlaying) {
                    invalidate();
                }
                if (DebugRecordingCanvasReplayFragment.this.currentFrame == DebugRecordingCanvasReplayFragment.this.framesCount) {
                    DebugRecordingCanvasReplayFragment.access$500(DebugRecordingCanvasReplayFragment.this);
                    throw null;
                }
                DebugRecordingCanvasReplayFragment.access$500(DebugRecordingCanvasReplayFragment.this);
                int unused = DebugRecordingCanvasReplayFragment.this.currentFrame;
                throw null;
            }
        };
        this.replayView = view;
        this.contentView.addView(view, LayoutHelper.createFrameMatchParent());
        this.playButton = new ImageButton(context);
        updatePlayButtonIcon();
        this.playButton.setBackgroundColor(0);
        this.playButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 7));
        SeekBarView seekBarView = new SeekBarView(context);
        this.seekBarView = seekBarView;
        seekBarView.setReportChanges(true);
        this.seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public final CharSequence getContentDescription() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
            }

            @Override
            public final int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public final boolean needVisuallyDivideSteps() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                DebugRecordingCanvasReplayFragment.this.stopPlayback();
                DebugRecordingCanvasReplayFragment debugRecordingCanvasReplayFragment = DebugRecordingCanvasReplayFragment.this;
                debugRecordingCanvasReplayFragment.currentFrame = Math.round(debugRecordingCanvasReplayFragment.framesCount * f);
                DebugRecordingCanvasReplayFragment.this.replayView.invalidate();
            }

            @Override
            public final void onSeekBarPressed(boolean z) {
                SeekBarView.SeekBarViewDelegate.CC.$default$onSeekBarPressed(this, z);
            }
        });
        this.seekBarView.setProgress(this.currentFrame / this.framesCount);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(this.playButton, LayoutHelper.createFrame(38, 38.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.addView(this.seekBarView, LayoutHelper.createFrame(-1, 38.0f, 16, 46.0f, 0.0f, 0.0f, 0.0f));
        this.contentView.addView(frameLayout2, LayoutHelper.createFrame(-1, 38.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
        frameLayout2.setTranslationY(-AndroidUtilities.navigationBarHeight);
        return this.fragmentView;
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        stopPlayback();
    }
}
