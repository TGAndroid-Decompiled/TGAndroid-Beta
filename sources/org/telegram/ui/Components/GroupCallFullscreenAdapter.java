package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.GroupCallStatusIcon;
import org.telegram.ui.Components.voip.GroupCallStatusIcon$$ExternalSyntheticLambda0;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.Stars.StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1;

public class GroupCallFullscreenAdapter extends RecyclerListView.SelectionAdapter {
    private final GroupCallActivity activity;
    private ArrayList<GroupCallMiniTextureView> attachedRenderers;
    private final int currentAccount;
    private ChatObject.Call groupCall;
    private GroupCallRenderersContainer renderersContainer;
    private final ArrayList<ChatObject.VideoParticipant> videoParticipants = new ArrayList<>();
    private final ArrayList<TLRPC.GroupCallParticipant> participants = new ArrayList<>();
    private boolean visible = false;

    public class GroupCallUserCell extends FrameLayout implements GroupCallStatusIcon.Callback {
        boolean attached;
        AvatarDrawable avatarDrawable;
        private BackupImageView avatarImageView;
        org.telegram.ui.Cells.GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable;
        Paint backgroundPaint;
        ValueAnimator colorAnimator;
        private TLRPC.Chat currentChat;
        private TLRPC.User currentUser;
        String drawingName;
        boolean hasAvatar;
        int lastColor;
        private boolean lastMuted;
        private boolean lastRaisedHand;
        int lastWavesColor;
        RLottieImageView muteButton;
        String name;
        int nameWidth;
        TLRPC.GroupCallParticipant participant;
        long peerId;
        float progress;
        GroupCallMiniTextureView renderer;
        boolean selected;
        Paint selectionPaint;
        float selectionProgress;
        boolean skipInvalidate;
        GroupCallStatusIcon statusIcon;
        TextPaint textPaint;
        ChatObject.VideoParticipant videoParticipant;

