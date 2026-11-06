package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class p implements View.OnClickListener {
    public final int f36703a;
    public final s f36704b;

    public p(s sVar, int i7) {
        this.f36703a = i7;
        this.f36704b = sVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36703a) {
            case 0:
                this.f36704b.dismiss();
                return;
            default:
                s sVar = this.f36704b;
                TL_aicompose.AiComposeTone aiComposeTone = sVar.P1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = sVar.Z1 + 1;
                    sVar.Z1 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = sVar.f37843a2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        sVar.Z1 = 0;
                    }
                    int i10 = sVar.Z1;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(sVar.f28612a).sendRequestTyped(gettoneexample, new d3.b(1), new q(sVar, i10, 0));
                    }
                    sVar.Y1.O(true);
                    return;
                }
                return;
        }
    }
}
