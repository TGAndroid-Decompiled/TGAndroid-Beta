package org.telegram.ui.Components;

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
import org.telegram.ui.ChannelCreateActivity;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallStatusIcon;
import org.telegram.ui.Components.voip.GroupCallStatusIcon$$ExternalSyntheticLambda0;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.Stars.StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotWebViewSheet;

public final class GroupCallFullscreenAdapter extends RecyclerListView.SelectionAdapter {
    public final GroupCallActivity activity;
    public ArrayList attachedRenderers;
    public final int currentAccount;
    public ChatObject.Call groupCall;
    public GroupCallActivity.AnonymousClass28 renderersContainer;
    public final ArrayList videoParticipants = new ArrayList();
    public final ArrayList participants = new ArrayList();
    public boolean visible = false;

    public final class GroupCallUserCell extends FrameLayout implements GroupCallStatusIcon.Callback {
        public boolean attached;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarImageView;
        public final org.telegram.ui.Cells.GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable;
        public final Paint backgroundPaint;
        public ValueAnimator colorAnimator;
        public TLRPC.Chat currentChat;
        public TLRPC.User currentUser;
        public String drawingName;
        public int lastColor;
        public int lastWavesColor;
        public final ChannelCreateActivity.AnonymousClass5 muteButton;
        public String name;
        public int nameWidth;
        public TLRPC.GroupCallParticipant participant;
        public long peerId;
        public float progress;
        public GroupCallMiniTextureView renderer;
        public boolean selected;
        public final Paint selectionPaint;
        public float selectionProgress;
        public boolean skipInvalidate;
        public GroupCallStatusIcon statusIcon;
        public final TextPaint textPaint;
        public ChatObject.VideoParticipant videoParticipant;

        public GroupCallUserCell(Context context) {
            super(context);
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.avatarDrawable = avatarDrawable;
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            Paint paint2 = new Paint(1);
            this.selectionPaint = paint2;
            this.progress = 1.0f;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            this.avatarWavesDrawable = new org.telegram.ui.Cells.GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
            avatarDrawable.namePaint.setTextSize((int) (AndroidUtilities.dp(18.0f) / 1.15f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
            setWillNotDraw(false);
            paint.setColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false));
            paint2.setColor(Theme.getColor(null, Theme.key_voipgroup_speakingText, false));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            textPaint.setColor(-1);
            ChannelCreateActivity.AnonymousClass5 anonymousClass5 = new ChannelCreateActivity.AnonymousClass5(this, context, 1);
            this.muteButton = anonymousClass5;
            anonymousClass5.setScaleType(ImageView.ScaleType.CENTER);
            addView(anonymousClass5, LayoutHelper.createFrame(24.0f, 24));
        }

        private void setSelectedProgress(float f) {
            if (this.selectionProgress != f) {
                this.selectionProgress = f;
                this.selectionPaint.setAlpha((int) (f * 255.0f));
            }
        }