        public GroupCallUserCell(Context context) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.backgroundPaint = new Paint(1);
            this.selectionPaint = new Paint(1);
            this.progress = 1.0f;
            this.textPaint = new TextPaint(1);
            this.avatarWavesDrawable = new org.telegram.ui.Cells.GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
            this.avatarDrawable.setTextSize((int) (AndroidUtilities.dp(18.0f) / 1.15f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(this.avatarImageView, LayoutHelper.createFrame(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
            setWillNotDraw(false);
            this.backgroundPaint.setColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false));
            this.selectionPaint.setColor(Theme.getColor(null, Theme.key_voipgroup_speakingText, false));
            this.selectionPaint.setStyle(Paint.Style.STROKE);
            this.selectionPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.textPaint.setColor(-1);
            RLottieImageView rLottieImageView = new RLottieImageView(context) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    GroupCallUserCell.this.invalidate();
                }
            };
            this.muteButton = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.muteButton, LayoutHelper.createFrame(24, 24.0f));
        }

        private void drawSelection(Canvas canvas) {
            float f;
            float f2;
            boolean z = this.selected;
            if (z) {
                float f3 = this.selectionProgress;
                if (f3 != 1.0f) {
                    float f4 = f3 + 0.10666667f;
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    } else {
                        invalidate();
                    }
                    setSelectedProgress(f4);
                } else if (!z) {
                    f = this.selectionProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.10666667f;
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        } else {
                            invalidate();
                        }
                        setSelectedProgress(f2);
                    }
                }
            } else if (!z) {
                f = this.selectionProgress;
                if (f != 0.0f) {
                    f2 = f - 0.10666667f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    } else {
                        invalidate();
                    }
                    setSelectedProgress(f2);
                }
            }
            if (this.selectionProgress > 0.0f) {
                float measuredWidth = (1.0f - this.progress) * (getMeasuredWidth() / 2.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                rectF.inset(this.selectionPaint.getStrokeWidth() / 2.0f, this.selectionPaint.getStrokeWidth() / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.selectionPaint);
            }
        }

        public void lambda$updateState$0(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            this.lastColor = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), i, i2);
            this.lastWavesColor = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), i3, i4);
            this.muteButton.setColorFilter(new PorterDuffColorFilter(this.lastColor, PorterDuff.Mode.MULTIPLY));
            this.textPaint.setColor(this.lastColor);
            this.selectionPaint.setColor(this.lastWavesColor);
            this.avatarWavesDrawable.setColor(ColorUtils.setAlphaComponent(this.lastWavesColor, 38));
            invalidate();
        }

        private void setSelectedProgress(float f) {
            if (this.selectionProgress != f) {
                this.selectionProgress = f;
                this.selectionPaint.setAlpha((int) (f * 255.0f));
            }
        }

        public void attachRenderer(boolean z) {
            if (GroupCallFullscreenAdapter.this.activity.isDismissed()) {
                return;
            }
            if (z && this.renderer == null) {
                this.renderer = GroupCallMiniTextureView.getOrCreate(GroupCallFullscreenAdapter.this.attachedRenderers, GroupCallFullscreenAdapter.this.renderersContainer, null, this, null, this.videoParticipant, GroupCallFullscreenAdapter.this.groupCall, GroupCallFullscreenAdapter.this.activity);
            } else {
                if (z) {
                    return;
                }
                GroupCallMiniTextureView groupCallMiniTextureView = this.renderer;
                if (groupCallMiniTextureView != null) {
                    groupCallMiniTextureView.setSecondaryView(null);
                }
                this.renderer = null;
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            GroupCallMiniTextureView groupCallMiniTextureView = this.renderer;
            if (groupCallMiniTextureView != null && !groupCallMiniTextureView.showingInFullscreen && !groupCallMiniTextureView.animateToFullscreen && groupCallMiniTextureView.attached && groupCallMiniTextureView.textureView.renderer.isFirstFrameRendered() && groupCallMiniTextureView.getAlpha() == 1.0f && !GroupCallFullscreenAdapter.this.activity.drawingForBlur) {
                drawSelection(canvas);
                return;
            }
            if (this.progress > 0.0f) {
                float measuredWidth = (1.0f - this.progress) * (getMeasuredWidth() / 2.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.backgroundPaint);
                drawSelection(canvas);
            }
            float x = this.avatarImageView.getX() + (this.avatarImageView.getMeasuredWidth() / 2);
            float y = this.avatarImageView.getY() + (this.avatarImageView.getMeasuredHeight() / 2);
            this.avatarWavesDrawable.update();
            this.avatarWavesDrawable.draw(canvas, this, x, y);
            float fDp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
            float f = this.progress;
            float f2 = (f * 1.0f) + ((1.0f - f) * fDp);
            this.avatarImageView.setScaleX(this.avatarWavesDrawable.getAvatarScale() * f2);
            this.avatarImageView.setScaleY(this.avatarWavesDrawable.getAvatarScale() * f2);
            super.dispatchDraw(canvas);
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.muteButton) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public void drawOverlays(Canvas canvas) {
            if (this.drawingName != null) {
                canvas.save();
                int iM$2 = OKLCH.m$2(24.0f, getMeasuredWidth() - this.nameWidth, 2);
                this.textPaint.setAlpha((int) (getAlpha() * this.progress * 255.0f));
                canvas.drawText(this.drawingName, AndroidUtilities.dp(22.0f) + iM$2, AndroidUtilities.dp(69.0f), this.textPaint);
                canvas.restore();
                canvas.save();
                canvas.translate(iM$2, AndroidUtilities.dp(53.0f));
                if (this.muteButton.getDrawable() != null) {
                    this.muteButton.getDrawable().setAlpha((int) (getAlpha() * this.progress * 255.0f));
                    this.muteButton.draw(canvas);
                    this.muteButton.getDrawable().setAlpha(255);
                }
                canvas.restore();
            }
        }

        public BackupImageView getAvatarImageView() {
            return this.avatarImageView;
        }

        public TLRPC.GroupCallParticipant getParticipant() {
            return this.participant;
        }

        public long getPeerId() {
            return this.peerId;
        }

        public float getProgressToFullscreen() {
            return this.progress;
        }

        public GroupCallMiniTextureView getRenderer() {
            return this.renderer;
        }

        public ChatObject.VideoParticipant getVideoParticipant() {
            return this.videoParticipant;
        }

        public boolean hasImage() {
            GroupCallMiniTextureView groupCallMiniTextureView = this.renderer;
            return groupCallMiniTextureView != null && groupCallMiniTextureView.textureView.stubVisibleProgress == 1.0f;
        }

        @Override
        public void invalidate() {
            if (this.skipInvalidate) {
                return;
            }
            this.skipInvalidate = true;
            super.invalidate();
            GroupCallMiniTextureView groupCallMiniTextureView = this.renderer;
            if (groupCallMiniTextureView != null) {
                groupCallMiniTextureView.invalidate();
            } else {
                GroupCallFullscreenAdapter.this.renderersContainer.invalidate();
            }
            this.skipInvalidate = false;
        }

        public boolean isRemoving(RecyclerListView recyclerListView) {
            return recyclerListView.getChildAdapterPosition(this) == -1;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (GroupCallFullscreenAdapter.this.visible && this.videoParticipant != null) {
                attachRenderer(true);
            }
            this.attached = true;
            if (GroupCallFullscreenAdapter.this.activity.statusIconPool.size() > 0) {
                this.statusIcon = GroupCallFullscreenAdapter.this.activity.statusIconPool.remove(GroupCallFullscreenAdapter.this.activity.statusIconPool.size() - 1);
            } else {
                this.statusIcon = new GroupCallStatusIcon();
            }
            GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
            groupCallStatusIcon.callback = this;
            groupCallStatusIcon.iconView = this.muteButton;
            groupCallStatusIcon.updateIcon(false);
            GroupCallStatusIcon groupCallStatusIcon2 = this.statusIcon;
            groupCallStatusIcon2.participant = this.participant;
            groupCallStatusIcon2.updateIcon(false);
            updateState(false);
            this.avatarWavesDrawable.setShowWaves(this, this.statusIcon.isSpeaking);
            if (this.statusIcon.isSpeaking) {
                return;
            }
            this.avatarWavesDrawable.setAmplitude(0.0d);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            attachRenderer(false);
            this.attached = false;
            if (this.statusIcon != null) {
                GroupCallFullscreenAdapter.this.activity.statusIconPool.add(this.statusIcon);
                GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
                groupCallStatusIcon.iconView = null;
                groupCallStatusIcon.updateIcon(false);
                GroupCallStatusIcon groupCallStatusIcon2 = this.statusIcon;
                groupCallStatusIcon2.callback = null;
                groupCallStatusIcon2.isSpeaking = false;
                AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon2.updateRunnable);
                AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon2.raiseHandCallback);
                AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon2.checkRaiseRunnable);
                groupCallStatusIcon2.micDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            }
            this.statusIcon = null;
        }

        @Override
        public void onMeasure(int i, int i2) {
            this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            if (this.name != null) {
                int iMin = (int) Math.min(AndroidUtilities.dp(46.0f), this.textPaint.measureText(this.name));
                this.nameWidth = iMin;
                this.drawingName = TextUtils.ellipsize(this.name, this.textPaint, iMin, TextUtils.TruncateAt.END).toString();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        @Override
        public void onStatusChanged() {
            this.avatarWavesDrawable.setShowWaves(this, this.statusIcon.isSpeaking);
            updateState(true);
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
        }

        public void setAmplitude(double d) {
            GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
            if (groupCallStatusIcon != null && d > 1.5d) {
                boolean z = groupCallStatusIcon.updateRunnableScheduled;
                GroupCallStatusIcon$$ExternalSyntheticLambda0 groupCallStatusIcon$$ExternalSyntheticLambda0 = groupCallStatusIcon.updateRunnable;
                if (z) {
                    AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon$$ExternalSyntheticLambda0);
                }
                if (!groupCallStatusIcon.isSpeaking) {
                    groupCallStatusIcon.isSpeaking = true;
                    ?? r1 = groupCallStatusIcon.callback;
                    if (r1 != 0) {
                        r1.onStatusChanged();
                    }
                }
                AndroidUtilities.runOnUIThread(groupCallStatusIcon$$ExternalSyntheticLambda0, 500L);
                groupCallStatusIcon.updateRunnableScheduled = true;
            }
            this.avatarWavesDrawable.setAmplitude(d);
        }

        public void setParticipant(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
            this.videoParticipant = videoParticipant;
            this.participant = groupCallParticipant;
            long j = this.peerId;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            this.peerId = peerId;
            if (peerId > 0) {
                this.currentUser = AccountInstance.getInstance(GroupCallFullscreenAdapter.this.currentAccount).getMessagesController().getUser(Long.valueOf(this.peerId));
                this.currentChat = null;
                this.avatarDrawable.setInfo(GroupCallFullscreenAdapter.this.currentAccount, this.currentUser);
                this.name = UserObject.getFirstName(this.currentUser);
                this.avatarImageView.getImageReceiver().setCurrentAccount(GroupCallFullscreenAdapter.this.currentAccount);
                ImageLocation forUser = ImageLocation.getForUser(this.currentUser, 1);
                this.hasAvatar = forUser != null;
                this.avatarImageView.setImage(forUser, "50_50", this.avatarDrawable, this.currentUser);
            } else {
                this.currentChat = AccountInstance.getInstance(GroupCallFullscreenAdapter.this.currentAccount).getMessagesController().getChat(Long.valueOf(-this.peerId));
                this.currentUser = null;
                this.avatarDrawable.setInfo(GroupCallFullscreenAdapter.this.currentAccount, this.currentChat);
                TLRPC.Chat chat = this.currentChat;
                if (chat != null) {
                    this.name = chat.title;
                    this.avatarImageView.getImageReceiver().setCurrentAccount(GroupCallFullscreenAdapter.this.currentAccount);
                    ImageLocation forChat = ImageLocation.getForChat(this.currentChat, 1);
                    this.hasAvatar = forChat != null;
                    this.avatarImageView.setImage(forChat, "50_50", this.avatarDrawable, this.currentChat);
                }
            }
            boolean z = j == this.peerId;
            if (videoParticipant == null) {
                this.selected = GroupCallFullscreenAdapter.this.renderersContainer.fullscreenPeerId == MessageObject.getPeerId(groupCallParticipant.peer);
            } else if (GroupCallFullscreenAdapter.this.renderersContainer.fullscreenParticipant != null) {
                this.selected = GroupCallFullscreenAdapter.this.renderersContainer.fullscreenParticipant.equals(videoParticipant);
            } else {
                this.selected = false;
            }
            if (!z) {
                setSelectedProgress(this.selected ? 1.0f : 0.0f);
            }
            GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
            if (groupCallStatusIcon != null) {
                groupCallStatusIcon.participant = groupCallParticipant;
                groupCallStatusIcon.updateIcon(z);
                updateState(z);
            }
        }

        public void setProgressToFullscreen(float f) {
            if (this.progress == f) {
                return;
            }
            this.progress = f;
            if (f == 1.0f) {
                this.avatarImageView.setTranslationY(0.0f);
                this.avatarImageView.setScaleX(1.0f);
                this.avatarImageView.setScaleY(1.0f);
                this.backgroundPaint.setAlpha(255);
                invalidate();
                GroupCallMiniTextureView groupCallMiniTextureView = this.renderer;
                if (groupCallMiniTextureView != null) {
                    groupCallMiniTextureView.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((this.avatarImageView.getMeasuredHeight() / 2.0f) + this.avatarImageView.getTop()) - (getMeasuredHeight() / 2.0f);
            float f2 = 1.0f - f;
            float fDp = (1.0f * f) + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f2);
            this.avatarImageView.setTranslationY((-measuredHeight) * f2);
            this.avatarImageView.setScaleX(fDp);
            this.avatarImageView.setScaleY(fDp);
            this.backgroundPaint.setAlpha((int) (f * 255.0f));
            invalidate();
            GroupCallMiniTextureView groupCallMiniTextureView2 = this.renderer;
            if (groupCallMiniTextureView2 != null) {
                groupCallMiniTextureView2.invalidate();
            }
        }

        public void setRenderer(GroupCallMiniTextureView groupCallMiniTextureView) {
            this.renderer = groupCallMiniTextureView;
        }

        public void updateState(boolean z) {
            final int color;
            final int color2;
            int color3;
            ValueAnimator valueAnimator;
            GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
            if (groupCallStatusIcon == null) {
                return;
            }
            groupCallStatusIcon.updateIcon(z);
            GroupCallStatusIcon groupCallStatusIcon2 = this.statusIcon;
            if (!groupCallStatusIcon2.mutedByMe) {
                if (groupCallStatusIcon2.isSpeaking) {
                    color3 = Theme.getColor(null, Theme.key_voipgroup_speakingText, false);
                } else {
                    color = Theme.getColor(null, Theme.key_voipgroup_nameText, false);
                    color2 = Theme.getColor(null, Theme.key_voipgroup_listeningText, false);
                }
                if (!z) {
                    int i = this.lastColor;
                    int i2 = this.lastWavesColor;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.colorAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1(this, i, color, i2, color2, 1));
                    this.colorAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            GroupCallUserCell groupCallUserCell = GroupCallUserCell.this;
                            groupCallUserCell.lastColor = color;
                            groupCallUserCell.lastWavesColor = color2;
                            groupCallUserCell.muteButton.setColorFilter(new PorterDuffColorFilter(GroupCallUserCell.this.lastColor, PorterDuff.Mode.MULTIPLY));
                            GroupCallUserCell groupCallUserCell2 = GroupCallUserCell.this;
                            groupCallUserCell2.textPaint.setColor(groupCallUserCell2.lastColor);
                            GroupCallUserCell groupCallUserCell3 = GroupCallUserCell.this;
                            groupCallUserCell3.selectionPaint.setColor(groupCallUserCell3.lastWavesColor);
                            GroupCallUserCell groupCallUserCell4 = GroupCallUserCell.this;
                            groupCallUserCell4.avatarWavesDrawable.setColor(ColorUtils.setAlphaComponent(groupCallUserCell4.lastWavesColor, 38));
                        }
                    });
                    this.colorAnimator.start();
                    return;
                }
                valueAnimator = this.colorAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.colorAnimator.cancel();
                }
                this.lastColor = color;
                this.lastWavesColor = color2;
                this.muteButton.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                this.textPaint.setColor(this.lastColor);
                this.selectionPaint.setColor(color2);
                this.avatarWavesDrawable.setColor(ColorUtils.setAlphaComponent(color2, 38));
                invalidate();
            }
            color3 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminIcon, false);
            color = color3;
            color2 = color;
            if (!z) {
                int i3 = this.lastColor;
                int i4 = this.lastWavesColor;
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.colorAnimator = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1(this, i3, color, i4, color2, 1));
                this.colorAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        GroupCallUserCell groupCallUserCell = GroupCallUserCell.this;
                        groupCallUserCell.lastColor = color;
                        groupCallUserCell.lastWavesColor = color2;
                        groupCallUserCell.muteButton.setColorFilter(new PorterDuffColorFilter(GroupCallUserCell.this.lastColor, PorterDuff.Mode.MULTIPLY));
                        GroupCallUserCell groupCallUserCell2 = GroupCallUserCell.this;
                        groupCallUserCell2.textPaint.setColor(groupCallUserCell2.lastColor);
                        GroupCallUserCell groupCallUserCell3 = GroupCallUserCell.this;
                        groupCallUserCell3.selectionPaint.setColor(groupCallUserCell3.lastWavesColor);
                        GroupCallUserCell groupCallUserCell4 = GroupCallUserCell.this;
                        groupCallUserCell4.avatarWavesDrawable.setColor(ColorUtils.setAlphaComponent(groupCallUserCell4.lastWavesColor, 38));
                    }
                });
                this.colorAnimator.start();
                return;
            }
            valueAnimator = this.colorAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.colorAnimator.cancel();
            }
            this.lastColor = color;
            this.lastWavesColor = color2;
            this.muteButton.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            this.textPaint.setColor(this.lastColor);
            this.selectionPaint.setColor(color2);
            this.avatarWavesDrawable.setColor(ColorUtils.setAlphaComponent(color2, 38));
            invalidate();
        }
    }

    public GroupCallFullscreenAdapter(ChatObject.Call call, int i, GroupCallActivity groupCallActivity) {
        this.groupCall = call;
        this.currentAccount = i;
        this.activity = groupCallActivity;
    }

    @Override
    public int getItemCount() {
        return this.participants.size() + this.videoParticipants.size();
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
        ChatObject.VideoParticipant videoParticipant2 = groupCallUserCell.videoParticipant;
        if (i < this.videoParticipants.size()) {
            videoParticipant = this.videoParticipants.get(i);
            groupCallParticipant = this.videoParticipants.get(i).participant;
        } else {
            if (i - this.videoParticipants.size() >= this.participants.size()) {
                return;
            }
            groupCallParticipant = this.participants.get(i - this.videoParticipants.size());
            videoParticipant = null;
        }
        groupCallUserCell.setParticipant(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && groupCallUserCell.attached && groupCallUserCell.getRenderer() != null) {
            groupCallUserCell.attachRenderer(false);
            if (videoParticipant != null) {
                groupCallUserCell.attachRenderer(true);
                return;
            }
            return;
        }
        if (groupCallUserCell.attached) {
            if (groupCallUserCell.getRenderer() == null && videoParticipant != null && this.visible) {
                groupCallUserCell.attachRenderer(true);
            } else {
                if (groupCallUserCell.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                groupCallUserCell.attachRenderer(false);
            }
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerListView.Holder(new GroupCallUserCell(viewGroup.getContext()));
    }

    public void scrollTo(ChatObject.VideoParticipant videoParticipant, RecyclerListView recyclerListView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerListView.getLayoutManager();
        if (linearLayoutManager == null) {
            return;
        }
        for (int i = 0; i < this.videoParticipants.size(); i++) {
            if (this.videoParticipants.get(i).equals(videoParticipant)) {
                linearLayoutManager.scrollToPositionWithOffset(i, AndroidUtilities.dp(13.0f));
                return;
            }
        }
    }

    public void setGroupCall(ChatObject.Call call) {
        this.groupCall = call;
    }

    public void setRenderersPool(ArrayList<GroupCallMiniTextureView> arrayList, GroupCallRenderersContainer groupCallRenderersContainer) {
        this.attachedRenderers = arrayList;
        this.renderersContainer = groupCallRenderersContainer;
    }

    public void setVisibility(RecyclerListView recyclerListView, boolean z) {
        this.visible = z;
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            View childAt = recyclerListView.getChildAt(i);
            if (childAt instanceof GroupCallUserCell) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) childAt;
                if (groupCallUserCell.getVideoParticipant() != null) {
                    groupCallUserCell.attachRenderer(z);
                }
            }
        }
    }

    public void update(boolean z, RecyclerListView recyclerListView) {
        if (this.groupCall == null) {
            return;
        }
        if (!z) {
            this.participants.clear();
            ChatObject.Call call = this.groupCall;
            if (!call.call.rtmp_stream) {
                this.participants.addAll(call.visibleParticipants);
            }
            this.videoParticipants.clear();
            ChatObject.Call call2 = this.groupCall;
            if (!call2.call.rtmp_stream) {
                this.videoParticipants.addAll(call2.visibleVideoParticipants);
            }
            notifyDataSetChanged();
            return;
        }
        final ArrayList arrayList = new ArrayList(this.participants);
        final ArrayList arrayList2 = new ArrayList(this.videoParticipants);
        this.participants.clear();
        ChatObject.Call call3 = this.groupCall;
        if (!call3.call.rtmp_stream) {
            this.participants.addAll(call3.visibleParticipants);
        }
        this.videoParticipants.clear();
        ChatObject.Call call4 = this.groupCall;
        if (!call4.call.rtmp_stream) {
            this.videoParticipants.addAll(call4.visibleVideoParticipants);
        }
        DiffUtil.calculateDiff(new DiffUtil.Callback() {
            @Override
            public boolean areContentsTheSame(int i, int i2) {
                return true;
            }

            @Override
            public boolean areItemsTheSame(int i, int i2) {
                if (i < arrayList2.size() && i2 < GroupCallFullscreenAdapter.this.videoParticipants.size()) {
                    return ((ChatObject.VideoParticipant) arrayList2.get(i)).equals(GroupCallFullscreenAdapter.this.videoParticipants.get(i2));
                }
                int size = i - arrayList2.size();
                int size2 = i2 - GroupCallFullscreenAdapter.this.videoParticipants.size();
                if (size2 < 0 || size2 >= GroupCallFullscreenAdapter.this.participants.size() || size < 0 || size >= arrayList.size()) {
                    return MessageObject.getPeerId((i < arrayList2.size() ? ((ChatObject.VideoParticipant) arrayList2.get(i)).participant : (TLRPC.GroupCallParticipant) arrayList.get(size)).peer) == MessageObject.getPeerId((i2 < GroupCallFullscreenAdapter.this.videoParticipants.size() ? ((ChatObject.VideoParticipant) GroupCallFullscreenAdapter.this.videoParticipants.get(i2)).participant : (TLRPC.GroupCallParticipant) GroupCallFullscreenAdapter.this.participants.get(size2)).peer);
                }
                return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList.get(size)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) GroupCallFullscreenAdapter.this.participants.get(size2)).peer);
            }

            @Override
            public int getNewListSize() {
                return GroupCallFullscreenAdapter.this.participants.size() + GroupCallFullscreenAdapter.this.videoParticipants.size();
            }

            @Override
            public int getOldListSize() {
                return arrayList.size() + arrayList2.size();
            }
        }, true).dispatchUpdatesTo(new OpReorderer(this));
        AndroidUtilities.updateVisibleRows(recyclerListView);
    }
}