        public final void attachRenderer(boolean z) {
            GroupCallFullscreenAdapter groupCallFullscreenAdapter = GroupCallFullscreenAdapter.this;
            if (groupCallFullscreenAdapter.activity.isDismissed()) {
                return;
            }
            if (z && this.renderer == null) {
                this.renderer = GroupCallMiniTextureView.getOrCreate(groupCallFullscreenAdapter.attachedRenderers, groupCallFullscreenAdapter.renderersContainer, null, this, null, this.videoParticipant, groupCallFullscreenAdapter.groupCall, groupCallFullscreenAdapter.activity);
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
        public final void dispatchDraw(Canvas canvas) {
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
            BackupImageView backupImageView = this.avatarImageView;
            float x = backupImageView.getX() + (backupImageView.getMeasuredWidth() / 2);
            float y = backupImageView.getY() + (backupImageView.getMeasuredHeight() / 2);
            org.telegram.ui.Cells.GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
            avatarWavesDrawable.update();
            avatarWavesDrawable.draw(canvas, x, y, this);
            float fDp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
            float f = this.progress;
            float f2 = (f * 1.0f) + ((1.0f - f) * fDp);
            backupImageView.setScaleX(avatarWavesDrawable.getAvatarScale() * f2);
            backupImageView.setScaleY(avatarWavesDrawable.getAvatarScale() * f2);
            super.dispatchDraw(canvas);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.muteButton) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public final void drawOverlays(Canvas canvas) {
            if (this.drawingName != null) {
                canvas.save();
                int iM$2 = OKLCH.m$2(24.0f, getMeasuredWidth() - this.nameWidth, 2);
                TextPaint textPaint = this.textPaint;
                textPaint.setAlpha((int) (getAlpha() * this.progress * 255.0f));
                canvas.drawText(this.drawingName, AndroidUtilities.dp(22.0f) + iM$2, AndroidUtilities.dp(69.0f), textPaint);
                canvas.restore();
                canvas.save();
                canvas.translate(iM$2, AndroidUtilities.dp(53.0f));
                ChannelCreateActivity.AnonymousClass5 anonymousClass5 = this.muteButton;
                if (anonymousClass5.getDrawable() != null) {
                    anonymousClass5.getDrawable().setAlpha((int) (getAlpha() * this.progress * 255.0f));
                    anonymousClass5.draw(canvas);
                    anonymousClass5.getDrawable().setAlpha(255);
                }
                canvas.restore();
            }
        }

        public final void drawSelection(Canvas canvas) {
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
                Paint paint = this.selectionPaint;
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
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

        @Override
        public final void invalidate() {
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

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            GroupCallFullscreenAdapter groupCallFullscreenAdapter = GroupCallFullscreenAdapter.this;
            if (groupCallFullscreenAdapter.visible && this.videoParticipant != null) {
                attachRenderer(true);
            }
            this.attached = true;
            GroupCallActivity groupCallActivity = groupCallFullscreenAdapter.activity;
            if (groupCallActivity.statusIconPool.size() > 0) {
                this.statusIcon = (GroupCallStatusIcon) DiffUtil.m(groupCallActivity.statusIconPool);
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
            boolean z = this.statusIcon.isSpeaking;
            org.telegram.ui.Cells.GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
            avatarWavesDrawable.setShowWaves(this, z);
            if (this.statusIcon.isSpeaking) {
                return;
            }
            avatarWavesDrawable.setAmplitude(0.0d);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            attachRenderer(false);
            this.attached = false;
            GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
            if (groupCallStatusIcon != null) {
                GroupCallFullscreenAdapter.this.activity.statusIconPool.add(groupCallStatusIcon);
                GroupCallStatusIcon groupCallStatusIcon2 = this.statusIcon;
                groupCallStatusIcon2.iconView = null;
                groupCallStatusIcon2.updateIcon(false);
                GroupCallStatusIcon groupCallStatusIcon3 = this.statusIcon;
                groupCallStatusIcon3.callback = null;
                groupCallStatusIcon3.isSpeaking = false;
                AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon3.updateRunnable);
                AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon3.raiseHandCallback);
                AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon3.checkRaiseRunnable);
                groupCallStatusIcon3.micDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            }
            this.statusIcon = null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            TextPaint textPaint = this.textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            if (this.name != null) {
                int iMin = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.name));
                this.nameWidth = iMin;
                this.drawingName = TextUtils.ellipsize(this.name, textPaint, iMin, TextUtils.TruncateAt.END).toString();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        @Override
        public final void onStatusChanged() {
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

        public final void setParticipant(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
            this.videoParticipant = videoParticipant;
            this.participant = groupCallParticipant;
            long j = this.peerId;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            this.peerId = peerId;
            BackupImageView backupImageView = this.avatarImageView;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            GroupCallFullscreenAdapter groupCallFullscreenAdapter = GroupCallFullscreenAdapter.this;
            if (peerId > 0) {
                TLRPC.User user = AccountInstance.getInstance(groupCallFullscreenAdapter.currentAccount).getMessagesController().getUser(Long.valueOf(this.peerId));
                this.currentUser = user;
                this.currentChat = null;
                avatarDrawable.setInfo(groupCallFullscreenAdapter.currentAccount, user);
                this.name = UserObject.getFirstName(this.currentUser);
                backupImageView.getImageReceiver().setCurrentAccount(groupCallFullscreenAdapter.currentAccount);
                backupImageView.setImage(ImageLocation.getForUser(this.currentUser, 1), "50_50", avatarDrawable, this.currentUser);
            } else {
                TLRPC.Chat chat = AccountInstance.getInstance(groupCallFullscreenAdapter.currentAccount).getMessagesController().getChat(Long.valueOf(-this.peerId));
                this.currentChat = chat;
                this.currentUser = null;
                avatarDrawable.setInfo(groupCallFullscreenAdapter.currentAccount, chat);
                TLRPC.Chat chat2 = this.currentChat;
                if (chat2 != null) {
                    this.name = chat2.title;
                    backupImageView.getImageReceiver().setCurrentAccount(groupCallFullscreenAdapter.currentAccount);
                    backupImageView.setImage(ImageLocation.getForChat(this.currentChat, 1), "50_50", avatarDrawable, this.currentChat);
                }
            }
            boolean z = j == this.peerId;
            if (videoParticipant == null) {
                this.selected = groupCallFullscreenAdapter.renderersContainer.fullscreenPeerId == MessageObject.getPeerId(groupCallParticipant.peer);
            } else {
                ChatObject.VideoParticipant videoParticipant2 = groupCallFullscreenAdapter.renderersContainer.fullscreenParticipant;
                if (videoParticipant2 != null) {
                    this.selected = videoParticipant2.equals(videoParticipant);
                } else {
                    this.selected = false;
                }
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
            Paint paint = this.backgroundPaint;
            BackupImageView backupImageView = this.avatarImageView;
            if (f == 1.0f) {
                backupImageView.setTranslationY(0.0f);
                backupImageView.setScaleX(1.0f);
                backupImageView.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                GroupCallMiniTextureView groupCallMiniTextureView = this.renderer;
                if (groupCallMiniTextureView != null) {
                    groupCallMiniTextureView.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((backupImageView.getMeasuredHeight() / 2.0f) + backupImageView.getTop()) - (getMeasuredHeight() / 2.0f);
            float f2 = 1.0f - f;
            float fDp = (1.0f * f) + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f2);
            backupImageView.setTranslationY((-measuredHeight) * f2);
            backupImageView.setScaleX(fDp);
            backupImageView.setScaleY(fDp);
            paint.setAlpha((int) (f * 255.0f));
            invalidate();
            GroupCallMiniTextureView groupCallMiniTextureView2 = this.renderer;
            if (groupCallMiniTextureView2 != null) {
                groupCallMiniTextureView2.invalidate();
            }
        }

        public void setRenderer(GroupCallMiniTextureView groupCallMiniTextureView) {
            this.renderer = groupCallMiniTextureView;
        }

        public final void updateState(boolean z) {
            int color;
            int color2;
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
                    this.colorAnimator.addListener(new BotWebViewSheet.AnonymousClass16(this, color, color2, 1));
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
                this.colorAnimator.addListener(new BotWebViewSheet.AnonymousClass16(this, color, color2, 1));
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
    public final int getItemCount() {
        return this.participants.size() + this.videoParticipants.size();
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
        ChatObject.VideoParticipant videoParticipant2 = groupCallUserCell.videoParticipant;
        ArrayList arrayList = this.videoParticipants;
        if (i < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i)).participant;
        } else {
            int size = i - arrayList.size();
            ArrayList arrayList2 = this.participants;
            if (size >= arrayList2.size()) {
                return;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i - arrayList.size());
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
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerListView.Holder(new GroupCallUserCell(viewGroup.getContext()));
    }

    public final void setRenderersPool(ArrayList arrayList, GroupCallActivity.AnonymousClass28 anonymousClass28) {
        this.attachedRenderers = arrayList;
        this.renderersContainer = anonymousClass28;
    }

    public final void setVisibility(GroupCallActivity.AnonymousClass24 anonymousClass24, boolean z) {
        this.visible = z;
        for (int i = 0; i < anonymousClass24.getChildCount(); i++) {
            View childAt = anonymousClass24.getChildAt(i);
            if (childAt instanceof GroupCallUserCell) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) childAt;
                if (groupCallUserCell.getVideoParticipant() != null) {
                    groupCallUserCell.attachRenderer(z);
                }
            }
        }
    }

    public final void update(RecyclerListView recyclerListView, boolean z) {
        if (this.groupCall == null) {
            return;
        }
        ArrayList arrayList = this.videoParticipants;
        ArrayList arrayList2 = this.participants;
        if (!z) {
            arrayList2.clear();
            ChatObject.Call call = this.groupCall;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.groupCall;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            this.mObservable.notifyChanged();
            return;
        }
        final ArrayList arrayList3 = new ArrayList(arrayList2);
        final ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList2.clear();
        ChatObject.Call call3 = this.groupCall;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.groupCall;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        DiffUtil.calculateDiff(new DiffUtil() {
            @Override
            public final boolean areContentsTheSame(int i, int i2) {
                return true;
            }

            @Override
            public final boolean areItemsTheSame(int i, int i2) {
                ArrayList arrayList5 = arrayList4;
                int size = arrayList5.size();
                GroupCallFullscreenAdapter groupCallFullscreenAdapter = GroupCallFullscreenAdapter.this;
                if (i < size && i2 < groupCallFullscreenAdapter.videoParticipants.size()) {
                    return ((ChatObject.VideoParticipant) arrayList5.get(i)).equals(groupCallFullscreenAdapter.videoParticipants.get(i2));
                }
                int size2 = i - arrayList5.size();
                int size3 = i2 - groupCallFullscreenAdapter.videoParticipants.size();
                ArrayList arrayList6 = arrayList3;
                if (size3 < 0 || size3 >= groupCallFullscreenAdapter.participants.size() || size2 < 0 || size2 >= arrayList6.size()) {
                    return MessageObject.getPeerId((i < arrayList5.size() ? ((ChatObject.VideoParticipant) arrayList5.get(i)).participant : (TLRPC.GroupCallParticipant) arrayList6.get(size2)).peer) == MessageObject.getPeerId((i2 < groupCallFullscreenAdapter.videoParticipants.size() ? ((ChatObject.VideoParticipant) groupCallFullscreenAdapter.videoParticipants.get(i2)).participant : (TLRPC.GroupCallParticipant) groupCallFullscreenAdapter.participants.get(size3)).peer);
                }
                return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList6.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) groupCallFullscreenAdapter.participants.get(size3)).peer);
            }

            @Override
            public final int getNewListSize() {
                GroupCallFullscreenAdapter groupCallFullscreenAdapter = GroupCallFullscreenAdapter.this;
                return groupCallFullscreenAdapter.participants.size() + groupCallFullscreenAdapter.videoParticipants.size();
            }

            @Override
            public final int getOldListSize() {
                return arrayList3.size() + arrayList4.size();
            }
        }, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this, 1));
        AndroidUtilities.updateVisibleRows(recyclerListView);
    }
}
